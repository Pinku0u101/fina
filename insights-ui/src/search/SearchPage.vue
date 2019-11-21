<template>
    <div class="sngc">
        <h2 class="titlebar" >Search</h2>
        <br/> <br/>
        <h2 style="margin-left: 100px;">Enter the first name and last name to search</h2>

<div style="background:url(./src/assets/sngc1.jpeg);background-repeat:no-repeat;background-size:cover;height:100%;">
        <div class="leftdivSearch">
            <div class="searchClass">
                <label> First Name: </label>
                <input type="text" class="searchText" v-model="searchInput.firstName"/> <br/>
                <label> Last Name: </label>
                <input type="text" class="searchText" v-model="searchInput.lastName"/> <br/>
                <button class="searchButton btn waves-effect waves-light btn-large" v-on:click.prevent="getSearchDetails" @click="visible = !visible" >Search</button>
            </div>
        </div>
        <div class="compareList">
            <h2 > CompareList </h2>
            <ol>
            <li v-for="cInput in this.compareInput.compareInputs"> {{ cInput.id }} </li>
            </ol>
        </div>

         <div class="searchOutput">
                <table v-if="visible" style="border-color:green;background-color: #A9A9A9;">
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Occupation</th>
                        <th></th>
                    </tr>

                    <tr v-for="(output, index) in this.output.searchOutputs">
                    <td>{{ output.id}}</td>
                    <td>{{ output.name }}</td>
                    <td>{{ output.occupation}}</td>
                    <td> <button v-on:click.prevent="addOrRemoveCompare(output.id, index)"> {{ buttonText }} </button> </td>
                    </tr>
                </table>
            </div>
            

        <div>
            <button class="compareButton" v-on:click.prevent="compareUsers" v-if="visible"> Compare </button>
        </div>
        </div>
    </div>
</template>

<script>
import { router } from '../_helpers';

