<template>
    <div class="sngc">
        <h2 class="titlebar" >Insights</h2>
        <div class="tabClass">
            <div class="tabHeading">
                <button class="liClass" v-for="(tab, index) in tabs" @click="currentTab = index"> {{ tab }} </button>                
            </div> <br/><br/>

            <div class="tabContent">

            <div v-show="currentTab === 0" > 

            <table>
                    <tr>
                        <th>Name</th>
                        <th>Occupation</th>
                        <th>College</th>
                        <th>Education</th>
                    </tr>

                    <tr>
                    <td v-for="user in userDetails1">{{ user }}</td>
                    </tr>
                    <tr>
                    <td v-for="user1 in userDetails2">{{ user1 }}</td>
                    </tr>
                    <tr>
                    <td colspan="4"> test ran at {{ new Date().toLocaleString() }} </td>
                    </tr>
                    <tr>
                    <td colspan="4"> test ran by {{ userName1 }} </td>
                    </tr>
                </table>
                
             </div>


            <div v-show="currentTab === 1" > 

            <div>
            <apexchart type=bar width=700 :options="chartOptionsDay" :series="seriesDayMon1" />
            <apexchart type=bar width=700 :options="chartOptionsDay" :series="seriesDayMon2" />

            <apexchart type=bar width=700 :options="chartOptionsDay2" :series="seriesDayTue1" />
            <apexchart type=bar width=700 :options="chartOptionsDay2" :series="seriesDayTue2" />

            <apexchart type=bar width=700 :options="chartOptionsDay3" :series="seriesDayWed1" />
            <apexchart type=bar width=700 :options="chartOptionsDay3" :series="seriesDayWed2" />

            <apexchart type=bar width=700 :options="chartOptionsDay4" :series="seriesDayThu1" />
            <apexchart type=bar width=700 :options="chartOptionsDay4" :series="seriesDayThu2" />

            <apexchart type=bar width=700 :options="chartOptionsDay5" :series="seriesDayFri1" />
            <apexchart type=bar width=700 :options="chartOptionsDay5" :series="seriesDayFri2" />

            <apexchart type=bar width=700 :options="chartOptionsDay6" :series="seriesDaySat1" />
            <apexchart type=bar width=700 :options="chartOptionsDay6" :series="seriesDaySat2" />

            <apexchart type=bar width=700 :options="chartOptionsDay7" :series="seriesDaySun1" />
            <apexchart type=bar width=700 :options="chartOptionsDay7" :series="seriesDaySun2" />

            </div>

            <div>
            <apexchart type=donut width='100%' :options="chartOptionsDonut1" :series="seriesDonutUser1" />
            <apexchart type=pie width='100%' :options="chartOptionsDonut2" :series="seriesDonutUser2" />
            </div>


            </div>

            
            <div v-show="currentTab === 2" > 

            <apexchart type=line width=700 :options="chartOptionsWeek" :series="seriesRW" />
            
            <apexchart type=line width=700 :options="chartOptionsWeek" :series="seriesStudy" />

            <apexchart type=area width=700 :options="chartOptionsWeek" :series="seriesEntertainment" />

            <apexchart type=bar width=700 height=300 :options="chartOptionsWeek" :series="seriesRelaxation" />

             </div>


            <div v-show="currentTab === 3" > 
            <h2> General Interests of Users </h2>
                <table>
                    <tr>
                        <th>Name:</th>
                        <td>{{ userName1 }}</td>
                        <td>{{ userName2 }}</td>
                    </tr>
                    <tr>
                        <th>Favourite Music:</th>
                        <td>{{ favouriteMusic1 }}</td>
                        <td>{{ favouriteMusic2 }}</td>
                    </tr>
                    <tr>
                        <th>Favourite Cuisine:</th>
                        <td>{{ favouriteCuisine1 }}</td>
                        <td>{{ favouriteCuisine2 }}</td>
                    </tr>
                    <tr>
                        <th>Favourite Movies:</th>
                        <td>{{ favouriteMovies1 }}</td>
                        <td>{{ favouriteMovies2 }}</td>
                    </tr>
                    <tr>
                        <th>Lives In:</th>
                        <td>{{ livesIn1 }}</td>
                        <td>{{ livesIn2 }}</td>
                    </tr>
                    <tr>
                        <th>SSLC Marks:</th>
                        <td>{{ sslcMarks1 }}</td>
                        <td>{{ sslcMarks2 }}</td>
                    </tr>
                    <tr>
                        <th>Plus 2 Marks:</th>
                        <td>{{ plusTwoMarks1 }}</td>
                        <td>{{ plusTwoMarks2 }}</td>
                    </tr>
                    <tr>
                        <th>Degree Marks:</th>
                        <td>{{ degreeMarks1 }}</td>
                        <td>{{ degreeMarks2 }}</td>
                    </tr>

                    <tr>
                        <th>Amition:</th>
                        <td>{{ wantToBecome1 }}</td>
                        <td>{{ wantToBecome2 }}</td>
                    </tr>

                    <tr>
                        <th>Languages Known:</th>
                        <td>{{ knowsLanguages1 }}</td>
                        <td>{{ knowsLanguages2 }}</td>
                    </tr>
                </table>

            
            </div>

            <div v-show="currentTab === 4" > 
            <table colspan="5">

            <tr v-for="Analysys1 in Analysys"><td style="background-color: green">{{ Analysys1 }}</td></tr>

            </table>

            <table colspan="5" style="margin-top:30px">

            <tr v-for="mark in Marks"><td style="background-color: lightred">{{ mark }}</td></tr>

            </table>

            <table colspan="5" style="margin-top:30px">

            <tr><th>Some suggestions to achieve your Ambition</th></tr>

            <tr v-for="sug in wantToBecomeSuggestions"><td style="background-color: olive">{{ sug }}</td></tr>

            </table>

            <table colspan="5" style="margin-top:30px">

            <tr><th>Some Useful links for preparation</th></tr>
            
            <tr v-for="link in wantToBecomeLinks"><td style="background-color: lightblue"><a :href="link" target="_blank">{{link}}</a></td></tr>

            </tr>
            </table>
            </div>
            </div>

        </div>



    </div>
