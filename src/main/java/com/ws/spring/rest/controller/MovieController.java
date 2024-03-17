/**
 * 
 */
package com.ws.spring.rest.controller;

import java.util.List;


/**
 * @author modug
 *
 */

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/movie")
public class MovieController {

	public DataAccessLayer daLayer;
	
	
	public DataAccessLayer getDaLayer() {
		return daLayer;
	}

	public void setDaLayer(DataAccessLayer daLayer) {
		this.daLayer = daLayer;
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name, ModelMap model) {

		model.addAttribute("movie", name);
		return "list";

	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getDefaultMovie(ModelMap model) {
		model.addAttribute("movie", "this is default movie");
		return "list";

	}
    @RequestMapping(value = "/", method = RequestMethod.POST )
    @ResponseStatus(HttpStatus.CREATED)
	public String addMovie()
	{
		return "";
	}

    @RequestMapping(value = "/cars", method = RequestMethod.POST)
    public ResponseEntity<List<Movie>> update(@RequestBody List<Movie> movies) {

//        movies.stream().forEach(c -> c.setMiles(c.getMiles() + 100));

        // TODO: call persistence layer to update
        return new ResponseEntity<List<Movie>>(movies, HttpStatus.OK);
    }
}