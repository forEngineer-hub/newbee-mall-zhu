package ltd.newbee.mall.newbeemall.entity;

import javax.annotation.Generated;

public class Sku {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.2456634+09:00", comments="Source field: sku.sku_id")
    private String skuId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.246663+09:00", comments="Source field: sku.goods_id")
    private Long goodsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.2476648+09:00", comments="Source field: sku.sku1")
    private String sku1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.2476648+09:00", comments="Source field: sku.sku1_name")
    private String sku1Name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.2476648+09:00", comments="Source field: sku.sku2")
    private String sku2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.2476648+09:00", comments="Source field: sku.sku2_name")
    private String sku2Name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.2476648+09:00", comments="Source field: sku.sku3")
    private String sku3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.2476648+09:00", comments="Source field: sku.sku3_name")
    private String sku3Name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.246663+09:00", comments="Source field: sku.sku_id")
    public String getSkuId() {
        return skuId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.246663+09:00", comments="Source field: sku.sku_id")
    public void setSkuId(String skuId) {
        this.skuId = skuId == null ? null : skuId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.246663+09:00", comments="Source field: sku.goods_id")
    public Long getGoodsId() {
        return goodsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.246663+09:00", comments="Source field: sku.goods_id")
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.2476648+09:00", comments="Source field: sku.sku1")
    public String getSku1() {
        return sku1;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.2476648+09:00", comments="Source field: sku.sku1")
    public void setSku1(String sku1) {
        this.sku1 = sku1 == null ? null : sku1.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.2476648+09:00", comments="Source field: sku.sku1_name")
    public String getSku1Name() {
        return sku1Name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.2476648+09:00", comments="Source field: sku.sku1_name")
    public void setSku1Name(String sku1Name) {
        this.sku1Name = sku1Name == null ? null : sku1Name.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.2476648+09:00", comments="Source field: sku.sku2")
    public String getSku2() {
        return sku2;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.2476648+09:00", comments="Source field: sku.sku2")
    public void setSku2(String sku2) {
        this.sku2 = sku2 == null ? null : sku2.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.2476648+09:00", comments="Source field: sku.sku2_name")
    public String getSku2Name() {
        return sku2Name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.2476648+09:00", comments="Source field: sku.sku2_name")
    public void setSku2Name(String sku2Name) {
        this.sku2Name = sku2Name == null ? null : sku2Name.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.2476648+09:00", comments="Source field: sku.sku3")
    public String getSku3() {
        return sku3;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.2476648+09:00", comments="Source field: sku.sku3")
    public void setSku3(String sku3) {
        this.sku3 = sku3 == null ? null : sku3.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.2476648+09:00", comments="Source field: sku.sku3_name")
    public String getSku3Name() {
        return sku3Name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-29T19:57:30.2476648+09:00", comments="Source field: sku.sku3_name")
    public void setSku3Name(String sku3Name) {
        this.sku3Name = sku3Name == null ? null : sku3Name.trim();
    }
}