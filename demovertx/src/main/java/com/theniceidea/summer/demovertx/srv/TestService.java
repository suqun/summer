package com.theniceidea.summer.demovertx.srv;

import com.alibaba.fastjson.JSON;
import com.theniceidea.summer.core.base.SummerService;
import com.theniceidea.summer.core.base.SummerServiceClass;
import com.theniceidea.summer.demovertx.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import static com.theniceidea.summer.core.srv.Summers.sum;

@Service
@SummerService()
public class TestService implements ApplicationRunner{

    @Autowired
    private TestService testService;

//    @SummerService(value = false)
    public void task(TestModel model){
        System.out.println(model.getField());
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        TestModel testModel = new TestModel();
        testModel.setField("0000000000000000000000000000");
        sum(testModel);
        System.out.println(JSON.toJSONString(testModel));
    }
}
