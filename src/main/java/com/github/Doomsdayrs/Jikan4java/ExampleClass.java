package com.github.Doomsdayrs.Jikan4java;

import com.github.Doomsdayrs.Jikan4java.core.search.TopSearch;
import com.github.Doomsdayrs.Jikan4java.enums.top.SharedTops;
import com.github.Doomsdayrs.Jikan4java.enums.top.Tops;
import com.github.Doomsdayrs.Jikan4java.exceptions.IncompatibleEnumException;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 * Jikan4java
 * 28 / October / 2018
 *
 * @author github.com/doomsdayrs
 */
class ExampleClass {

    /**
     * Example method
     *
     * @param args Args
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException, IncompatibleEnumException {
        /*
        AnimeConnection animeConnection = new AnimeConnection();
        CharacterConnection characterConnection = new CharacterConnection();
        ClubConnection clubConnection = new ClubConnection();
        GenreConnection genreConnection = new GenreConnection();
        MagazineConnection magazineConnection = new MagazineConnection();
        MangaConnection mangaConnection = new MangaConnection();
        MetaConnection metaConnection = new MetaConnection();
        PersonConnection personConnection = new PersonConnection();
        ProducerConnection producerConnection = new ProducerConnection();
        ScheduleConnection scheduleConnection = new ScheduleConnection();
        SeasonConnection seasonConnection = new SeasonConnection();
        TopConnection topConnection = new TopConnection();
        UserConnection userConnection = new UserConnection();

        animeConnection.searchAnimeById(1).thenAccept(System.out::println);

        TimeUnit.SECONDS.sleep(1);

        characterConnection.searchPage("re", 1).thenAccept(System.out::println);

        TimeUnit.SECONDS.sleep(1);

        clubConnection.core(12).thenAccept(System.out::println);

        TimeUnit.SECONDS.sleep(1);

        genreConnection.searchAnimeGenre(AnimeGenres.ACTION).thenAccept(System.out::println);

        TimeUnit.SECONDS.sleep(1);

        genreConnection.searchMangaGenre(MangaGenres.ACTION).thenAccept(System.out::println);

        TimeUnit.SECONDS.sleep(1);

        magazineConnection.searchPage(1, 1).thenAccept(System.out::println);

        TimeUnit.SECONDS.sleep(1);

        mangaConnection.core("Ajin").thenAccept(System.out::println);

        TimeUnit.SECONDS.sleep(1);

        metaConnection.getStatus().thenAccept(System.out::println);

        TimeUnit.SECONDS.sleep(1);

        personConnection.core("re").thenAccept(System.out::println);

        TimeUnit.SECONDS.sleep(1);

        producerConnection.core(16, 2).thenAccept(System.out::println);

        TimeUnit.SECONDS.sleep(1);

        scheduleConnection.scheduleSearch(Days.MONDAY).thenAccept(System.out::println);

        TimeUnit.SECONDS.sleep(1);

        seasonConnection.seasonSearch(2018, Season.FALL).thenAccept(System.out::println);

        TimeUnit.SECONDS.sleep(1);

        topConnection.core(Tops.ANIME).thenAccept(System.out::println);

        TimeUnit.SECONDS.sleep(1);

        userConnection.core("doomsdayrs").thenAccept(System.out::println);


*/
        // Well, after this point you should get an idea, use code completion or decompile the classes to see what are methods available;
 /*       int a = 0;
        MangaSearch core = new MangaSearch().setQuery("boku");
        core.setLimit(2);
        core.addGenre(MangaGenres.ACTION);
        core.setStatus(AnimeStati.COMPLETE);

        CompletableFuture completableFuture = core.get();
        while (!completableFuture.isDone()) {
            a++;
        }
        System.out.println(completableFuture.get());

        TimeUnit.SECONDS.sleep(1);

        completableFuture = core.getFirst();
        while (!completableFuture.isDone()) {
            a++;
        }
        System.out.println(completableFuture.get());
*/

        //    User user = new Connector().userSearch("doomsdayrs").get();
        //  UserListingSearch userListingSearch = user.getListingSearch();
        //System.out.println(userListingSearch.getMangaList(MangaListFilters.DROPPED).get());

        TopSearch topSearch = new TopSearch();
        System.out.println(topSearch.searchTop(Tops.ANIME, SharedTops.BY_POPULARITY).get());
        System.out.println(topSearch.searchTop(Tops.MANGA, SharedTops.BY_POPULARITY).get());
        TimeUnit.SECONDS.sleep(1);
        System.out.println(topSearch.searchTop(Tops.PEOPLE, SharedTops.FAVORITE).get());
        System.out.println(topSearch.searchTop(Tops.CHARACTERS, SharedTops.BY_POPULARITY).get());
    }

}
