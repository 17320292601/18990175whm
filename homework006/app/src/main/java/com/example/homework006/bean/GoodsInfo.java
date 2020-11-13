package com.example.homework006.bean;

import com.example.homework006.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "帆布包", "牛皮包", "Dickies", "休闲包", "软皮背包", "休闲挎包","蔻驰","手提包"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "美式休闲头层牛皮双肩包男帆布背包复古旅行帆布包男包潮流时尚 ",
            "头层牛皮男手提公文包简约手工真皮商务包单肩斜挎包15寸电脑包",
            "Dickies潮牌斜挎包男士腰包新款胸包女单肩包蒂克学生休闲运动包",
            " 2020新款大容量时尚潮流男士格子纹布手包帆布牛津布休闲手拿包潮 ",
            "韩版新款头层牛皮小怪兽手提包男撞色眼睛大容量多功能软皮背包",
            "慢时光复古手工疯马皮斜挎包男包头层牛皮单肩包真皮背包休闲挎包",
            "蔻驰（COACH） 奢侈品 男士大号双肩包卡其深棕色PVC配皮 F58314 IMAA8",
            "美国直邮 COACH 蔻驰 男士单肩斜挎手提包 商务公文包"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {228, 492, 238, 128, 1975, 285,1799,2860};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.bao1x, R.drawable.bao2x, R.drawable.bao3x,
            R.drawable.bao4x, R.drawable.bao5x, R.drawable.bao6x, R.drawable.bao7x, R.drawable.bao8x
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.bao1, R.drawable.bao2, R.drawable.bao3,
            R.drawable.bao4, R.drawable.bao5, R.drawable.bao6, R.drawable.bao7, R.drawable.bao8
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
