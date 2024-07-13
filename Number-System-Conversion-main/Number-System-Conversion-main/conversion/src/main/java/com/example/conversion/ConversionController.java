package com.example.conversion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/convert")
public class ConversionController {

    @Autowired
    private ConversionService conversionService;

    @GetMapping("/decimalToBinary")
    public int decimalToBinary(@RequestParam int decimal) {
        return conversionService.decimalToBinary(decimal);
    }

    @GetMapping("/binaryToDecimal")
    public int binaryToDecimal(@RequestParam int binary) {
        return conversionService.binaryToDecimal(binary);
    }
}
