package helloKW

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.SpringApplication
import org.springframework.web.bind.annotation.{RequestMapping, RestController}
/**
 * This object bootstraps Spring Boot web application.
 * Via Gradle: gradle bootRun
 *
 * @author KaustubhW
 * @since 1.0
 */
 @EnableAutoConfiguration
object HelloWebApplication {

	def main(args: Array[String]) {
	   SpringApplication.run(classOf[AxyzConfig]);
	}
}


