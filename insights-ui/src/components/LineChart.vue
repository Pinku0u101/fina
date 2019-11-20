<script>
  //Importing Line class from the vue-chartjs wrapper
  import { Line, mixins } from 'vue-chartjs'
  const { reactiveProp } = mixins;

  //Exporting this so it can be used in other components
  export default 
  {
        extends: Line,
        mixins: [reactiveProp],
        props:{
            chartData:{
                type: Object,
                default: null
            },
            options: {
                type: Object,
                default: null
            }
        },
        mounted(){
            this.renderChart(this.chartData, this.options)
        }
  }
</script>