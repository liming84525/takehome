package com.lilo.controller;

import com.lilo.mapper.OverviewMapper;
import com.lilo.pojo.Overview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liming on 16-11-10.
 */
@Controller
//@RequestMapping(value = "/")
public class PageController {

    @Autowired
    OverviewMapper mapper;

	@RequestMapping("/")
	public String index(Model m) {
		Overview o = mapper.findByDate("20161012");
		m.addAttribute("ov", o);
		return "index";
	}

}
