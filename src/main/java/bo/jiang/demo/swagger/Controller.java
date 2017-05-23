package bo.jiang.demo.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shumpert.jiang
 * @date 2017/5/23 0023 10:06
 */
@RestController
@Api(value = "情商")
public class Controller {

  @RequestMapping(value = "/swagger", method = RequestMethod.GET)
  public void swagger() {
    System.out.println("Hello Swagger");
  }

  @ApiOperation(value = "test", notes = "test")
  @RequestMapping(value = "/test", method = RequestMethod.GET)
  public String test() {
    return "Hello World";
  }

  @ApiOperation(value = "user", notes = "用户")
  @ApiImplicitParam(name = "user", value = "用户实体类", required = true, dataType = "User")
  @RequestMapping(value = "/user", method = RequestMethod.POST)
  public String user(@RequestBody User user) {
    System.out.println(user.name + ":" + user.age);
    return "Hello User";
  }

}
