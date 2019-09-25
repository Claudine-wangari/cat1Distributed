//package com.classexercisedwo.demo;
//
//
//import com.classexercisedwo.demo.springclass.models.Movie;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
////@FeignClient(name= "name",url="http://10.51.10.111:9090")
////@FeignClient(name= "name",url="http://10.51.10.111:9090")
//public interface FeignRestClient {
//
//    @RequestMapping(method = RequestMethod.GET, value= "movies")
//    List<Movie> getAllMovies();
//
//    @RequestMapping(method = RequestMethod.GET, value = "movies/{id}")
//    Movie findById(@PathVariable(name = "id") Long id);
//
//    @RequestMapping(method = RequestMethod.POST, value = "movies")
//    Movie createMovie(@RequestBody Movie movie);
//
//    @RequestMapping(method = RequestMethod.PATCH, value ="movies/{id}")
//    Movie updateMovie(@PathVariable(name = "id") Long id, @RequestBody Movie nMovie);
//
//}
