package com.sjony.service.impl;

import com.google.common.collect.Lists;
import com.sjony.service.SkuQtyService;
import com.sjony.service.SkuService;
import com.sjony.utils.CollectionUtils;
import com.sjony.vo.SkuQtyVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by sjony on 2017/11/17.
 */
public class SkuServiceImpl implements SkuService {

    @Autowired
    private SkuQtyService skuQtyService;

    /**
     * @Description: 查询商品库存
     * @Create on: 2017/7/18 下午1:46
     *
     * @author shujiangcheng
     */
    @Override
    public List<SkuQtyVO> getSkuQtyBySkuCode(List<String> skuCodeList) {
        List<SkuQtyVO> result = Lists.newArrayList();
        //入参校验
        if(CollectionUtils.isEmpty(skuCodeList)) {
            return result;
        }

        result = skuQtyService.getSkuQtyListBySkuList(skuCodeList);

        return result;
    }

}
