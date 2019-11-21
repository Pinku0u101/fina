<template>
    <div class="sngc">
        <h2 class="titlebar">Form Data</h2>
        <h3>Please fill your details accurately so that we could assist you better</h3>

        <div class="leftdiv1">
            <h2 class="subtitle1">Life Style</h2>
            <div>
            <label class="propheaders">Hobbies</label> <br/> <br/>

            <label>   Reading</label> <br/><br/>
            <input type="radio" name="Hobbies1" value="read" v-model="radio.read" v-on:click="insert('read')"/>
            <label for="Hobbies1">interested</label>
            <input type="radio" name="Hobbies2" value="read1" v-model="radio.read" v-on:click="insert1('read')"/>
            <label for="Hobbies">interested</label> <br/><br/>

            <label>Shopping</label> <br/><br/>
            <input type="radio" name="Hobbies3" value="shopping" v-model="radio.shop"  v-on:click="insert('shopping')"/>
            <label for="Hobbies3">interested</label>
            <input type="radio" name="Hobbies4" value="shopping1" v-model="radio.shop" v-on:click="insert1('shopping')"/>
            <label for="Hobbies4">not interested</label> <br/><br/>

            <label>Painting</label> <br/><br/>
            <input type="radio" name="Hobbies5" value="painting" v-model="radio.paint" v-on:click="insert('painting')"/>
            <label>interested</label>
            <input type="radio" name="Hobbies6" value="painting1" v-model="radio.paint" v-on:click="insert1('painting')"/>
            <label>not interested</label> <br/><br/>

            <label>Watch tv</label> <br/><br/>
            <input type="radio" name="Hobbies7" value="watch tv" v-model="radio.tv" v-on:click="insert('watch tv')"/>
            <label>interested</label> 
            <input type="radio" name="Hobbies8" value="watch tv1" v-model="radio.tv" v-on:click="insert1('watch tv')"/>
            <label>not interested</label> <br/><br/>
            

            <label>Travelling</label> <br/><br/>
            <input type="radio" name="Hobbies9" value="travelling" v-model="radio.travel" v-on:click="insert('travelling')"/> 
            <label>interested</label>
            <input type="radio" name="Hobbies9" value="travelling1" v-model="radio.travel" v-on:click="insert1('travelling')"/> 
            <label>not interested</label> <br/><br/>
            
            <label>Running</label> <br/><br/>
            <input type="radio" name="Hobbies10" value="running" v-model="radio.run" v-on:click="insert('running')"/> 
            <label>interested</label>
            <input type="radio" name="Hobbies11" value="running1" v-model="radio.run" v-on:click="insert1('running')"/> 
            <label>not interested</label> <br/><br/>
            
            <label>Movies</label>  <br/><br/>
            <input type="radio" name="Hobbies12" value="movies" v-model="radio.movie" v-on:click="insert('movies')"/>
            <label>interested</label>
            <input type="radio" name="Hobbies13" value="movies1" v-model="radio.movie" v-on:click="insert1('movies')"/>
            <label>not interested</label> <br/><br/>
            

            <label>Sleeping</label>  <br/><br/>
            <input type="radio" name="Hobbies14" value="sleeping" v-model="radio.sleep" v-on:click="insert('sleeping')"/>
            <label>interested</label> 
            <input type="radio" name="Hobbies15" value="sleeping1" v-model="radio.sleep" v-on:click="insert1('sleeping')"/>
            <label>not interested</label> <br/><br/>
            

            <label>Dancing</label> <br/><br/>
            <input type="radio" name="Hobbies16" value="dancing" v-model="radio.dance" v-on:click="insert('dancing')"/>
            <label>interested</label>
            <input type="radio" name="Hobbies17" value="dancing1" v-model="radio.dance" v-on:click="insert1('dancing')"/>
            <label>not interested</label> <br/> <br/>
            
            <label>BiCycling</label> <br/><br/>
            <input type="radio" name="Hobbies18" value="bicycling" v-model="radio.cycle" v-on:click="insert('bicycling')"/> 
            <label>interested</label>
            <input type="radio" name="Hobbies19" value="bicycling1" v-model="radio.cycle" v-on:click="insert1('bicycling')"/> 
            <label>not interested</label> <br/><br/>

            <label>Cooking</label> <br/><br/>
            <input type="radio" name="Hobbies20" value="cooking" v-model="radio.cook" v-on:click="insert('cooking')"/> 
            <label>interested</label>
            <input type="radio" name="Hobbies21" value="cooking1" v-model="radio.cook" v-on:click="insert1('cooking')"/> 
            <label>not interested</label> <br/><br/>

            <label>Gardening</label> <br/><br/>
            <input type="radio" name="Hobbies22" value="gardening" v-model="radio.garden" v-on:click="insert('gardening')"/>
            <label>interested</label>
            <input type="radio" name="Hobbies23" value="gardening1" v-model="radio.garden" v-on:click="insert1('gardening')"/>
            <label>not interested</label> <br/> <br/>

            <label>swimming</label> <br/><br/>
            <input type="radio" name="Hobbies24" value="swimming" v-model="radio.swim" v-on:click="insert('swimming')"/>
            <label>interested</label> 
            <input type="radio" name="Hobbies25" value="swimming1" v-model="radio.swim" v-on:click="insert1('swimming')"/>
            <label>not interested</label> <br/> <br/>
            
            <label>cricket</label> <br/><br/>
            <input type="radio" name="Hobbies26" value="cricket" v-model="radio.cricket" v-on:click="insert('cricket')"/>
            <label>interested</label>
            <input type="radio" name="Hobbies27" value="cricket1" v-model="radio.cricket" v-on:click="insert1('cricket')"/>
            <label>not interested</label> <br/> <br/>
            
            <label>walking</label> <br/><br/>
            <input type="radio" name="Hobbies28" value="walking" v-model="radio.walk" v-on:click="insert('walking')"/> 
            <label>interested</label>
            <input type="radio" name="Hobbies29" value="walking1" v-model="radio.walk" v-on:click="insert1('walking')"/> 
            <label>not interested</label> <br/><br/>
            
            <label>writing</label> <br/><br/>
            <input type="radio" name="Hobbies30" value="writing" v-model="radio.write" v-on:click="insert('writing')"/> 
            <label>interested</label>
            <input type="radio" name="Hobbies31" value="writing1" v-model="radio.write" v-on:click="insert1('writing')"/> 
            <label>not interested</label> <br/><br/>
            
            <label>football</label> <br/><br/>
            <input type="radio" name="Hobbies32" value="football" v-model="radio.football" v-on:click="insert('football')"/> 
            <label>interested</label>
            <input type="radio" name="Hobbies33" value="football1" v-model="radio.football" v-on:click="insert1('football')"/> 
            <label>not interested</label> <br/><br/>
            
            <label>workout</label> <br/><br/>
            <input type="radio" name="Hobbies34" value="workout" v-model="radio.workout" v-on:click="insert('workout')"/>
            <label>interested</label>
            <input type="radio" name="Hobbies35" value="workout1" v-model="radio.workout" v-on:click="insert1('workout')"/>
            <label>not interested</label> <br/> <br/>
            
            <label>skiing</label> <br/><br/>
            <input type="radio" name="Hobbies36" value="skiing" v-model="radio.skiing" v-on:click="insert('skiing')"/> 
            <label>interested</label>
            <input type="radio" name="Hobbies37" value="skiing1" v-model="radio.skiing" v-on:click="insert1('skiing')"/> 
            <label>not interested</label> <br/><br/>
            
            <label>Computer Games</label> <br/><br/>            
            <input type="radio" name="Hobbies38" value="computer games" v-model="radio.games" v-on:click="insert('computer game')"/>
            <label>interested</label> 
            <input type="radio" name="Hobbies39" value="computer games1" v-model="radio.games" v-on:click="insert1('computer game')"/>
            <label>not interested</label> <br/> <br/>
            
        
            <label class="propheaders">Favourite Music</label><br/><br/>
            <input type="checkbox" name="fm1" value="devotional"  v-model="properties.FavouriteMusic" />
            <label>Devotional</label> 
            <input type="checkbox" name="fm2" value="film songs" v-model="properties.FavouriteMusic" />
            <label>Film songs</label> <br/><br/>
            <input type="checkbox" name="fm3" value="carnatic" v-model="properties.FavouriteMusic" />
            <label>Carnatic</label> 
            <input type="checkbox" name="fm4" value="western"  v-model="properties.FavouriteMusic" />
            <label>Western</label> <br/><br/>

            <label class="propheaders">Favourite Cuisine</label><br/><br/>
            <input type="checkbox" name="fc1" value="indian" v-model="properties.FavouriteCuisine" />
            <label>Indian</label> 
            <input type="checkbox" name="fc2" value="mexican" v-model="properties.FavouriteCuisine" />
            <label>Mexican</label> 
            <input type="checkbox" name="fc3" value="italian" v-model="properties.FavouriteCuisine" />
            <label>Italian</label> 
            <input type="checkbox" name="fc4" value="spanish" v-model="properties.FavouriteCuisine" />
            <label>Spanish</label> <br/><br/>
            <input type="checkbox" name="fc5" value="french" v-model="properties.FavouriteCuisine" />
            <label>french</label> 
            <input type="checkbox" name="fc6" value="japanese" v-model="properties.FavouriteCuisine" />
            <label>Japanese</label> 
            <input type="checkbox" name="fc7" value="thai" v-model="properties.FavouriteCuisine" />
            <label>Thai</label> 
            <input type="checkbox" name="fc8" value="chinese" v-model="properties.FavouriteCuisine" />
            <label>Chinese</label> <br/><br/>

            <label class="propheaders">Favourite Reads</label><br/><br/>
            <input type="checkbox" name="fr1" value="humor" v-model="properties.FavouriteReads" />
            <label>Humor</label>
            <input type="checkbox" name="fr2" value="action" v-model="properties.FavouriteReads" />
            <label>Action</label> 
            <input type="checkbox" name="fr3" value="drama" v-model="properties.FavouriteReads" />
            <label>Drama</label> <br/><br/>
            
            <label class="propheaders">Favourite Movies</label><br/><br/>
            <input type="checkbox" name="fm1" value="comedy" v-model="properties.FavouriteMovies" />
            <label>Comedy</label> 
            <input type="checkbox" name="fm2" value="action"  v-model="properties.FavouriteMovies" />
            <label>Action</label>
            <input type="checkbox" name="fm3" value="drama" v-model="properties.FavouriteMovies" />
            <label>Drama</label> <br/><br/>

            <label class="propheaders">Spoken Languages</label><br/><br/>
            <input type="checkbox" name="lang1" value="english" v-model="properties.SpokenLanguages" />
            <label>English</label> 
            <input type="checkbox" name="lang2" value="malayalam" v-model="properties.SpokenLanguages" />
            <label>Malayalam</label> 
            <input type="checkbox" name="lang3" value="tamil" v-model="properties.SpokenLanguages" />
            <label>Tamil</label> <br/><br/>
            <input type="checkbox" name="lang3" value="telugu" v-model="properties.SpokenLanguages" />
            <label>Telugu</label>
            <input type="checkbox" name="lang4" value="hindi" v-model="properties.SpokenLanguages" />
            <label>Hindi</label> <br/><br/>

            <label class="propheaders">Education</label><br/><br/>
            <input type="checkbox" name="lang1" value="mechanical engineering" v-model="properties.Education" />
            <label>mechanical engineering</label> <br/>
            <input type="checkbox" name="lang2" value="civil engineering" v-model="properties.Education" />
            <label>civil engineering</label> <br/>
            <input type="checkbox" name="lang3" value="electrical engineering" v-model="properties.Education" />
            <label>electrical engineering</label> <br/>
            <input type="checkbox" name="lang3" value="agricultural engineering" v-model="properties.Education" />
            <label>agricultural engineering</label> <br/>
            <input type="checkbox" name="lang4" value="mca" v-model="properties.Education" />
            <label>mca</label> <br/><br/>

            <label class="propheaders">Want to Become</label><br/><br/>
            <input type="checkbox" name="lang1" value="civil service" v-model="properties.wantToBecome" />
            <label>civil service</label> <br/>
            <input type="checkbox" name="lang2" value="work in top it companies" v-model="properties.wantToBecome" />
            <label>work in top it companies</label> <br/>
            <input type="checkbox" name="lang2" value="govt job" v-model="properties.wantToBecome" />
            <label>govt job</label> <br/>

            <label class="propheaders">Average Marks</label><br/><br/>
            <label>sslc</label> <br/><br/>
            <input type="radio" name="sslc1" value="1-10" v-model="properties.sslc" />
            <label>1-10</label>
            <input type="radio" name="sslc2" value="11-20" v-model="properties.sslc" />
            <label>11-20</label>
            <input type="radio" name="sslc3" value="21-30" v-model="properties.sslc" />
            <label>21-30</label>
            <input type="radio" name="sslc4" value="31-40" v-model="properties.sslc" />
            <label>31-40</label>
            <input type="radio" name="sslc5" value="41-50" v-model="properties.sslc" />
            <label>41-50</label>
            <input type="radio" name="sslc6" value="51-60" v-model="properties.sslc" />
            <label>51-60</label><br/><br/>
            <input type="radio" name="sslc7" value="61-70" v-model="properties.sslc" />
            <label>61-70</label>
            <input type="radio" name="sslc8" value="71-80" v-model="properties.sslc" />
            <label>71-80</label> 
            <input type="radio" name="sslc9" value="81-90" v-model="properties.sslc" />
            <label>81-90</label>
            <input type="radio" name="sslc10" value="91-94" v-model="properties.sslc" />
            <label>91-94</label>
            <input type="radio" name="sslc11" value="95-100" v-model="properties.sslc" />
            <label>95-100</label><br/><br/>
            <label>plusTwo</label> <br/><br/>
            <input type="radio" name="plus1" value="1-10" v-model="properties.plusTwo" />
            <label>1-10</label>
            <input type="radio" name="plus2" value="11-20" v-model="properties.plusTwo" />
            <label>11-20</label>
            <input type="radio" name="plus3" value="21-30" v-model="properties.plusTwo" />
            <label>21-30</label>
            <input type="radio" name="plus4" value="31-40" v-model="properties.plusTwo" />
            <label>31-40</label>
            <input type="radio" name="plus5" value="41-50" v-model="properties.plusTwo" />
            <label>41-50</label>
            <input type="radio" name="plus6" value="51-60" v-model="properties.plusTwo" />
            <label>51-60</label><br/><br/>
            <input type="radio" name="plus7" value="61-70" v-model="properties.plusTwo" />
            <label>61-70</label>
            <input type="radio" name="plus8" value="71-80" v-model="properties.plusTwo" />
            <label>71-80</label> 
            <input type="radio" name="plus9" value="81-90" v-model="properties.plusTwo" />
            <label>81-90</label>
            <input type="radio" name="splus0" value="91-94" v-model="properties.plusTwo" />
            <label>91-94</label>
            <input type="radio" name="plus11" value="91-100" v-model="properties.plusTwo" />
            <label>91-100</label><br/><br/>
            <label>Degree</label> <br/><br/>
            <input type="radio" name="degree1" value="1-10" v-model="properties.degree" />
            <label>1-10</label>
            <input type="radio" name="degree2" value="11-20" v-model="properties.degree" />
            <label>11-20</label>
            <input type="radio" name="degree3" value="21-30" v-model="properties.degree" />
            <label>21-30</label>
            <input type="radio" name="degree4" value="31-40" v-model="properties.degree" />
            <label>31-40</label>
            <input type="radio" name="degree5" value="41-50" v-model="properties.degree" />
            <label>41-50</label>
            <input type="radio" name="degree6" value="51-60" v-model="properties.degree" />
            <label>51-60</label><br/><br/>
            <input type="radio" name="degree7" value="61-70" v-model="properties.degree" />
            <label>61-70</label>
            <input type="radio" name="degree8" value="71-80" v-model="properties.degree" />
            <label>71-80</label> 
            <input type="radio" name="degree9" value="81-90" v-model="properties.degree" />
            <label>81-90</label>
            <input type="radio" name="degree10" value="91-94" v-model="properties.degree" />
            <label>91-94</label>
            <input type="radio" name="degree11" value="91-100" v-model="properties.degree" />
            <label>91-100</label><br/><br/>
    

            <label class="propheaders">Likes to Eat</label><br/><br/>
            <input type="checkbox" name="eat1" value="vegetable" v-model="properties.Food" />
            <label>Vegetable</label>
            <input type="checkbox" name="eat2" value="mutton" v-model="properties.Food" />
            <label>Mutton</label> 
            <input type="checkbox" name="eat3" value="rice" v-model="properties.Food" />
            <label>rice</label> 
            <input type="checkbox" name="eat4" value="fruits" v-model="properties.Food" />
            <label>Fruits</label> 
            <input type="checkbox" name="eat5" value="nuts" v-model="properties.Food" />
            <label>Nuts</label> <br/><br/>
            <input type="checkbox" name="eat6" value="grilled chiken" v-model="properties.Food" />
            <label>Grilled Chicken</label> 
            <input type="checkbox" name="eat7" value="burger" v-model="properties.Food" />
            <label>Burger</label> 
            <input type="checkbox" name="eat8" value="chicken curry" v-model="properties.Food" />
            <label>Chicken Curry</label> <br/><br/>
            <input type="checkbox" name="eat9" value="chicken fry" v-model="properties.Food" />
            <label>Chicken Fry</label> 
            <input type="checkbox" name="eat10" value="wheat" v-model="properties.Food" />
            <label>Wheat</label>
            <input type="checkbox" name="eat11" value="oats" v-model="properties.Food" />
            <label>Oats</label> 
            <input type="checkbox" name="eat12" value="fries" v-model="properties.Food" />
            <label>Fries</label> 
            <input type="checkbox" name="eat13" value="soda" v-model="properties.Food" />
            <label>Soda</label> <br/><br/>
            <input type="checkbox" name="eat14" value="salad" v-model="properties.Food" />
            <label>Salad</label> 
            <input type="checkbox" name="eat15" value="beef" v-model="properties.Food" />
            <label>Beef</label> 
            <input type="checkbox" name="eat16" value="milk" v-model="properties.Food" />
            <label>Milk</label> 
            <input type="checkbox" name="eat17" value="pizza" v-model="properties.Food" />
            <label>Pizza</label> <br/><br/>


            <ul>
            <li v-for="hobby in properties.hobbies"> {{ hobby }} </li>
            </ul>
            
            </div>
            
        </div>

        <div class="rightdiv">
        
        <label class="propheaders">Daily Activities - Monday</label><br/><br/>
        <label>Study</label> <br/>
        <input type="radio" name="MonStudy0" value="0" v-model="monday.study" />
        <label>0</label>
        <input type="radio" name="MonStudy1" value="1" v-model="monday.study" />
        <label>1</label>
        <input type="radio" name="MonStudy2" value="2" v-model="monday.study" />
        <label>2</label>
        <input type="radio" name="MonStudy3" value="3" v-model="monday.study" />
        <label>3</label>
        <input type="radio" name="MonStudy4" value="4" v-model="monday.study" />
        <label>4</label>
        <input type="radio" name="MonStudy5" value="5" v-model="monday.study" />
        <label>5</label> 
        <input type="radio" name="MonStudy6" value="6" v-model="monday.study" />
        <label>6</label><br/><br/>

        
        <label>Reading</label> <br/>
        <input type="radio" name="MonRead0" value="0" v-model="monday.read" />
        <label>0</label>
        <input type="radio" name="MonRead1" value="1" v-model="monday.read" />
        <label>1</label>
        <input type="radio" name="MonRead2" value="2" v-model="monday.read" />
        <label>2</label>
        <input type="radio" name="MonRead3" value="3" v-model="monday.read" />
        <label>3</label>
        <input type="radio" name="MonRead4" value="4" v-model="monday.read" />
        <label>4</label>
        <input type="radio" name="MonRead5" value="5" v-model="monday.read" />
        <label>5</label> 
        <input type="radio" name="MonRead6" value="6" v-model="monday.read" />
        <label>6</label><br/><br/>

        
        <label>Writing</label> <br/>
        <input type="radio" name="MonWrite0" value="0" v-model="monday.writing" />
        <label>0</label>
        <input type="radio" name="MonWrite1" value="1" v-model="monday.writing" />
        <label>1</label>
        <input type="radio" name="MonWrite2" value="2" v-model="monday.writing" />
        <label>2</label>
        <input type="radio" name="MonWrite3" value="3" v-model="monday.writing" />
        <label>3</label>
        <input type="radio" name="MonWrite4" value="4" v-model="monday.writing" />
        <label>4</label>
        <input type="radio" name="MonWrite5" value="5" v-model="monday.writing" />
        <label>5</label> 
        <input type="radio" name="MonWrite6" value="6" v-model="monday.writing" />
        <label>6</label><br/><br/>

        <label>Watch tv</label> <br/>
        <input type="radio" name="tv0" value="0" v-model="monday.watchTv" />
        <label>0</label>
        <input type="radio" name="tv1" value="1" v-model="monday.watchTv" />
        <label>1</label>
        <input type="radio" name="tv2" value="2" v-model="monday.watchTv" />
        <label>2</label>
        <input type="radio" name="tv3" value="3" v-model="monday.watchTv" />
        <label>3</label>
        <input type="radio" name="tv4" value="4" v-model="monday.watchTv" />
        <label>4</label>
        <input type="radio" name="tv5" value="5" v-model="monday.watchTv" />
        <label>5</label> 
        <input type="radio" name="tv6" value="6" v-model="monday.watchTv" />
        <label>6</label><br/><br/>

        <label>Computer Games</label> <br/>
        <input type="radio" name="MonCgames0" value="0" v-model="monday.computerGames" />
        <label>0</label>
        <input type="radio" name="MonCgames1" value="1" v-model="monday.computerGames" />
        <label>1</label>
        <input type="radio" name="MonCgames2" value="2" v-model="monday.computerGames" />
        <label>2</label>
        <input type="radio" name="MonCgames3" value="3" v-model="monday.computerGames" />
        <label>3</label>
        <input type="radio" name="MonCgames4" value="4" v-model="monday.computerGames" />
        <label>4</label>
        <input type="radio" name="MonCgames5" value="5" v-model="monday.computerGames" />
        <label>5</label> 
        <input type="radio" name="MonCgames6" value="6" v-model="monday.computerGames" />
        <label>6</label><br/><br/>

        <label>Out Door Games</label> <br/>
        <input type="radio" name="MonGames0" value="0" v-model="monday.outDoorGames" />
        <label>0</label>
        <input type="radio" name="MonGames1" value="1" v-model="monday.outDoorGames" />
        <label>1</label>
        <input type="radio" name="MonGames2" value="2" v-model="monday.outDoorGames" />
        <label>2</label>
        <input type="radio" name="MonGames3" value="3" v-model="monday.outDoorGames" />
        <label>3</label>
        <input type="radio" name="MonGames4" value="4" v-model="monday.outDoorGames" />
        <label>4</label>
        <input type="radio" name="MonGames5" value="5" v-model="monday.outDoorGames" />
        <label>5</label> 
        <input type="radio" name="MonGames6" value="6" v-model="monday.outDoorGames" />
        <label>6</label><br/><br/>

        <label>Travel</label> <br/>
        <input type="radio" name="MonTravel0" value="0" v-model="monday.travel" />
        <label>0</label>
        <input type="radio" name="MonTravel1" value="1" v-model="monday.travel" />
        <label>1</label>
        <input type="radio" name="MonTravel2" value="2" v-model="monday.travel" />
        <label>2</label>
        <input type="radio" name="MonTravel3" value="3" v-model="monday.travel" />
        <label>3</label>
        <input type="radio" name="MonTravel4" value="4" v-model="monday.travel" />
        <label>4</label>
        <input type="radio" name="MonTravel5" value="5" v-model="monday.travel" />
        <label>5</label> 
        <input type="radio" name="MonTravel6" value="6" v-model="monday.travel" />
        <label>6</label><br/><br/>

        <label>Sleeping</label> <br/>
        
        <input type="radio" name="MonSleep3" value="1" v-model="monday.sleep" />
        <label>3</label>
        <input type="radio" name="MonSleep4" value="2" v-model="monday.sleep" />
        <label>4</label>
        <input type="radio" name="MonSleep5" value="3" v-model="monday.sleep" />
        <label>5</label> 
        <input type="radio" name="MonSleep6" value="4" v-model="monday.sleep" />
        <label>6</label>
        <input type="radio" name="MonSleep7" value="5" v-model="monday.sleep" />
        <label>7</label>
        <input type="radio" name="MonSleep8" value="6" v-model="monday.sleep" />
        <label>8</label>
        <input type="radio" name="MonSleep9" value="7" v-model="monday.sleep" />
        <label>9</label>
        <input type="radio" name="MonSleep10" value="8" v-model="monday.sleep" />
        <label>10</label>
        <input type="radio" name="MonSleep11" value="9" v-model="monday.sleep" />
        <label>11</label>
        <input type="radio" name="MonSleep12" value="10" v-model="monday.sleep" />
        <label>12</label><br/><br/>

        <label class="propheaders">Daily Activities - Tuesday</label><br/><br/>
        <label>Study</label> <br/>
        <input type="radio" name="TueStudy0" value="0" v-model="tuesday.study" />
        <label>0</label>
        <input type="radio" name="TueStudy1" value="1" v-model="tuesday.study" />
        <label>1</label>
        <input type="radio" name="TueStudy2" value="2" v-model="tuesday.study" />
        <label>2</label>
        <input type="radio" name="TueStudy3" value="3" v-model="tuesday.study" />
        <label>3</label>
        <input type="radio" name="TueStudy4" value="4" v-model="tuesday.study" />
        <label>4</label>
        <input type="radio" name="TueStudy5" value="5" v-model="tuesday.study" />
        <label>5</label> 
        <input type="radio" name="TueStudy6" value="6" v-model="tuesday.study" />
        <label>6</label><br/><br/>

        
        <label>Reading</label> <br/>
        <input type="radio" name="TueRead0" value="0" v-model="tuesday.read" />
        <label>0</label>
        <input type="radio" name="TueRead1" value="1" v-model="tuesday.read" />
        <label>1</label>
        <input type="radio" name="TueRead2" value="2" v-model="tuesday.read" />
        <label>2</label>
        <input type="radio" name="TueRead3" value="3" v-model="tuesday.read" />
        <label>3</label>
        <input type="radio" name="TueRead4" value="4" v-model="tuesday.read" />
        <label>4</label>
        <input type="radio" name="TueRead5" value="5" v-model="tuesday.read" />
        <label>5</label> 
        <input type="radio" name="TueRead6" value="6" v-model="tuesday.read" />
        <label>6</label><br/><br/>

        
        <label>Writing</label> <br/>
        <input type="radio" name="TueWrite0" value="0" v-model="tuesday.writing" />
        <label>0</label>
        <input type="radio" name="TueWrite1" value="1" v-model="tuesday.writing" />
        <label>1</label>
        <input type="radio" name="TueWrite2" value="2" v-model="tuesday.writing" />
        <label>2</label>
        <input type="radio" name="TueWrite3" value="3" v-model="tuesday.writing" />
        <label>3</label>
        <input type="radio" name="TueWrite4" value="4" v-model="tuesday.writing" />
        <label>4</label>
        <input type="radio" name="TueWrite5" value="5" v-model="tuesday.writing" />
        <label>5</label> 
        <input type="radio" name="TueWrite6" value="6" v-model="tuesday.writing" />
        <label>6</label><br/><br/>

        <label>Watch tv</label> <br/>
        <input type="radio" name="MonTv0" value="0" v-model="tuesday.watchMonTv" />
        <label>0</label>
        <input type="radio" name="MonTv1" value="1" v-model="tuesday.watchMonTv" />
        <label>1</label>
        <input type="radio" name="MonTv2" value="2" v-model="tuesday.watchTv" />
        <label>2</label>
        <input type="radio" name="MonTv3" value="3" v-model="tuesday.watchTv" />
        <label>3</label>
        <input type="radio" name="MonTv4" value="4" v-model="tuesday.watchTv" />
        <label>4</label>
        <input type="radio" name="MonTv5" value="5" v-model="tuesday.watchTv" />
        <label>5</label> 
        <input type="radio" name="MonTv6" value="6" v-model="tuesday.watchTv" />
        <label>6</label><br/><br/>

        <label>Computer Games</label> <br/>
        <input type="radio" name="TueCgames0" value="0" v-model="tuesday.computerGames" />
        <label>0</label>
        <input type="radio" name="TueCgames1" value="1" v-model="tuesday.computerGames" />
        <label>1</label>
        <input type="radio" name="TueCgames2" value="2" v-model="tuesday.computerGames" />
        <label>2</label>
        <input type="radio" name="TueCgames3" value="3" v-model="tuesday.computerGames" />
        <label>3</label>
        <input type="radio" name="TueCgames4" value="4" v-model="tuesday.computerGames" />
        <label>4</label>
        <input type="radio" name="TueCgames5" value="5" v-model="tuesday.computerGames" />
        <label>5</label> 
        <input type="radio" name="TueCgames6" value="6" v-model="tuesday.computerGames" />
        <label>6</label><br/><br/>

        <label>Out Door Games</label> <br/>
        <input type="radio" name="TueGames0" value="0" v-model="tuesday.outDoorGames" />
        <label>0</label>
        <input type="radio" name="TueGames1" value="1" v-model="tuesday.outDoorGames" />
        <label>1</label>
        <input type="radio" name="TueGames2" value="2" v-model="tuesday.outDoorGames" />
        <label>2</label>
        <input type="radio" name="TueGames3" value="3" v-model="tuesday.outDoorGames" />
        <label>3</label>
        <input type="radio" name="TueGames4" value="4" v-model="tuesday.outDoorGames" />
        <label>4</label>
        <input type="radio" name="TueGames5" value="5" v-model="tuesday.outDoorGames" />
        <label>5</label> 
        <input type="radio" name="TueGames6" value="6" v-model="tuesday.outDoorGames" />
        <label>6</label><br/><br/>

        <label>Travel</label> <br/>
        <input type="radio" name="TueTravel0" value="0" v-model="tuesday.travel" />
        <label>0</label>
        <input type="radio" name="TueTravel1" value="1" v-model="tuesday.travel" />
        <label>1</label>
        <input type="radio" name="TueTravel2" value="2" v-model="tuesday.travel" />
        <label>2</label>
        <input type="radio" name="TueTravel3" value="3" v-model="tuesday.travel" />
        <label>3</label>
        <input type="radio" name="TueTravel4" value="4" v-model="tuesday.travel" />
        <label>4</label>
        <input type="radio" name="TueTravel5" value="5" v-model="tuesday.travel" />
        <label>5</label> 
        <input type="radio" name="TueTravel6" value="6" v-model="tuesday.travel" />
        <label>6</label><br/><br/>

        <label>Sleeping</label> <br/>
        
        <input type="radio" name="TueSleep3" value="1" v-model="tuesday.sleep" />
        <label>3</label>
        <input type="radio" name="TueSleep4" value="2" v-model="tuesday.sleep" />
        <label>4</label>
        <input type="radio" name="TueSleep5" value="3" v-model="tuesday.sleep" />
        <label>5</label> 
        <input type="radio" name="TueSleep6" value="4" v-model="tuesday.sleep" />
        <label>6</label>
        <input type="radio" name="TueSleep7" value="5" v-model="tuesday.sleep" />
        <label>7</label>
        <input type="radio" name="TueSleep8" value="6" v-model="tuesday.sleep" />
        <label>8</label>
        <input type="radio" name="TueSleep9" value="7" v-model="tuesday.sleep" />
        <label>9</label>
        <input type="radio" name="TueSleep10" value="8" v-model="tuesday.sleep" />
        <label>10</label>
        <input type="radio" name="TueSleep11" value="9" v-model="tuesday.sleep" />
        <label>11</label>
        <input type="radio" name="TueSleep12" value="10" v-model="tuesday.sleep" />
        <label>12</label><br/><br/>

        <label class="propheaders">Daily Activities - Wednesday</label><br/><br/>
        <label>Study</label> <br/>
        <input type="radio" name="WedStudy0" value="0" v-model="wednesday.study" />
        <label>0</label>
        <input type="radio" name="WedStudy1" value="1" v-model="wednesday.study" />
        <label>1</label>
        <input type="radio" name="WedStudy2" value="2" v-model="wednesday.study" />
        <label>2</label>
        <input type="radio" name="WedStudy3" value="3" v-model="wednesday.study" />
        <label>3</label>
        <input type="radio" name="WedStudy4" value="4" v-model="wednesday.study" />
        <label>4</label>
        <input type="radio" name="WedStudy5" value="5" v-model="wednesday.study" />
        <label>5</label> 
        <input type="radio" name="WedStudy6" value="6" v-model="wednesday.study" />
        <label>6</label><br/><br/>

        
        <label>Reading</label> <br/>
        <input type="radio" name="WedRead0" value="0" v-model="wednesday.read" />
        <label>0</label>
        <input type="radio" name="WedRead1" value="1" v-model="wednesday.read" />
        <label>1</label>
        <input type="radio" name="WedRead2" value="2" v-model="wednesday.read" />
        <label>2</label>
        <input type="radio" name="WedRead3" value="3" v-model="wednesday.read" />
        <label>3</label>
        <input type="radio" name="WedRead4" value="4" v-model="wednesday.read" />
        <label>4</label>
        <input type="radio" name="WedRead5" value="5" v-model="wednesday.read" />
        <label>5</label> 
        <input type="radio" name="WedRead6" value="6" v-model="wednesday.read" />
        <label>6</label><br/><br/>

        
        <label>Writing</label> <br/>
        <input type="radio" name="WedWrite0" value="0" v-model="wednesday.writing" />
        <label>0</label>
        <input type="radio" name="WedWrite1" value="1" v-model="wednesday.writing" />
        <label>1</label>
        <input type="radio" name="WedWrite2" value="2" v-model="wednesday.writing" />
        <label>2</label>
        <input type="radio" name="WedWrite3" value="3" v-model="wednesday.writing" />
        <label>3</label>
        <input type="radio" name="WedWrite4" value="4" v-model="wednesday.writing" />
        <label>4</label>
        <input type="radio" name="WedWrite5" value="5" v-model="wednesday.writing" />
        <label>5</label> 
        <input type="radio" name="WedWrite6" value="6" v-model="wednesday.writing" />
        <label>6</label><br/><br/>

        <label>Watch tv</label> <br/>
        <input type="radio" name="TueTv0" value="0" v-model="wednesday.watchTv" />
        <label>0</label>
        <input type="radio" name="TueTv1" value="1" v-model="wednesday.watchTv" />
        <label>1</label>
        <input type="radio" name="TueTv2" value="2" v-model="wednesday.watchTv" />
        <label>2</label>
        <input type="radio" name="TueTv3" value="3" v-model="wednesday.watchTv" />
        <label>3</label>
        <input type="radio" name="TueTv4" value="4" v-model="wednesday.watchTv" />
        <label>4</label>
        <input type="radio" name="TueTv5" value="5" v-model="wednesday.watchTv" />
        <label>5</label> 
        <input type="radio" name="TueTv6" value="6" v-model="wednesday.watchTv" />
        <label>6</label><br/><br/>

        <label>Computer Games</label> <br/>
        <input type="radio" name="WedCgames0" value="0" v-model="wednesday.computerGames" />
        <label>0</label>
        <input type="radio" name="WedCgames1" value="1" v-model="wednesday.computerGames" />
        <label>1</label>
        <input type="radio" name="WedCgames2" value="2" v-model="wednesday.computerGames" />
        <label>2</label>
        <input type="radio" name="WedCgames3" value="3" v-model="wednesday.computerGames" />
        <label>3</label>
        <input type="radio" name="WedCgames4" value="4" v-model="wednesday.computerGames" />
        <label>4</label>
        <input type="radio" name="WedCgames5" value="5" v-model="wednesday.computerGames" />
        <label>5</label> 
        <input type="radio" name="WedCgames6" value="6" v-model="wednesday.computerGames" />
        <label>6</label><br/><br/>

        <label>Out Door Games</label> <br/>
        <input type="radio" name="WedGames0" value="0" v-model="wednesday.outDoorGames" />
        <label>0</label>
        <input type="radio" name="WedGames1" value="1" v-model="wednesday.outDoorGames" />
        <label>1</label>
        <input type="radio" name="WedGames2" value="2" v-model="wednesday.outDoorGames" />
        <label>2</label>
        <input type="radio" name="WedGames3" value="3" v-model="wednesday.outDoorGames" />
        <label>3</label>
        <input type="radio" name="WedGames4" value="4" v-model="wednesday.outDoorGames" />
        <label>4</label>
        <input type="radio" name="WedGames5" value="5" v-model="wednesday.outDoorGames" />
        <label>5</label> 
        <input type="radio" name="WedGames6" value="6" v-model="wednesday.outDoorGames" />
        <label>6</label><br/><br/>

        <label>Travel</label> <br/>
        <input type="radio" name="WedTravel0" value="0" v-model="wednesday.travel" />
        <label>0</label>
        <input type="radio" name="WedTravel1" value="1" v-model="wednesday.travel" />
        <label>1</label>
        <input type="radio" name="WedTravel2" value="2" v-model="wednesday.travel" />
        <label>2</label>
        <input type="radio" name="WedTravel3" value="3" v-model="wednesday.travel" />
        <label>3</label>
        <input type="radio" name="WedTravel4" value="4" v-model="wednesday.travel" />
        <label>4</label>
        <input type="radio" name="WedTravel5" value="5" v-model="wednesday.travel" />
        <label>5</label> 
        <input type="radio" name="WedTravel6" value="6" v-model="wednesday.travel" />
        <label>6</label><br/><br/>

        <label>Sleeping</label> <br/>
        
        <input type="radio" name="WedSleep3" value="1" v-model="wednesday.sleep" />
        <label>3</label>
        <input type="radio" name="WedSleep4" value="2" v-model="wednesday.sleep" />
        <label>4</label>
        <input type="radio" name="WedSleep5" value="3" v-model="wednesday.sleep" />
        <label>5</label> 
        <input type="radio" name="WedSleep6" value="4" v-model="wednesday.sleep" />
        <label>6</label>
        <input type="radio" name="WedSleep7" value="5" v-model="wednesday.sleep" />
        <label>7</label>
        <input type="radio" name="WedSleep8" value="6" v-model="wednesday.sleep" />
        <label>8</label>
        <input type="radio" name="WedSleep9" value="7" v-model="wednesday.sleep" />
        <label>9</label>
        <input type="radio" name="WedSleep10" value="8" v-model="wednesday.sleep" />
        <label>10</label>
        <input type="radio" name="WedSleep11" value="9" v-model="wednesday.sleep" />
        <label>11</label>
        <input type="radio" name="WedSleep12" value="10" v-model="wednesday.sleep" />
        <label>12</label><br/><br/>

        <label class="propheaders">Daily Activities - Thursday</label><br/><br/>
        <label>Study</label> <br/>
        <input type="radio" name="ThuStudy0" value="0" v-model="thursday.study" />
        <label>0</label>
        <input type="radio" name="ThuStudy1" value="1" v-model="thursday.study" />
        <label>1</label>
        <input type="radio" name="ThuStudy2" value="2" v-model="thursday.study" />
        <label>2</label>
        <input type="radio" name="ThuStudy3" value="3" v-model="thursday.study" />
        <label>3</label>
        <input type="radio" name="ThuStudy4" value="4" v-model="thursday.study" />
        <label>4</label>
        <input type="radio" name="ThuStudy5" value="5" v-model="thursday.study" />
        <label>5</label> 
        <input type="radio" name="ThuStudy6" value="6" v-model="thursday.study" />
        <label>6</label><br/><br/>

        
        <label>Reading</label> <br/>
        <input type="radio" name="ThuRead0" value="0" v-model="thursday.read" />
        <label>0</label>
        <input type="radio" name="ThuRead1" value="1" v-model="thursday.read" />
        <label>1</label>
        <input type="radio" name="ThuRead2" value="2" v-model="thursday.read" />
        <label>2</label>
        <input type="radio" name="ThuRead3" value="3" v-model="thursday.read" />
        <label>3</label>
        <input type="radio" name="ThuRead4" value="4" v-model="thursday.read" />
        <label>4</label>
        <input type="radio" name="ThuRead5" value="5" v-model="thursday.read" />
        <label>5</label> 
        <input type="radio" name="ThuRead6" value="6" v-model="thursday.read" />
        <label>6</label><br/><br/>

        
        <label>Writing</label> <br/>
        <input type="radio" name="ThuWrite0" value="0" v-model="thursday.writing" />
        <label>0</label>
        <input type="radio" name="ThuWrite1" value="1" v-model="thursday.writing" />
        <label>1</label>
        <input type="radio" name="ThuWrite2" value="2" v-model="thursday.writing" />
        <label>2</label>
        <input type="radio" name="ThuWrite3" value="3" v-model="thursday.writing" />
        <label>3</label>
        <input type="radio" name="ThuWrite4" value="4" v-model="thursday.writing" />
        <label>4</label>
        <input type="radio" name="ThuWrite5" value="5" v-model="thursday.writing" />
        <label>5</label> 
        <input type="radio" name="ThuWrite6" value="6" v-model="thursday.writing" />
        <label>6</label><br/><br/>

        <label>Watch tv</label> <br/>
        <input type="radio" name="WedTv0" value="0" v-model="thursday.watchTv" />
        <label>0</label>
        <input type="radio" name="WedTv1" value="1" v-model="thursday.watchTv" />
        <label>1</label>
        <input type="radio" name="WedTv2" value="2" v-model="thursday.watchTv" />
        <label>2</label>
        <input type="radio" name="WedTv3" value="3" v-model="thursday.watchTv" />
        <label>3</label>
        <input type="radio" name="WedTv4" value="4" v-model="thursday.watchTv" />
        <label>4</label>
        <input type="radio" name="WedTv5" value="5" v-model="thursday.watchTv" />
        <label>5</label> 
        <input type="radio" name="WedTv6" value="6" v-model="thursday.watchTv" />
        <label>6</label><br/><br/>

        <label>Computer Games</label> <br/>
        <input type="radio" name="ThuCgames0" value="0" v-model="thursday.computerGames" />
        <label>0</label>
        <input type="radio" name="ThuCgames1" value="1" v-model="thursday.computerGames" />
        <label>1</label>
        <input type="radio" name="ThuCgames2" value="2" v-model="thursday.computerGames" />
        <label>2</label>
        <input type="radio" name="ThuCgames3" value="3" v-model="thursday.computerGames" />
        <label>3</label>
        <input type="radio" name="ThuCgames4" value="4" v-model="thursday.computerGames" />
        <label>4</label>
        <input type="radio" name="ThuCgames5" value="5" v-model="thursday.computerGames" />
        <label>5</label> 
        <input type="radio" name="ThuCgames6" value="6" v-model="thursday.computerGames" />
        <label>6</label><br/><br/>

        <label>Out Door Games</label> <br/>
        <input type="radio" name="ThuGames0" value="0" v-model="thursday.outDoorGames" />
        <label>0</label>
        <input type="radio" name="ThuGames1" value="1" v-model="thursday.outDoorGames" />
        <label>1</label>
        <input type="radio" name="ThuGames2" value="2" v-model="thursday.outDoorGames" />
        <label>2</label>
        <input type="radio" name="ThuGames3" value="3" v-model="thursday.outDoorGames" />
        <label>3</label>
        <input type="radio" name="ThuGames4" value="4" v-model="thursday.outDoorGames" />
        <label>4</label>
        <input type="radio" name="ThuGames5" value="5" v-model="thursday.outDoorGames" />
        <label>5</label> 
        <input type="radio" name="ThuGames6" value="6" v-model="thursday.outDoorGames" />
        <label>6</label><br/><br/>

        <label>Travel</label> <br/>
        <input type="radio" name="ThuTravel0" value="0" v-model="thursday.travel" />
        <label>0</label>
        <input type="radio" name="ThuTravel1" value="1" v-model="thursday.travel" />
        <label>1</label>
        <input type="radio" name="ThuTravel2" value="2" v-model="thursday.travel" />
        <label>2</label>
        <input type="radio" name="ThuTravel3" value="3" v-model="thursday.travel" />
        <label>3</label>
        <input type="radio" name="ThuTravel4" value="4" v-model="thursday.travel" />
        <label>4</label>
        <input type="radio" name="ThuTravel5" value="5" v-model="thursday.travel" />
        <label>5</label> 
        <input type="radio" name="ThuTravel6" value="6" v-model="thursday.travel" />
        <label>6</label><br/><br/>

        <label>Sleeping</label> <br/>
        
        <input type="radio" name="ThuSleep3" value="1" v-model="thursday.sleep" />
        <label>3</label>
        <input type="radio" name="ThuSleep4" value="2" v-model="thursday.sleep" />
        <label>4</label>
        <input type="radio" name="ThuSleep5" value="3" v-model="thursday.sleep" />
        <label>5</label> 
        <input type="radio" name="ThuSleep6" value="4" v-model="thursday.sleep" />
        <label>6</label>
        <input type="radio" name="ThuSleep7" value="5" v-model="thursday.sleep" />
        <label>7</label>
        <input type="radio" name="ThuSleep8" value="6" v-model="thursday.sleep" />
        <label>8</label>
        <input type="radio" name="ThuSleep9" value="7" v-model="thursday.sleep" />
        <label>9</label>
        <input type="radio" name="ThuSleep10" value="8" v-model="thursday.sleep" />
        <label>10</label>
        <input type="radio" name="ThuSleep11" value="9" v-model="thursday.sleep" />
        <label>11</label>
        <input type="radio" name="ThuSleep12" value="10" v-model="thursday.sleep" />
        <label>12</label><br/><br/>

        <label class="propheaders">Daily Activities - Friday</label><br/><br/>
        <label>Study</label> <br/>
        <input type="radio" name="FriStudy0" value="0" v-model="friday.study" />
        <label>0</label>
        <input type="radio" name="FriStudy1" value="1" v-model="friday.study" />
        <label>1</label>
        <input type="radio" name="FriStudy2" value="2" v-model="friday.study" />
        <label>2</label>
        <input type="radio" name="FriStudy3" value="3" v-model="friday.study" />
        <label>3</label>
        <input type="radio" name="FriStudy4" value="4" v-model="friday.study" />
        <label>4</label>
        <input type="radio" name="FriStudy5" value="5" v-model="friday.study" />
        <label>5</label> 
        <input type="radio" name="FriStudy6" value="6" v-model="friday.study" />
        <label>6</label><br/><br/>

        
        <label>Reading</label> <br/>
        <input type="radio" name="FriRead0" value="0" v-model="friday.read" />
        <label>0</label>
        <input type="radio" name="FriRead1" value="1" v-model="friday.read" />
        <label>1</label>
        <input type="radio" name="FriRead2" value="2" v-model="friday.read" />
        <label>2</label>
        <input type="radio" name="FriRead3" value="3" v-model="friday.read" />
        <label>3</label>
        <input type="radio" name="FriRead4" value="4" v-model="friday.read" />
        <label>4</label>
        <input type="radio" name="FriRead5" value="5" v-model="friday.read" />
        <label>5</label> 
        <input type="radio" name="FriRead6" value="6" v-model="friday.read" />
        <label>6</label><br/><br/>

        
        <label>Writing</label> <br/>
        <input type="radio" name="FriWrite0" value="0" v-model="friday.writing" />
        <label>0</label>
        <input type="radio" name="FriWrite1" value="1" v-model="friday.writing" />
        <label>1</label>
        <input type="radio" name="FriWrite2" value="2" v-model="friday.writing" />
        <label>2</label>
        <input type="radio" name="FriWrite3" value="3" v-model="friday.writing" />
        <label>3</label>
        <input type="radio" name="FriWrite4" value="4" v-model="friday.writing" />
        <label>4</label>
        <input type="radio" name="FriWrite5" value="5" v-model="friday.writing" />
        <label>5</label> 
        <input type="radio" name="FriWrite6" value="6" v-model="friday.writing" />
        <label>6</label><br/><br/>

        <label>Watch tv</label> <br/>
        <input type="radio" name="FriTv0" value="0" v-model="friday.watchTv" />
        <label>0</label>
        <input type="radio" name="FriTv1" value="1" v-model="friday.watchTv" />
        <label>1</label>
        <input type="radio" name="FriTv2" value="2" v-model="friday.watchTv" />
        <label>2</label>
        <input type="radio" name="FriTv3" value="3" v-model="friday.watchTv" />
        <label>3</label>
        <input type="radio" name="FriTv4" value="4" v-model="friday.watchTv" />
        <label>4</label>
        <input type="radio" name="FriTv5" value="5" v-model="friday.watchTv" />
        <label>5</label> 
        <input type="radio" name="FriTv6" value="6" v-model="friday.watchTv" />
        <label>6</label><br/><br/>

        <label>Computer Games</label> <br/>
        <input type="radio" name="FriCgames0" value="0" v-model="friday.computerGames" />
        <label>0</label>
        <input type="radio" name="FriCgames1" value="1" v-model="friday.computerGames" />
        <label>1</label>
        <input type="radio" name="FriCgames2" value="2" v-model="friday.computerGames" />
        <label>2</label>
        <input type="radio" name="FriCgames3" value="3" v-model="friday.computerGames" />
        <label>3</label>
        <input type="radio" name="FriCgames4" value="4" v-model="friday.computerGames" />
        <label>4</label>
        <input type="radio" name="FriCgames5" value="5" v-model="friday.computerGames" />
        <label>5</label> 
        <input type="radio" name="FriCgames6" value="6" v-model="friday.computerGames" />
        <label>6</label><br/><br/>

        <label>Out Door Games</label> <br/>
        <input type="radio" name="FriGames0" value="0" v-model="friday.outDoorGames" />
        <label>0</label>
        <input type="radio" name="FriGames1" value="1" v-model="friday.outDoorGames" />
        <label>1</label>
        <input type="radio" name="FriGames2" value="2" v-model="friday.outDoorGames" />
        <label>2</label>
        <input type="radio" name="FriGames3" value="3" v-model="friday.outDoorGames" />
        <label>3</label>
        <input type="radio" name="FriGames4" value="4" v-model="friday.outDoorGames" />
        <label>4</label>
        <input type="radio" name="FriGames5" value="5" v-model="friday.outDoorGames" />
        <label>5</label> 
        <input type="radio" name="FriGames6" value="6" v-model="friday.outDoorGames" />
        <label>6</label><br/><br/>

        <label>Travel</label> <br/>
        <input type="radio" name="FriTravel0" value="0" v-model="friday.travel" />
        <label>0</label>
        <input type="radio" name="FriTravel1" value="1" v-model="friday.travel" />
        <label>1</label>
        <input type="radio" name="FriTravel2" value="2" v-model="friday.travel" />
        <label>2</label>
        <input type="radio" name="FriTravel3" value="3" v-model="friday.travel" />
        <label>3</label>
        <input type="radio" name="FriTravel4" value="4" v-model="friday.travel" />
        <label>4</label>
        <input type="radio" name="FriTravel5" value="5" v-model="friday.travel" />
        <label>5</label> 
        <input type="radio" name="FriTravel6" value="6" v-model="friday.travel" />
        <label>6</label><br/><br/>

        <label>Sleeping</label> <br/>
        
        <input type="radio" name="FriSleep3" value="1" v-model="friday.sleep" />
        <label>3</label>
        <input type="radio" name="FriSleep4" value="2" v-model="friday.sleep" />
        <label>4</label>
        <input type="radio" name="FriSleep5" value="3" v-model="friday.sleep" />
        <label>5</label> 
        <input type="radio" name="FriSleep6" value="4" v-model="friday.sleep" />
        <label>6</label>
        <input type="radio" name="FriSleep7" value="5" v-model="friday.sleep" />
        <label>7</label>
        <input type="radio" name="FriSleep8" value="6" v-model="friday.sleep" />
        <label>8</label>
        <input type="radio" name="FriSleep9" value="7" v-model="friday.sleep" />
        <label>9</label>
        <input type="radio" name="FriSleep10" value="8" v-model="friday.sleep" />
        <label>10</label>
        <input type="radio" name="FriSleep11" value="9" v-model="friday.sleep" />
        <label>11</label>
        <input type="radio" name="FriSleep12" value="10" v-model="friday.sleep" />
        <label>12</label><br/><br/>

        <label class="propheaders">Daily Activities - Saturday</label><br/><br/>
        <label>Study</label> <br/>
        <input type="radio" name="SatStudy0" value="0" v-model="saturday.study" />
        <label>0</label>
        <input type="radio" name="SatStudy1" value="1" v-model="saturday.study" />
        <label>1</label>
        <input type="radio" name="SatStudy2" value="2" v-model="saturday.study" />
        <label>2</label>
        <input type="radio" name="SatStudy3" value="3" v-model="saturday.study" />
        <label>3</label>
        <input type="radio" name="SatStudy4" value="4" v-model="saturday.study" />
        <label>4</label>
        <input type="radio" name="SatStudy5" value="5" v-model="saturday.study" />
        <label>5</label> 
        <input type="radio" name="SatStudy6" value="6" v-model="saturday.study" />
        <label>6</label><br/><br/>

        
        <label>Reading</label> <br/>
        <input type="radio" name="SatRead0" value="0" v-model="saturday.read" />
        <label>0</label>
        <input type="radio" name="SatRead1" value="1" v-model="saturday.read" />
        <label>1</label>
        <input type="radio" name="SatRead2" value="2" v-model="saturday.read" />
        <label>2</label>
        <input type="radio" name="SatRead3" value="3" v-model="saturday.read" />
        <label>3</label>
        <input type="radio" name="SatRead4" value="4" v-model="saturday.read" />
        <label>4</label>
        <input type="radio" name="SatRead5" value="5" v-model="saturday.read" />
        <label>5</label> 
        <input type="radio" name="SatRead6" value="6" v-model="saturday.read" />
        <label>6</label><br/><br/>

        
        <label>Writing</label> <br/>
        <input type="radio" name="SatWrite0" value="0" v-model="saturday.writing" />
        <label>0</label>
        <input type="radio" name="SatWrite1" value="1" v-model="saturday.writing" />
        <label>1</label>
        <input type="radio" name="SatWrite2" value="2" v-model="saturday.writing" />
        <label>2</label>
        <input type="radio" name="SatWrite3" value="3" v-model="saturday.writing" />
        <label>3</label>
        <input type="radio" name="SatWrite4" value="4" v-model="saturday.writing" />
        <label>4</label>
        <input type="radio" name="SatWrite5" value="5" v-model="saturday.writing" />
        <label>5</label> 
        <input type="radio" name="SatWrite6" value="6" v-model="saturday.writing" />
        <label>6</label><br/><br/>

        <label>Watch tv</label> <br/>
        <input type="radio" name="SatTv0" value="0" v-model="saturday.watchTv" />
        <label>0</label>
        <input type="radio" name="SatTv1" value="1" v-model="saturday.watchTv" />
        <label>1</label>
        <input type="radio" name="SatTv2" value="2" v-model="saturday.watchTv" />
        <label>2</label>
        <input type="radio" name="SatTv3" value="3" v-model="saturday.watchTv" />
        <label>3</label>
        <input type="radio" name="SatTv4" value="4" v-model="saturday.watchTv" />
        <label>4</label>
        <input type="radio" name="SatTv5" value="5" v-model="saturday.watchTv" />
        <label>5</label> 
        <input type="radio" name="SatTv6" value="6" v-model="saturday.watchTv" />
        <label>6</label><br/><br/>

        <label>Computer Games</label> <br/>
        <input type="radio" name="SatCgames0" value="0" v-model="saturday.computerGames" />
        <label>0</label>
        <input type="radio" name="SatCgames1" value="1" v-model="saturday.computerGames" />
        <label>1</label>
        <input type="radio" name="SatCgames2" value="2" v-model="saturday.computerGames" />
        <label>2</label>
        <input type="radio" name="SatCgames3" value="3" v-model="saturday.computerGames" />
        <label>3</label>
        <input type="radio" name="SatCgames4" value="4" v-model="saturday.computerGames" />
        <label>4</label>
        <input type="radio" name="SatCgames5" value="5" v-model="saturday.computerGames" />
        <label>5</label> 
        <input type="radio" name="SatCgames6" value="6" v-model="saturday.computerGames" />
        <label>6</label><br/><br/>

        <label>Out Door Games</label> <br/>
        <input type="radio" name="SatGames0" value="0" v-model="saturday.outDoorGames" />
        <label>0</label>
        <input type="radio" name="SatGames1" value="1" v-model="saturday.outDoorGames" />
        <label>1</label>
        <input type="radio" name="SatGames2" value="2" v-model="saturday.outDoorGames" />
        <label>2</label>
        <input type="radio" name="SatGames3" value="3" v-model="saturday.outDoorGames" />
        <label>3</label>
        <input type="radio" name="SatGames4" value="4" v-model="saturday.outDoorGames" />
        <label>4</label>
        <input type="radio" name="SatGames5" value="5" v-model="saturday.outDoorGames" />
        <label>5</label> 
        <input type="radio" name="SatGames6" value="6" v-model="saturday.outDoorGames" />
        <label>6</label><br/><br/>

        <label>Travel</label> <br/>
        <input type="radio" name="SatTravel0" value="0" v-model="saturday.travel" />
        <label>0</label>
        <input type="radio" name="SatTravel1" value="1" v-model="saturday.travel" />
        <label>1</label>
        <input type="radio" name="SatTravel2" value="2" v-model="saturday.travel" />
        <label>2</label>
        <input type="radio" name="SatTravel3" value="3" v-model="saturday.travel" />
        <label>3</label>
        <input type="radio" name="SatTravel4" value="4" v-model="saturday.travel" />
        <label>4</label>
        <input type="radio" name="SatTravel5" value="5" v-model="saturday.travel" />
        <label>5</label> 
        <input type="radio" name="SatTravel6" value="6" v-model="saturday.travel" />
        <label>6</label><br/><br/>

        <label>Sleeping</label> <br/>
        
        <input type="radio" name="SatSleep3" value="1" v-model="saturday.sleep" />
        <label>3</label>
        <input type="radio" name="SatSleep4" value="2" v-model="saturday.sleep" />
        <label>4</label>
        <input type="radio" name="SatSleep5" value="3" v-model="saturday.sleep" />
        <label>5</label> 
        <input type="radio" name="SatSleep6" value="4" v-model="saturday.sleep" />
        <label>6</label>
        <input type="radio" name="SatSleep7" value="5" v-model="saturday.sleep" />
        <label>7</label>
        <input type="radio" name="SatSleep8" value="6" v-model="saturday.sleep" />
        <label>8</label>
        <input type="radio" name="SatSleep9" value="7" v-model="saturday.sleep" />
        <label>9</label>
        <input type="radio" name="SatSleep10" value="8" v-model="saturday.sleep" />
        <label>10</label>
        <input type="radio" name="SatSleep11" value="9" v-model="saturday.sleep" />
        <label>11</label>
        <input type="radio" name="SatSleep12" value="10" v-model="saturday.sleep" />
        <label>12</label><br/><br/>

        <label class="propheaders">Daily Activities - Sunday</label><br/><br/>
        <label>Study</label> <br/>
        <input type="radio" name="SunStudy0" value="0" v-model="sunday.study" />
        <label>0</label>
        <input type="radio" name="SunStudy1" value="1" v-model="sunday.study" />
        <label>1</label>
        <input type="radio" name="SunStudy2" value="2" v-model="sunday.study" />
        <label>2</label>
        <input type="radio" name="SunStudy3" value="3" v-model="sunday.study" />
        <label>3</label>
        <input type="radio" name="SunStudy4" value="4" v-model="sunday.study" />
        <label>4</label>
        <input type="radio" name="SunStudy5" value="5" v-model="sunday.study" />
        <label>5</label> 
        <input type="radio" name="SunStudy6" value="6" v-model="sunday.study" />
        <label>6</label><br/><br/>

        
        <label>Reading</label> <br/>
        <input type="radio" name="SunRead0" value="0" v-model="sunday.read" />
        <label>0</label>
        <input type="radio" name="SunRead1" value="1" v-model="sunday.read" />
        <label>1</label>
        <input type="radio" name="SunRead2" value="2" v-model="sunday.read" />
        <label>2</label>
        <input type="radio" name="SunRead3" value="3" v-model="sunday.read" />
        <label>3</label>
        <input type="radio" name="SunRead4" value="4" v-model="sunday.read" />
        <label>4</label>
        <input type="radio" name="SunRead5" value="5" v-model="sunday.read" />
        <label>5</label> 
        <input type="radio" name="SunRead6" value="6" v-model="sunday.read" />
        <label>6</label><br/><br/>

        
        <label>Writing</label> <br/>
        <input type="radio" name="Sunwrite0" value="0" v-model="sunday.writing" />
        <label>0</label>
        <input type="radio" name="Sunwrite1" value="1" v-model="sunday.writing" />
        <label>1</label>
        <input type="radio" name="SunWrite2" value="2" v-model="sunday.writing" />
        <label>2</label>
        <input type="radio" name="SunWrite3" value="3" v-model="sunday.writing" />
        <label>3</label>
        <input type="radio" name="SunWrite4" value="4" v-model="sunday.writing" />
        <label>4</label>
        <input type="radio" name="SunWrite5" value="5" v-model="sunday.writing" />
        <label>5</label> 
        <input type="radio" name="SunWrite6" value="6" v-model="sunday.writing" />
        <label>6</label><br/><br/>

        <label>Watch tv</label> <br/>
        <input type="radio" name="SunTv0" value="0" v-model="sunday.watchTv" />
        <label>0</label>
        <input type="radio" name="SunTv1" value="1" v-model="sunday.watchTv" />
        <label>1</label>
        <input type="radio" name="SunTv2" value="2" v-model="sunday.watchTv" />
        <label>2</label>
        <input type="radio" name="SunTv3" value="3" v-model="sunday.watchTv" />
        <label>3</label>
        <input type="radio" name="SunTv4" value="4" v-model="sunday.watchTv" />
        <label>4</label>
        <input type="radio" name="SunTv5" value="5" v-model="sunday.watchTv" />
        <label>5</label> 
        <input type="radio" name="SunTv6" value="6" v-model="sunday.watchTv" />
        <label>6</label><br/><br/>

        <label>Computer Games</label> <br/>
        <input type="radio" name="SunCgames0" value="0" v-model="sunday.computerGames" />
        <label>0</label>
        <input type="radio" name="SunCgames1" value="1" v-model="sunday.computerGames" />
        <label>1</label>
        <input type="radio" name="SunCgames2" value="2" v-model="sunday.computerGames" />
        <label>2</label>
        <input type="radio" name="SunCgames3" value="3" v-model="sunday.computerGames" />
        <label>3</label>
        <input type="radio" name="SunCgames4" value="4" v-model="sunday.computerGames" />
        <label>4</label>
        <input type="radio" name="SunCgames5" value="5" v-model="sunday.computerGames" />
        <label>5</label> 
        <input type="radio" name="SunCgames6" value="6" v-model="sunday.computerGames" />
        <label>6</label><br/><br/>

        <label>Out Door Games</label> <br/>
        <input type="radio" name="SunGames0" value="0" v-model="sunday.outDoorGames" />
        <label>0</label>
        <input type="radio" name="SunGames1" value="1" v-model="sunday.outDoorGames" />
        <label>1</label>
        <input type="radio" name="SunGames2" value="2" v-model="sunday.outDoorGames" />
        <label>2</label>
        <input type="radio" name="SunGames3" value="3" v-model="sunday.outDoorGames" />
        <label>3</label>
        <input type="radio" name="SunGames4" value="4" v-model="sunday.outDoorGames" />
        <label>4</label>
        <input type="radio" name="SunGames5" value="5" v-model="sunday.outDoorGames" />
        <label>5</label> 
        <input type="radio" name="SunGames6" value="6" v-model="sunday.outDoorGames" />
        <label>6</label><br/><br/>

        <label>Travel</label> <br/>
        <input type="radio" name="SunTravel0" value="0" v-model="sunday.travel" />
        <label>0</label>
        <input type="radio" name="SunTravel1" value="1" v-model="sunday.travel" />
        <label>1</label>
        <input type="radio" name="SunTravel2" value="2" v-model="sunday.travel" />
        <label>2</label>
        <input type="radio" name="SunTravel3" value="3" v-model="sunday.travel" />
        <label>3</label>
        <input type="radio" name="SunTravel4" value="4" v-model="sunday.travel" />
        <label>4</label>
        <input type="radio" name="SunTravel5" value="5" v-model="sunday.travel" />
        <label>5</label> 
        <input type="radio" name="SunTravel6" value="6" v-model="sunday.travel" />
        <label>6</label><br/><br/>

        <label>Sleeping</label> <br/>
        
        <input type="radio" name="SunSleep3" value="1" v-model="sunday.sleep" />
        <label>3</label>
        <input type="radio" name="SunSleep4" value="2" v-model="sunday.sleep" />
        <label>4</label>
        <input type="radio" name="SunSleep5" value="3" v-model="sunday.sleep" />
        <label>5</label> 
        <input type="radio" name="SunSleep6" value="4" v-model="sunday.sleep" />
        <label>6</label>
        <input type="radio" name="SunSleep7" value="5" v-model="sunday.sleep" />
        <label>7</label>
        <input type="radio" name="SunSleep8" value="6" v-model="sunday.sleep" />
        <label>8</label>
        <input type="radio" name="SunSleep9" value="7" v-model="sunday.sleep" />
        <label>9</label>
        <input type="radio" name="SunSleep10" value="8" v-model="sunday.sleep" />
        <label>10</label>
        <input type="radio" name="SunSleep11" value="9" v-model="sunday.sleep" />
        <label>11</label>
        <input type="radio" name="SunSleep12" value="10" v-model="sunday.sleep" />
        <label>12</label><br/><br/>
        


            
            
        </div> 

        <button class="compareButton" v-on:click.prevent="postProps" > Submit </button>

           
    </div>
