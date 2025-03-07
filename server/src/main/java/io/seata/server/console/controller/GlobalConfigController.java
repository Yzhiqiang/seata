package io.seata.server.console.controller;

import io.seata.config.Configuration;
import io.seata.config.ConfigurationFactory;
import io.seata.console.constant.Code;
import io.seata.console.result.PageResult;
import io.seata.console.result.SingleResult;
import io.seata.server.console.impl.db.GlobalConfigDBServiceImpl;
import io.seata.server.console.service.GlobalConfigService;
import io.seata.server.console.vo.GlobalConfigVO;
import io.seata.server.console.vo.GlobalSessionVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 13:42 2022/6/24
 * @Modified By:
 */
@RestController
@RequestMapping(value = "/api/v1/console/editconfig")
public class GlobalConfigController {

    private static final Configuration CONFIG = ConfigurationFactory.getInstance();

    @Resource(type = GlobalConfigService.class)
    private GlobalConfigService globalConfigDBService;

    @RequestMapping(value = "/putconfig", method = RequestMethod.POST)
    public SingleResult<Boolean> putconfig(String dataId, String content)  {

        try {
            Boolean result = CONFIG.putConfig(dataId, content);
            if(result) {
                return SingleResult.success(result);
            } else {
                return SingleResult.failure(Code.ERROR);
            }
        } catch(Exception e) {
            e.printStackTrace();
            return SingleResult.failure("101", "修改配置异常");
        }
    }

    @RequestMapping(value = "/getconfiglist", method = RequestMethod.GET)
    public PageResult<GlobalConfigVO> get()  {
        return globalConfigDBService.getConfigList();
    }


}
