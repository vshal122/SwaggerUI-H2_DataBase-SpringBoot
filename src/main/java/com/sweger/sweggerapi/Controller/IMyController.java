package com.sweger.sweggerapi.Controller;

import com.sweger.sweggerapi.Model.MyClass;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/stu/start")
@Api(value = "Save User Details here", description = "shows test hello world")
public interface IMyController {

    @ApiOperation(value = "return hello world")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful Hello World")
            }
    )
    @PostMapping("/save")
   public MyClass dataSave(@RequestBody MyClass myClass);


    @ApiOperation(value = "searched User Details")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful Hello World")
            }
    )
    @GetMapping("/search/{id}")
    public  MyClass dataGet(@PathVariable("id") Long id);

}
