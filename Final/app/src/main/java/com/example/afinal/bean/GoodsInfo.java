package com.example.afinal.bean;

import com.example.afinal.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc1; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public int pic_id;
    public String title;
    public boolean bPressed;
    public int id;
    private static int seq = 0;
    public String desc;
    public GoodsInfo(int pic_id, String title, String desc) {
        rowid = 0L;
        sn = 0;
        name = "";
        desc1 = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
        this.pic_id = pic_id;
        this.title = title;
        this.desc = desc;
        this.bPressed = false;
        this.id = this.seq;
        this.seq++;
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

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc1 = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

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
    private static int[] gridImageArray = {R.drawable.pic_01, R.drawable.pic_02, R.drawable.pic_03
            , R.drawable.pic_04, R.drawable.pic_05, R.drawable.pic_06, R.drawable.pic_07
            , R.drawable.pic_08, R.drawable.pic_09, R.drawable.pic_10};
    private static String[] gridTitleArray = {"商场", "超市", "百货", "便利店",
            "地摊", "食杂店", "饭店", "餐厅", "会所", "菜市场"};

    public static ArrayList<GoodsInfo> getDefaultGrid() {
        ArrayList<GoodsInfo> gridArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < gridImageArray.length; i++) {
            gridArray.add(new GoodsInfo(gridImageArray[i], gridTitleArray[i], null));
        }
        return gridArray;
    }
    private static int[] stagImageArray = {R.drawable.skirt01, R.drawable.skirt02, R.drawable.skirt03
            , R.drawable.skirt04, R.drawable.skirt05, R.drawable.skirt06, R.drawable.skirt07
            , R.drawable.skirt08, R.drawable.skirt09, R.drawable.skirt10, R.drawable.skirt11
            , R.drawable.skirt12, R.drawable.skirt13, R.drawable.skirt14, R.drawable.skirt15
            , R.drawable.skirt16, R.drawable.skirt17, R.drawable.skirt18, R.drawable.skirt19
            , R.drawable.skirt20, R.drawable.skirt21, R.drawable.skirt22, R.drawable.skirt23};
    private static String[] stagTitleArray = {"促销价", "惊爆价", "跳楼价", "白菜价", "清仓价", "割肉价",
            "实惠价", "一口价", "满意价", "打折价", "腰斩价", "无人问津", "算了吧", "大声点",
            "嘘嘘", "嗯嗯", "呼呼", "呵呵", "哈哈", "嘿嘿", "嘻嘻", "嗷嗷", "喔喔"};

    public static ArrayList<GoodsInfo> getDefaultStag() {

        ArrayList<GoodsInfo> stagArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < stagImageArray.length; i++) {
            stagArray.add(new GoodsInfo(stagImageArray[i], stagTitleArray[i], null));
        }
        return stagArray;
    }
}
