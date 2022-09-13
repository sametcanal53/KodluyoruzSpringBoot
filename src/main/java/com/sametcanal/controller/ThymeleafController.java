package com.sametcanal.controller;

import com.sametcanal.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    // http://localhost:8080/
    @GetMapping({"/", "index"})
    public String index() {
        return "index";
    }

    // http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1")
    //@ResponseBody
    public String getThymeleaf1() {
        return "thymeleaf1";
    }

    // Birden fazla model gönderme
    // http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String getThymeleaf2Model(Model model) {
        model.addAttribute("key_model1", "Ben modelden geldim-1");
        model.addAttribute("key_model2", "Ben modelden geldim-2");
        return "thymeleaf1";
    }


    // http://localhost:8080/thymeleaf3
    @GetMapping("/thymeleaf3")
    public String getThymeleaf3Model(Model model) {
        model.addAttribute("key_model1", "Ben modelden geldim-1");
        model.addAttribute("key_model2", "Ben modelden geldim-2");
        return "thymeleaf_file/thymeleaf3";
    }

    // http://localhost:8080/thymeleaf4
    @GetMapping("/thymeleaf4")
    public String getThymeleaf4Model(Model model) {
        model.addAttribute("key_model1", "Ben modelden geldim-1");
        return "thymeleaf4";
    }

    // Model Object göndermek
    // http://localhost:8080/thymeleaf5
    @GetMapping("/thymeleaf5")
    public String getThymeleaf5Model(Model model) {
        model.addAttribute("key_model1", "text");

        ProductDto productDto = ProductDto
                .builder()
                .productId(0L)
                .productName("Ürün Adı")
                .productPrice(2500)
                .build();

        model.addAttribute("key_model2", productDto);
        return "thymeleaf5";
    }

    // Model Object göndermek
    // http://localhost:8080/thymeleaf6
    @GetMapping("/thymeleaf6")
    public String getThymeleaf6Model(Model model) {
        model.addAttribute("key_model1", "text");
        List<ProductDto> list = new ArrayList<>();
        list.add(ProductDto.builder().productId(1L).productName("Ürün Adı 1").productPrice(1500).build());
        list.add(ProductDto.builder().productId(2L).productName("Ürün Adı 2").productPrice(2500).build());
        list.add(ProductDto.builder().productId(3L).productName("Ürün Adı 3").productPrice(3500).build());
        list.add(ProductDto.builder().productId(4L).productName("Ürün Adı 4").productPrice(4500).build());

        model.addAttribute("product_list", list);
        return "thymeleaf6";
    }


    // @PathVariable
    // http://localhost:8080/thymeleaf7/11
    // http://localhost:8080/thymeleaf7/
    @GetMapping({"/thymeleaf7/{id}", "/thymeleaf7/"})
    public String getThymeleaf7Model(Model model, @PathVariable(name = "id", required = false) Long id) {
        if (id != null) {
            model.addAttribute("key_model1", "id : " + id);
        } else {
            model.addAttribute("key_model1", "id bulunamadı ");
        }
        return "thymeleaf7";
    }

    // @RequestParam
    // http://localhost:8080/thymeleaf8/?id=4&name=SametcanAL
    @GetMapping("/thymeleaf8/")
    public String getThymeleaf8Model(Model model, @RequestParam(name = "id") Long id, @RequestParam(name = "name") String ad) {
        model.addAttribute("key_model1", "id : " + id + " adi soyadi : " + ad);

        return "thymeleaf8";
    }

}
