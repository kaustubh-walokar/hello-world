package hello

import org.springframework.context.annotation.{Configuration, ComponentScan}
import org.springframework.boot.autoconfigure.EnableAutoConfiguration

/**
 * This config class will trigger Spring @annotation scanning and auto configure Spring context.
 *
 * @author KaustubhW
 * @since 01
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
class AConfig {

}