</template>

<script>

import { router } from '../_helpers';

export default{
    data(){
        return{
            radio:{
                read:'',
                shop: '',
                paint: '',
                tv: '',
                travel: '',
                run: '',
                movie: '',
                sleep:'',
                dance: '',
                cycle: '',
                cook: '',
                garden: '',
                swim: '',
                cricket: '',
                walk: '',
                write: '',
                football: '',
                workout: '',
                skiing: '',
                games: ''
            },
            properties:{
                interested:[],
                notInterested:[],
                FavouriteMusic:[],
                FavouriteCuisine:[],
                FavouriteReads:[],
                FavouriteMovies:[],
                SpokenLanguages:[],
                Education:[],
                wantToBecome: [],
                sslc: '',
                plusTwo: '',
                degree: '',
                Food: []

            },
            monday:{
                study: '',
                read: '',
                writing: '',
                watchTv :'',
                computerGames: '',
                outDoorGames: '',
                travel: '',
                sleep: ''

            },
            tuesday:{
                study: '',
                read: '',
                writing: '',
                watchTv :'',
                computerGames: '',
                outDoorGames: '',
                travel: '',
                sleep: ''
            },
            wednesday:{
                study: '',
                read: '',
                writing: '',
                watchTv :'',
                computerGames: '',
                outDoorGames: '',
                travel: '',
                sleep: ''

            },
            thursday:{
                study: '',
                read: '',
                writing: '',
                watchTv :'',
                computerGames: '',
                outDoorGames: '',
                travel: '',
                sleep: ''
            },
            friday:{
                study: '',
                read: '',
                writing: '',
                watchTv :'',
                computerGames: '',
                outDoorGames: '',
                travel: '',
                sleep: ''

            },
            saturday:{
                study: '',
                read: '',
                writing: '',
                watchTv :'',
                computerGames: '',
                outDoorGames: '',
                travel: '',
                sleep: ''
            },
            sunday:{
                study: '',
                read: '',
                writing: '',
                watchTv :'',
                computerGames: '',
                outDoorGames: '',
                travel: '',
                sleep: ''
            },
            user: ''
        }
    },
    methods:{
        insert:function(value){
            if(!this.properties.interested.includes(value) && !this.properties.notInterested.includes(value))
            {
            this.properties.interested.push(value);
            }
        },
        insert1:function(value){
            if(!this.properties.interested.includes(value) && !this.properties.notInterested.includes(value))
            {
            this.properties.notInterested.push(value);
            }
        },
postProps:function(){
            this.$http.post('http://localhost:9004/properties/create',{
                userSessionDetails: localStorage.getItem('userName'),
                preDefinedProperties:[{
                interested: this.properties.interested,
                notInterested: this.properties.notInterested,
                FavouriteMusic: this.properties.FavouriteMusic,
                FavouriteCuisine: this.properties.FavouriteCuisine,
                FavouriteReads: this.properties.FavouriteReads,
                FavouriteMovies: this.properties.FavouriteMovies,
                SpokenLanguages: this.properties.SpokenLanguages,
                Education: this.properties.Education,
                wantToBecome: this.properties.wantToBecome,
                likesToEat: this.properties.Food
                }],
                miscProperties:{
                sslcMarks: this.properties.sslc,
                plusTwoMarks: this.properties.plusTwo,
                degreeMarks: this.properties.degree,
                MonStudy: this.monday.study,
                MonRead: this.monday.read,
                MonWrite: this.monday.writing,
                MonWatchTv: this.monday.watchTv,
                MonComputerGames: this.monday.computerGames,
                MonOutDoorGames: this.monday.outDoorGames,
                MonTravel: this.monday.travel,
                MonSleep: this.monday.sleep,

                TueStudy: this.tuesday.study,
                TueRead: this.tuesday.read,
                TueWrite: this.tuesday.writing,
                TueWatchTv: this.tuesday.watchTv,
                TueComputerGames: this.tuesday.computerGames,
                TueOutDoorGames: this.tuesday.outDoorGames,
                TueTravel: this.tuesday.travel,
                TueSleep: this.tuesday.sleep,

                WedStudy: this.wednesday.study,
                WedRead: this.wednesday.read,
                WedWrite: this.wednesday.writing,
                WedWatchTv: this.wednesday.watchTv,
                WedComputerGames: this.wednesday.computerGames,
                WedOutDoorGames: this.wednesday.outDoorGames,
                WedTravel: this.wednesday.travel,
                WedSleep: this.wednesday.sleep,

                ThuStudy: this.thursday.study,
                ThuRead: this.thursday.read,
                ThuWrite: this.thursday.writing,
                ThuWatchTv: this.thursday.watchTv,
                ThuComputerGames: this.thursday.computerGames,
                ThuOutDoorGames: this.thursday.outDoorGames,
                ThuTravel: this.thursday.travel,
                ThuSleep: this.thursday.sleep,

                FriStudy: this.friday.study,
                FriRead: this.friday.read,
                FriWrite: this.friday.writing,
                FriWatchTv: this.friday.watchTv,
                FriComputerGames: this.friday.computerGames,
                FriOutDoorGames: this.friday.outDoorGames,
                FriTravel: this.friday.travel,
                FriSleep: this.friday.sleep,

                SatStudy: this.saturday.study,
                SatRead: this.saturday.read,
                SatWrite: this.saturday.writing,
                SatWatchTv: this.saturday.watchTv,
                SatComputerGames: this.saturday.computerGames,
                SatOutDoorGames: this.saturday.outDoorGames,
                SatTravel: this.saturday.travel,
                SatSleep: this.saturday.sleep,

                SunStudy: this.sunday.study,
                SunRead: this.sunday.read,
                SunWrite: this.sunday.writing,
                SunWatchTv: this.sunday.watchTv,
                SunComputerGames: this.sunday.computerGames,
                SunOutDoorGames: this.sunday.outDoorGames,
                SunTravel: this.sunday.travel,
                SunSleep: this.sunday.sleep,
                
                }
                
                

            }).then(function(data){
                router.push('/formData')
                if(data.status == 200){
                    alert( 'data updated succesfully');
                    this.$router.go();
                    
                    }
                    else
                    {
                        alert( 'Could not update data, Please try again ');
                        this.$router.go();
                    }
                console.log(data); 
                
            });
        }
        
        
    }

    
}
</script>