package helloKW


import org.springframework.context.annotation.{Configuration, ComponentScan}
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, ResponseBody}
import org.springframework.web.bind.annotation.RequestParam

/**
 * This config class will trigger Spring @annotation scanning and auto configure Spring context.
 *
 * @author KaustubhW
 * @since 01
 
 import org.springframework.context.annotation.{Configuration, ComponentScan}
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.streotype.Controller


 */
@Controller
@Configuration
@EnableAutoConfiguration
@ComponentScan
class AxyzConfig {

  @RequestMapping(Array{"/"})
  @ResponseBody
  def Helloads(): String = "Hello test"
  
  @RequestMapping(Array{"/name"})
  @ResponseBody
  def retName(): String = {
  "Hello name"
	}
	
}