</template>

<script>

    export default {
        name : 'tabs',
        data(){
            return{
                currentTab: 0,
                tabs: ['Summary', 'A Day', 'A Week', 'Interests', 'Insights'],

                userDetails1: [],
                userDetails2: [],
                Analysys: [],
                wantToBecomeSuggestions: [],
                wantToBecomeLinks: [],
                Marks: [],
                userName1: '',
                userName2: '',
                favouriteMusic1: '',
                favouriteMusic2: '',
                favouriteCuisine1: '',
                favouriteCuisine2: '',
                favouriteMovies1: '',
                favouriteMovies2: '',
                livesIn1: '',
                livesIn2: '',
                sslcMarks1: '',
                sslcMarks2: '',
                plusTwoMarks1: '',
                plusTwoMarks2:'',
                degreeMarks1: '',
                degreeMarks2: '',
                wantToBecome1: '',
                wantToBecome2: '',
                knowsLanguages1: '',
                knowsLanguages2: '',



                options: {
                    chart: {
                    id: 'vuechart-example'
                    },
                    xaxis: {
                    categories: [1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998]
                    }
                } ,
               
                series: [{
                    name: 'frrr-1',
                    data: [30, 40, 45, 50, 49, 60, 70, 91]
                }],

            //DAILY ACTIVITIES --- START

                seriesDayMon1: [{
                    name: '',
                    data: []
                }],
                seriesDayMon2: [{
                    name: '',
                    data: []
                }],
                seriesDayTue1: [{
                    name: '',
                    data: []
                }],
                seriesDayTue2: [{
                    name: '',
                    data: []
                }],
                seriesDayWed1: [{
                    name: '',
                    data: []
                }],
                seriesDayWed2: [{
                    name: '',
                    data: []
                }],
                seriesDayThu1: [{
                    name: '',
                    data: []
                }],
                seriesDayThu2: [{
                    name: '',
                    data: []
                }],
                seriesDayFri1: [{
                    name: '',
                    data: []
                }],
                seriesDayFri2: [{
                    name: '',
                    data: []
                }],
                seriesDaySat1: [{
                    name: '',
                    data: []
                }],
                seriesDaySat2: [{
                    name: '',
                    data: []
                }],
                seriesDaySun1: [{
                    name: '',
                    data: []
                }],
                seriesDaySun2: [{
                    name: '',
                    data: []
                }],

                seriesDonutUser1: [],

                seriesDonutUser2: [],

            //DAILY ACTIVITIES --- END


            //WEEKLY ACTIVITIES --- START

                seriesRW:[
                    //READING
                    {
                    name: '',
                    data:[]
                    },
                    {
                        name: '',
                        data:[]
                    },
                //WRITING

                    {
                        name: '',
                        data:[]
                    },
                    {
                        name: '',
                        data:[]
                    }
                ],

                seriesStudy:[
                    //READING
                    {
                    name: '',
                    data:[]
                    },
                    {
                        name: '',
                        data:[]
                    },
                //WRITING

                    {
                        name: '',
                        data:[]
                    },
                    {
                        name: '',
                        data:[]
                    }
                ],

                //Games and tv
                seriesEntertainment:[
                    //Games
                    {
                    name: '',
                    data:[]
                    },
                    {
                        name: '',
                        data:[]
                    },
                //Watching Tv - Entertainment programs

                    {
                        name: '',
                        data:[]
                    },
                    {
                        name: '',
                        data:[]
                    }
                ],

                seriesRelaxation:[
                    //Games
                    {
                    name: '',
                    data:[]
                    },
                    {
                        name: '',
                        data:[]
                    },
                //Watching Tv - Entertainment programs

                    {
                        name: '',
                        data:[]
                    },
                    {
                        name: '',
                        data:[]
                    }
                ],
            //WEEKLY ACTIVITIES --- END


                chartOptionsDonut1: {
                    labels: [],
                    dataLabels: {
            dropShadow: {
              blur: 3,
              opacity: 0.8
            }
          },
                        responsive: [{
                        breakpoint: 480,
                        options: {
                        chart: {
                            width: 500
                        },
                        legend: {
                            position: 'bottom'
                        }
                        }
          }]
        },

        chartOptionsDonut2: {
                    labels: [],
                    dataLabels: {
            dropShadow: {
              blur: 3,
              opacity: 0.8
            }
          },
                        responsive: [{
                        breakpoint: 480,
                        options: {
                        chart: {
                            width: 500
                        },
                        legend: {
                            position: 'bottom'
                        }
                        }
          }]
        },


        chartOptionsWeek:{   
          chart: {
              height:300,
                zoom: {
                    enabled: false
                }
            },
            dataLabels: {
                enabled: false,
                rotate: -45,
            rotateAlways: false,
            hideOverlappingLabels: true,
            showDuplicates: false
            },
            stroke: {
                curve: 'smooth' 
            },
            title: {
                text: 'Time Spending by Week',
                align: 'left'
            },
            grid: {
                row: {
                    colors: ['#f3f3f3', 'transparent'], // takes an array which will be repeated on columns
                    opacity: 0.5
                },
            },
            xaxis: {
                categories: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun'],
            }
        },

        chartOptionsDay:{ 
            plotOptions: {
            bar: {
              horizontal: false,
              columnWidth: '55%',
              endingShape: 'rounded'	
            },
          },  
          chart: {
                zoom: {
                    enabled: false
                }
            },
            dataLabels: {
                enabled: false
            },
            stroke: {
                curve: 'smooth'
            },
            title: {
                text: 'Monday',
                align: 'left'
            },
            colors: ['#008080'],
            grid: {
                row: {
                    colors: ['#f3f3f3', 'transparent'], // takes an array which will be repeated on columns
                    opacity: 0.5
                },
            },
            xaxis: {
                categories: [],
            }
        },

        chartOptionsDay2:{ 
            plotOptions: {
            bar: {
              horizontal: false,
              columnWidth: '55%',
              endingShape: 'rounded'	
            },
          },  
          chart: {
                zoom: {
                    enabled: false
                }
            },
            dataLabels: {
                enabled: false
            },
            stroke: {
                curve: 'smooth'
            },
            title: {
                text: 'Tuesday',
                align: 'left'
            },
            colors: ['#800080'],
            grid: {
                row: {
                    colors: ['#f3f3f3', 'transparent'], // takes an array which will be repeated on columns
                    opacity: 0.5
                },
            },
            xaxis: {
                categories: [],
            }
        },
        chartOptionsDay3:{ 
            plotOptions: {
            bar: {
              horizontal: false,
              columnWidth: '55%',
              endingShape: 'rounded'	
            },
          },  
          chart: {
                zoom: {
                    enabled: false
                }
            },
            dataLabels: {
                enabled: false
            },
            stroke: {
                curve: 'smooth'
            },
            title: {
                text: 'Wednesday',
                align: 'left'
            },
            colors: ['#800000'],
            grid: {
                row: {
                    colors: ['#f3f3f3', 'transparent'], // takes an array which will be repeated on columns
                    opacity: 0.5
                },
            },
            xaxis: {
                categories: [],
            }
        },
        chartOptionsDay4:{ 
            plotOptions: {
            bar: {
              horizontal: false,
              columnWidth: '55%',
              endingShape: 'rounded'	
            },
          },  
          chart: {
                zoom: {
                    enabled: false
                }
            },
            dataLabels: {
                enabled: false
            },
            stroke: {
                curve: 'smooth'
            },
            title: {
                text: 'Thursday',
                align: 'left'
            },
            colors: ['#C0C0C0'],
            grid: {
                row: {
                    colors: ['#f3f3f3', 'transparent'], // takes an array which will be repeated on columns
                    opacity: 0.5
                },
            },
            xaxis: {
                categories: [],
            }
        },
        chartOptionsDay5:{ 
            plotOptions: {
            bar: {
              horizontal: false,
              columnWidth: '55%',
              endingShape: 'rounded'	
            },
          },  
          chart: {
                zoom: {
                    enabled: false
                }
            },
            dataLabels: {
                enabled: false
            },
            stroke: {
                curve: 'smooth'
            },
            title: {
                text: 'Friday',
                align: 'left'
            },
            colors: ['#808000'],
            grid: {
                row: {
                    colors: ['#f3f3f3', 'transparent'], // takes an array which will be repeated on columns
                    opacity: 0.5
                },
            },
            xaxis: {
                categories: [],
            }
        },
        chartOptionsDay6:{ 
            plotOptions: {
            bar: {
              horizontal: false,
              columnWidth: '55%',
              endingShape: 'rounded'	
            },
          },  
          chart: {
                zoom: {
                    enabled: false
                }
            },
            dataLabels: {
                enabled: false
            },
            stroke: {
                curve: 'smooth'
            },
            title: {
                text: 'Saturday',
                align: 'left'
            },
            colors: ['#808000'],
            grid: {
                row: {
                    colors: ['#f3f3f2', 'transparent'], // takes an array which will be repeated on columns
                    opacity: 0.5
                },
            },
            xaxis: {
                categories: [],
            }
        },
        chartOptionsDay7:{ 
            plotOptions: {
            bar: {
              horizontal: false,
              columnWidth: '55%',
              endingShape: 'rounded'	
            },
          },  
          chart: {
                zoom: {
                    enabled: false
                }
            },
            dataLabels: {
                enabled: false
            },
            stroke: {
                curve: 'smooth'
            },
            title: {
                text: 'Sunday',
                align: 'left'
            },
            colors: ['#E9967A'],
            grid: {
                row: {
                    colors: ['#008080', 'transparent'], // takes an array which will be repeated on columns
                    opacity: 0.5
                },
            },
            xaxis: {
                categories: [],
            }
        }
            }
        },
        mounted:function(){
        this.method1() //method1 will execute at pageload
        },
        methods:{ 
            method1:function(){

                this.userName1= localStorage.getItem('userName');
                this.userName2= localStorage.getItem('userName2');

                this.seriesRW[0].name = 'Reading ' + localStorage.getItem('userName')
                this.seriesRW[1].name = 'Reading ' + localStorage.getItem('userName2')
                this.seriesRW[2].name = 'Writing ' + localStorage.getItem('userName')
                this.seriesRW[3].name = 'Writing ' + localStorage.getItem('userName2')
                
                this.seriesStudy[0].name = 'Study ' + localStorage.getItem('userName')
                this.seriesStudy[1].name = 'Study ' + localStorage.getItem('userName2')
                this.seriesStudy[2].name = 'Out Door Games ' + localStorage.getItem('userName')
                this.seriesStudy[3].name = 'Out Door Games ' + localStorage.getItem('userName2')

                this.seriesEntertainment[0].name = 'Computer Games ' + localStorage.getItem('userName')
                this.seriesEntertainment[1].name = 'Computer Games ' + localStorage.getItem('userName2')
                this.seriesEntertainment[2].name = 'tv ' + localStorage.getItem('userName')
                this.seriesEntertainment[3].name = 'tv ' + localStorage.getItem('userName2')
                

                this.seriesRelaxation[0].name = 'Sleep ' + localStorage.getItem('userName')
                this.seriesRelaxation[1].name = 'Sleep ' + localStorage.getItem('userName2')
                this.seriesRelaxation[2].name = 'Travel ' + localStorage.getItem('userName')
                this.seriesRelaxation[3].name = 'Travel ' + localStorage.getItem('userName2')

                this.seriesDayMon1[0].name = this.userName1;
                this.seriesDayMon2[0].name = this.userName2;
                this.seriesDayTue1[0].name = this.userName1;
                this.seriesDayTue2[0].name = this.userName2;
                this.seriesDayWed1[0].name = this.userName1;
                this.seriesDayWed2[0].name = this.userName2;
                this.seriesDayThu1[0].name = this.userName1;
                this.seriesDayThu2[0].name = this.userName2;
                this.seriesDayFri1[0].name = this.userName1;
                this.seriesDayFri2[0].name = this.userName2;
                this.seriesDaySat1[0].name = this.userName1;
                this.seriesDaySat2[0].name = this.userName2;
                this.seriesDaySun1[0].name = this.userName1;
                this.seriesDaySun2[0].name = this.userName2;
                this.chartOptionsDay.title.text = ' Monday';
                
                var results =  localStorage.getItem('interested1').replace("[","").replace("]","").replace(/(")/g, '')
                var aaa = results.split(",");
                for(var i = 0;i<aaa.length;i++)
                {
                    this.chartOptionsDonut1.labels.push( aaa[i] );
                }

                var results =  localStorage.getItem('interested1').replace("[","").replace("]","").replace(/(")/g, '')
                var aaa = results.split(",");
                for(var i = 0;i<aaa.length-3;i++)
                {
                    this.chartOptionsDay.xaxis.categories.push( aaa[i] );
                    this.chartOptionsDay2.xaxis.categories.push( aaa[i] );
                    this.chartOptionsDay3.xaxis.categories.push( aaa[i] );
                    this.chartOptionsDay4.xaxis.categories.push( aaa[i] );
                    this.chartOptionsDay5.xaxis.categories.push( aaa[i] );
                    this.chartOptionsDay6.xaxis.categories.push( aaa[i] );
                    this.chartOptionsDay7.xaxis.categories.push( aaa[i] );
                }

                results =  localStorage.getItem('interested2').replace("[","").replace("]","").replace(/(")/g, '')
                aaa = results.split(",");
                for(var i = 0;i<aaa.length;i++)
                {
                    this.chartOptionsDonut2.labels.push( aaa[i] );
                }

                var results =  localStorage.getItem('day1').replace("[","").replace("]","").replace(/(")/g, '')
                var aaa = results.split(",");
                for(var i = 0;i< aaa.length;i++)
                {
                    this.seriesDonutUser1.push( Math.floor(Math.random() * (70 - 1 + 1)) + 1);
                }

                var results =  localStorage.getItem('day2').replace("[","").replace("]","").replace(/(")/g, '')
                var aaa = results.split(",");
                for(var i = 0;i<aaa.length ;i++)
                {
                    this.seriesDonutUser2.push( Math.floor(Math.random() * (70 - 1 + 1)) + 1 );
                }

                results =  localStorage.getItem('reading1').replace("[","").replace("]","").replace(/(")/g, '')
                var read1 = results.split(",");
                for(var i = 0;i<read1.length;i++)
                {
                    this.seriesRW[0].data.push( read1[i]);
                }

                results =  localStorage.getItem('reading2').replace("[","").replace("]","").replace(/(")/g, '')
                var read2 = results.split(",");
                
                for(var i = 0;i<read2.length;i++)
                {
                    this.seriesRW[1].data.push( read2[i]);
                }

                results =  localStorage.getItem('writing1').replace("[","").replace("]","").replace(/(")/g, '')
                var write1 = results.split(",");
                for(var i = 0;i<write1.length;i++)
                {
                    this.seriesRW[2].data.push( write1[i]);
                }

                results =  localStorage.getItem('writing2').replace("[","").replace("]","").replace(/(")/g, '')
                var write2 = results.split(",");
                for(var i = 0;i<write2.length;i++)
                {
                    this.seriesRW[3].data.push( write2[i]);
                }

                results =  localStorage.getItem('study1').replace("[","").replace("]","").replace(/(")/g, '')
                var study1 = results.split(",");
                for(var i = 0;i<study1.length;i++)
                {
                    this.seriesStudy[0].data.push( study1[i]);
                }

                results =  localStorage.getItem('study2').replace("[","").replace("]","").replace(/(")/g, '')
                var study2 = results.split(",");
                for(var i = 0;i<study2.length;i++)
                {
                    this.seriesStudy[1].data.push( study2[i]);
                }

                results =  localStorage.getItem('games1').replace("[","").replace("]","").replace(/(")/g, '')
                var games1 = results.split(",");
                for(var i = 0;i<games1.length;i++)
                {
                    this.seriesStudy[2].data.push( games1[i]);
                }

                results =  localStorage.getItem('games2').replace("[","").replace("]","").replace(/(")/g, '')
                var games2 = results.split(",");
                for(var i = 0;i<games2.length;i++)
                {
                    this.seriesStudy[3].data.push( games2[i]);
                }

                results =  localStorage.getItem('computerGames1').replace("[","").replace("]","").replace(/(")/g, '')
                var computerGames1 = results.split(",");
                for(var i = 0;i<computerGames1.length;i++)
                {
                    this.seriesEntertainment[0].data.push( computerGames1[i]);
                }

                results =  localStorage.getItem('computerGames2').replace("[","").replace("]","").replace(/(")/g, '')
                var computerGames2 = results.split(",");
                for(var i = 0;i<computerGames2.length;i++)
                {
                    this.seriesEntertainment[1].data.push( computerGames2[i]);
                }

                results =  localStorage.getItem('tv1').replace("[","").replace("]","").replace(/(")/g, '')
                var tv1 = results.split(",");
                for(var i = 0;i<tv1.length;i++)
                {
                    this.seriesEntertainment[2].data.push( tv1[i]);
                }

                results =  localStorage.getItem('tv2').replace("[","").replace("]","").replace(/(")/g, '')
                var tv2 = results.split(",");
                for(var i = 0;i<tv2.length;i++)
                {
                    this.seriesEntertainment[3].data.push( tv2[i]);
                }

                results =  localStorage.getItem('userDetails2').replace("[","").replace("]","").replace(/(")/g, '')
                aaa = results.split(",");
                for(var i = 1;i<aaa.length;i++)
                {
                    this.userDetails1.push( aaa[i]);
                }

                results =  localStorage.getItem('userDetails1').replace("[","").replace("]","").replace(/(")/g, '')
                aaa = results.split(",");
                for(var i = 1;i<aaa.length;i++)
                {
                    this.userDetails2.push( aaa[i]);
                }

                results =  localStorage.getItem('sleep1').replace("[","").replace("]","").replace(/(")/g, '')
                var sleep1 = results.split(",");
                for(var i = 0;i<sleep1.length;i++)
                {
                    this.seriesRelaxation[0].data.push( sleep1[i] );
                }

                results =  localStorage.getItem('sleep2').replace("[","").replace("]","").replace(/(")/g, '')
                var sleep2 = results.split(",");
                for(var i = 0;i<sleep2.length;i++)
                {
                    this.seriesRelaxation[1].data.push( sleep2[i]);
                }

                results =  localStorage.getItem('travel1').replace("[","").replace("]","").replace(/(")/g, '')
                var travel1 = results.split(",");
                for(var i = 0;i<travel1.length;i++)
                {
                    this.seriesRelaxation[2].data.push( travel1[i] );
                }

                results =  localStorage.getItem('travel2').replace("[","").replace("]","").replace(/(")/g, '')
                var travel2 = results.split(",");
                for(var i = 0;i<travel2.length;i++)
                {
                    this.seriesRelaxation[3].data.push( travel2[i]);
                }

                results =  localStorage.getItem('timeAnalysys').replace("[","").replace("]","").replace(/(")/g, '')
                var ta = results.split(",");
                for(var i = 0;i<ta.length;i++)
                {
                    this.Analysys.push( ta[i]);
                }

                results =  localStorage.getItem('interested').replace("[","").replace("]","").replace(/(")/g, '')
                var ta = results.split(",");
                for(var i = 0;i<ta.length;i++)
                {
                    this.Analysys.push( ta[i]);
                }

                results =  localStorage.getItem('notInterested').replace("[","").replace("]","").replace(/(")/g, '')
                var ta = results.split(",");
                for(var i = 0;i<ta.length;i++)
                {
                    this.Analysys.push( ta[i]);
                }

                results =  localStorage.getItem('marks').replace("[","").replace("]","").replace(/(")/g, '')
                var ta = results.split(",");
                for(var i = 0;i<ta.length;i++)
                {
                    this.Marks.push( ta[i]);
                }

                results =  localStorage.getItem('wantToBecomeSuggestions').replace("[","").replace("]","").replace(/(")/g, '')
                var ta = results.split(",");
                for(var i = 0;i<ta.length;i++)
                {
                    this.wantToBecomeSuggestions.push( ta[i]);
                }

                results =  localStorage.getItem('wantToBecomeLinks').replace("[","").replace("]","").replace(/(")/g, '')
                var ta = results.split(",");
                for(var i = 0;i<ta.length;i++)
                {
                    this.wantToBecomeLinks.push( ta[i]);
                }



                results =  localStorage.getItem('favouriteMusic1').replace("[","").replace("]","").replace(/(")/g, '')
                this.favouriteMusic1 = results
                results =  localStorage.getItem('favouriteMusic2').replace("[","").replace("]","").replace(/(")/g, '')
                this.favouriteMusic2 = results

                results =  localStorage.getItem('favouriteCuisine1').replace("[","").replace("]","").replace(/(")/g, '')
                this.favouriteCuisine1 = results
                results =  localStorage.getItem('favouriteCuisine2').replace("[","").replace("]","").replace(/(")/g, '')
                this.favouriteCuisine2 = results

                results =  localStorage.getItem('favouriteMovies1').replace("[","").replace("]","").replace(/(")/g, '')
                this.favouriteMovies1 = results
                results =  localStorage.getItem('favouriteMovies2').replace("[","").replace("]","").replace(/(")/g, '')
                this.favouriteMovies2 = results

                results =  localStorage.getItem('livesIn1').replace("[","").replace("]","").replace(/(")/g, '')
                this.livesIn1 = results
                results =  localStorage.getItem('livesIn2').replace("[","").replace("]","").replace(/(")/g, '')
                this.livesIn2 = results

                results =  localStorage.getItem('sslcMarks1').replace("[","").replace("]","").replace(/(")/g, '')
                this.sslcMarks1 = results
                results =  localStorage.getItem('sslcMarks2').replace("[","").replace("]","").replace(/(")/g, '')
                this.sslcMarks2 = results

                results =  localStorage.getItem('plusTwoMarks1').replace("[","").replace("]","").replace(/(")/g, '')
                this.plusTwoMarks1 = results
                results =  localStorage.getItem('plusTwoMarks2').replace("[","").replace("]","").replace(/(")/g, '')
                this.plusTwoMarks2 = results

                results =  localStorage.getItem('degreeMarks1').replace("[","").replace("]","").replace(/(")/g, '')
                this.degreeMarks1 = results
                results =  localStorage.getItem('degreeMarks2').replace("[","").replace("]","").replace(/(")/g, '')
                this.degreeMarks2 = results

                results =  localStorage.getItem('wantToBecome1').replace("[","").replace("]","").replace(/(")/g, '')
                this.wantToBecome1 = results
                results =  localStorage.getItem('wantToBecome2').replace("[","").replace("]","").replace(/(")/g, '')
                this.wantToBecome2 = results

                results =  localStorage.getItem('knowsLanguages1').replace("[","").replace("]","").replace(/(")/g, '')
                this.knowsLanguages1 = results
                results =  localStorage.getItem('knowsLanguages2').replace("[","").replace("]","").replace(/(")/g, '')
                this.knowsLanguages2 = results

                

                this.seriesDayMon1[0].data.push( read1[0])
                this.seriesDayMon1[0].data.push( write1[0])
                this.seriesDayMon1[0].data.push( sleep1[0])
                this.seriesDayMon1[0].data.push( games1[0])
                this.seriesDayMon1[0].data.push( computerGames1[0])
                this.seriesDayMon1[0].data.push( travel1[0])
                this.seriesDayMon1[0].data.push( tv1[0])

                this.seriesDayMon2[0].data.push( read2[0])
                this.seriesDayMon2[0].data.push( write2[0])
                this.seriesDayMon2[0].data.push( sleep2[0])
                this.seriesDayMon2[0].data.push( games2[0])
                this.seriesDayMon2[0].data.push( computerGames2[0])
                this.seriesDayMon2[0].data.push( travel2[0])
                this.seriesDayMon2[0].data.push( tv2[0])

                this.seriesDayTue1[0].data.push( read1[1])
                this.seriesDayTue1[0].data.push( write1[1])
                this.seriesDayTue1[0].data.push( sleep1[1])
                this.seriesDayTue1[0].data.push( games1[1])
                this.seriesDayTue1[0].data.push( computerGames1[1])
                this.seriesDayTue1[0].data.push( travel1[1])
                this.seriesDayTue1[0].data.push( tv1[1])

                this.seriesDayTue2[0].data.push( read2[1])
                this.seriesDayTue2[0].data.push( write2[1])
                this.seriesDayTue2[0].data.push( sleep2[1])
                this.seriesDayTue2[0].data.push( games2[1])
                this.seriesDayTue2[0].data.push( computerGames2[1])
                this.seriesDayTue2[0].data.push( travel2[1])
                this.seriesDayTue2[0].data.push( tv2[1])


                this.seriesDayWed1[0].data.push( read1[2])
                this.seriesDayWed1[0].data.push( write1[2])
                this.seriesDayWed1[0].data.push( sleep1[2])
                this.seriesDayWed1[0].data.push( games1[2])
                this.seriesDayWed1[0].data.push( computerGames1[2])
                this.seriesDayWed1[0].data.push( travel1[2])
                this.seriesDayWed1[0].data.push( tv1[2])

                this.seriesDayWed2[0].data.push( read1[2])
                this.seriesDayWed2[0].data.push( write1[2])
                this.seriesDayWed2[0].data.push( sleep1[2])
                this.seriesDayWed2[0].data.push( games1[2])
                this.seriesDayWed2[0].data.push( computerGames1[2])
                this.seriesDayWed2[0].data.push( travel1[2])
                this.seriesDayWed2[0].data.push( tv1[2])

                this.seriesDayThu1[0].data.push( read1[3])
                this.seriesDayThu1[0].data.push( write1[3])
                this.seriesDayThu1[0].data.push( sleep1[3])
                this.seriesDayThu1[0].data.push( games1[3])
                this.seriesDayThu1[0].data.push( computerGames1[3])
                this.seriesDayThu1[0].data.push( travel1[3])
                this.seriesDayThu1[0].data.push( tv1[3])

                this.seriesDayThu2[0].data.push( read2[3])
                this.seriesDayThu2[0].data.push( write2[3])
                this.seriesDayThu2[0].data.push( sleep2[3])
                this.seriesDayThu2[0].data.push( games2[3])
                this.seriesDayThu2[0].data.push( computerGames2[3])
                this.seriesDayThu2[0].data.push( travel2[3])
                this.seriesDayThu2[0].data.push( tv2[3])

                this.seriesDayFri1[0].data.push( read1[4])
                this.seriesDayFri1[0].data.push( write1[4])
                this.seriesDayFri1[0].data.push( sleep1[4])
                this.seriesDayFri1[0].data.push( games1[4])
                this.seriesDayFri1[0].data.push( computerGames1[4])
                this.seriesDayFri1[0].data.push( travel1[4])
                this.seriesDayFri1[0].data.push( tv1[4])

                this.seriesDayFri2[0].data.push( read2[4])
                this.seriesDayFri2[0].data.push( write2[4])
                this.seriesDayFri2[0].data.push( sleep2[4])
                this.seriesDayFri2[0].data.push( games2[4])
                this.seriesDayFri2[0].data.push( computerGames2[4])
                this.seriesDayFri2[0].data.push( travel2[4])
                this.seriesDayFri2[0].data.push( tv2[4])

                this.seriesDaySat1[0].data.push( read1[5])
                this.seriesDaySat1[0].data.push( write1[5])
                this.seriesDaySat1[0].data.push( sleep1[5])
                this.seriesDaySat1[0].data.push( games1[5])
                this.seriesDaySat1[0].data.push( computerGames1[5])
                this.seriesDaySat1[0].data.push( travel1[5])
                this.seriesDaySat1[0].data.push( tv1[5])

                this.seriesDaySat2[0].data.push( read2[5])
                this.seriesDaySat2[0].data.push( write2[5])
                this.seriesDaySat2[0].data.push( sleep2[5])
                this.seriesDaySat2[0].data.push( games2[5])
                this.seriesDaySat2[0].data.push( computerGames2[5])
                this.seriesDaySat2[0].data.push( travel2[5])
                this.seriesDaySat2[0].data.push( tv2[5])

                this.seriesDaySun1[0].data.push( read1[6])
                this.seriesDaySun1[0].data.push( write1[6])
                this.seriesDaySun1[0].data.push( sleep1[6])
                this.seriesDaySun1[0].data.push( games1[6])
                this.seriesDaySun1[0].data.push( computerGames1[6])
                this.seriesDaySun1[0].data.push( travel1[6])
                this.seriesDaySun1[0].data.push( tv1[6])

                this.seriesDaySun2[0].data.push( read2[6])
                this.seriesDaySun2[0].data.push( write2[6])
                this.seriesDaySun2[0].data.push( sleep2[6])
                this.seriesDaySun2[0].data.push( games2[6])
                this.seriesDaySun2[0].data.push( computerGames2[6])
                this.seriesDaySun2[0].data.push( travel2[6])
                this.seriesDaySun2[0].data.push( tv2[6])

                
        }
         }
        
    }

</script>