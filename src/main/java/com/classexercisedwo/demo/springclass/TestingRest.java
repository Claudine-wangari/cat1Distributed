//package com.classexercisedwo.demo.springclass;
//
//import com.classexercisedwo.demo.FeignRestClient;
//import com.classexercisedwo.demo.springclass.models.Movie;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.List;
//
////@Component
//public class TestingRest implements CommandLineRunner {
//
//    private final FeignRestClient feignRestClient;
//
//    public TestingRest(FeignRestClient feignRestClient) {
//        this.feignRestClient = feignRestClient;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        RestTemplate restTemplate = new RestTemplate();
//
//        //GET request from a server using REST.
//
//        ResponseEntity<List<Movie>> response = restTemplate.exchange(
//                "http://10.51.10.111:9090/movies",
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<Movie>>() {
//                });
//        List<Movie> movies = response.getBody();
//        System.out.println(movies.toString());
//
//        Movie movie = restTemplate.getForObject("http://10.51.10.111:9090/movies/3", Movie.class);
//        System.err.println(movie.toString());
//
//        String url = "http://10.51.10.111:9090/movies/search?name=" + movie.getName();
//        Movie movieByName = restTemplate.getForObject(url, Movie.class);
//        System.err.println(movieByName.getName());
//
////Requests using Feign
//
//        //Listing all movies
//        movies = feignRestClient.getAllMovies();
//        System.err.println(movies.toString());
//
//        //Creating a new movie
//        Movie nMovie = new Movie("Hey Rosie", "2017");
//        nMovie = feignRestClient.createMovie(nMovie);
//        System.out.println("Created movie: " + nMovie.toString());
//
//        //Updating a new movie
//        nMovie.setName("Crazy Rosie");
//        feignRestClient.updateMovie(nMovie.getId(), nMovie);
//        System.out.println("Updated movie: " + nMovie.toString());
//    }
//}