export default {
    data() {
        return {
            searchInput:{
                firstName:'',
                lastName: ''
            },
            output :{
                searchOutputs: [],
                compareOutputs: []
                
            },
            visible: false,
            buttonText: 'Add to Compare',
            clicked : true,
            compareInput:{
                compareInputs: [],
                compareInputs1: []
            }
        }
    },
    methods:{
        getSearchDetails:function(){
            this.$http.get('http://localhost:9004/search?firstName='+this.searchInput.firstName + '&lastName='+this.searchInput.lastName).then(function(data){
                this.output.searchOutputs = data.body.slice(0,10);

                localStorage.setItem('occupation2', this.output.searchOutputs[0].occupation )
                localStorage.setItem('userName2', this.output.searchOutputs[0].userName )
            })

        },
        addOrRemoveCompare:function(id, index){
            
            if(this.clicked)
            {
                this.compareInput.compareInputs.push( { id } );
                this.buttonText = 'Remove from Compare';
            }
            else
            {
                this.$delete( this.compareInput.compareInputs,index );
                this.buttonText = 'Add to Compare';
            }
            this.clicked = !this.clicked;
        },
        compareUsers:function(){
            this.$http.post('http://localhost:9005/insights',{
                userId: JSON.stringify(this.compareInput.compareInputs),
                userName: localStorage.getItem('userName')
            }).then(function(data){
                
                
                console.log(data);

                localStorage.setItem('reading1', JSON.stringify(data.data.user0.reading));
                localStorage.setItem('reading2', JSON.stringify(data.data.user1.reading));

                localStorage.setItem('writing1', JSON.stringify(data.data.user0.writing));
                localStorage.setItem('writing2', JSON.stringify(data.data.user1.writing)); 

                localStorage.setItem('study1', JSON.stringify(data.data.user0.study));
                localStorage.setItem('study2', JSON.stringify(data.data.user1.study));

                localStorage.setItem('travel1', JSON.stringify(data.data.user0.travel));
                localStorage.setItem('travel2', JSON.stringify(data.data.user1.travel));

                localStorage.setItem('sleep1', JSON.stringify(data.data.user0.sleep));
                localStorage.setItem('sleep2', JSON.stringify(data.data.user1.sleep));

                localStorage.setItem('interested1', JSON.stringify(data.data.user0.interested));
                localStorage.setItem('interested2', JSON.stringify(data.data.user1.interested));

                localStorage.setItem('notInterested1', JSON.stringify(data.data.user0.notInterested));
                localStorage.setItem('notInterested2', JSON.stringify(data.data.user1.notInterested));

                localStorage.setItem('games1', JSON.stringify(data.data.user0.games));
                localStorage.setItem('games2', JSON.stringify(data.data.user1.games));

                localStorage.setItem('computerGames1', JSON.stringify(data.data.user0.computerGames));
                localStorage.setItem('computerGames2', JSON.stringify(data.data.user1.computerGames));

                localStorage.setItem('tv1', JSON.stringify(data.data.user0.tv));
                localStorage.setItem('tv2', JSON.stringify(data.data.user1.tv));

                localStorage.setItem('day1', JSON.stringify(data.data.user0.day));
                localStorage.setItem('day2', JSON.stringify(data.data.user1.day));

                localStorage.setItem('userDetails1', JSON.stringify(data.data.user0.userDetails));
                localStorage.setItem('userDetails2', JSON.stringify(data.data.user1.userDetails));

                localStorage.setItem('favouriteMusic1', JSON.stringify(data.data.user0.FavouriteMusic))
                localStorage.setItem('favouriteMusic2', JSON.stringify(data.data.user1.FavouriteMusic))

                localStorage.setItem('favouriteCuisine1', JSON.stringify(data.data.user0.FavouriteCuisine))
                localStorage.setItem('favouriteCuisine2', JSON.stringify(data.data.user1.FavouriteCuisine))

                localStorage.setItem('favouriteMovies1', JSON.stringify(data.data.user0.FavouriteMovies))
                localStorage.setItem('favouriteMovies2', JSON.stringify(data.data.user1.FavouriteMovies))

                localStorage.setItem('livesIn1', JSON.stringify(data.data.user0.livesIn))
                localStorage.setItem('livesIn2', JSON.stringify(data.data.user1.livesIn))

                localStorage.setItem('sslcMarks1', JSON.stringify(data.data.user0.sslcMarks))
                localStorage.setItem('sslcMarks2', JSON.stringify(data.data.user1.sslcMarks))

                localStorage.setItem('plusTwoMarks1', JSON.stringify(data.data.user0.plusTwoMarks))
                localStorage.setItem('plusTwoMarks2', JSON.stringify(data.data.user1.plusTwoMarks))

                localStorage.setItem('degreeMarks1', JSON.stringify(data.data.user0.degreeMarks))
                localStorage.setItem('degreeMarks2', JSON.stringify(data.data.user1.degreeMarks))
                

                localStorage.setItem('wantToBecome1', JSON.stringify(data.data.user0.wantToBecome))
                localStorage.setItem('wantToBecome2', JSON.stringify(data.data.user1.wantToBecome))

                localStorage.setItem('knowsLanguages1', JSON.stringify(data.data.user0.knowsLanguages))
                localStorage.setItem('knowsLanguages2', JSON.stringify(data.data.user1.knowsLanguages))


                localStorage.setItem('timeAnalysys', JSON.stringify(data.data.insights.timeAnalysys))
                localStorage.setItem('interested', JSON.stringify(data.data.insights.interested))
                localStorage.setItem('notInterested', JSON.stringify(data.data.user0.wantToBecome))
                localStorage.setItem('marks', JSON.stringify(data.data.insights.marks))

                localStorage.setItem('wantToBecomeSuggestions', JSON.stringify(data.data.insights.wantToBecome))
                localStorage.setItem('wantToBecomeLinks', JSON.stringify(data.data.insights.wantToBecomelinks))
                

                

                router.push({path:'/insights', components:data});
            });
            
        }

    }
}
</script>