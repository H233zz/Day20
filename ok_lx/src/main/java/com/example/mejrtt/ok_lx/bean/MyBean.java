package com.example.mejrtt.ok_lx.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by WANG123456 on 2017/9/21.
 */

//http://api.jisuapi.com/news/get?channel=头条&start=0&num=10&appkey=f052f5a5d47cf468
public class MyBean {


    /**
     * login_status : 0
     * total_number : 10
     * has_more : false
     * post_content_hint : 分享「财经」的新鲜事
     * show_et_status : 0
     * feed_flag : 0
     * message : success
     * has_more_to_refresh : true
     * data : [{"log_pb":{"impr_id":"20170921100956010008062212846B72"},"read_count":702,"media_name":"IT168企业级","ban_comment":0,"abstract":"根据Gartner的数据，全球服务器收入在2017年第二季度同比增长了2.8%，而出货量比2016年第二季度增长了2.4%。惠普(HPE)在收入方面，继续领先全球服务器市场。尽管下滑了9.4%，公司在2017年第二季度的收入总额达到了32亿美元，占到总营收的23%。","image_list":[{"url":"http://p3.pstatp.com/list/3b0e0000f0cd01fadd36","width":670,"url_list":[{"url":"http://p3.pstatp.com/list/3b0e0000f0cd01fadd36"},{"url":"http://pb9.pstatp.com/list/3b0e0000f0cd01fadd36"},{"url":"http://pb1.pstatp.com/list/3b0e0000f0cd01fadd36"}],"uri":"list/3b0e0000f0cd01fadd36","height":376},{"url":"http://p3.pstatp.com/list/3b0800042f17e3f5978b","width":670,"url_list":[{"url":"http://p3.pstatp.com/list/3b0800042f17e3f5978b"},{"url":"http://pb9.pstatp.com/list/3b0800042f17e3f5978b"},{"url":"http://pb1.pstatp.com/list/3b0800042f17e3f5978b"}],"uri":"list/3b0800042f17e3f5978b","height":349},{"url":"http://p3.pstatp.com/list/3b09000425a99b8cf0ec","width":670,"url_list":[{"url":"http://p3.pstatp.com/list/3b09000425a99b8cf0ec"},{"url":"http://pb9.pstatp.com/list/3b09000425a99b8cf0ec"},{"url":"http://pb1.pstatp.com/list/3b09000425a99b8cf0ec"}],"uri":"list/3b09000425a99b8cf0ec","height":356}],"digg_count":0,"article_type":0,"tag":"news_tech","forward_info":{"forward_count":0},"has_m3u8_video":0,"keywords":"x86,Gartner,出货量,服务器,EMC","rid":"20170921100956010008062212846B72","show_portrait_article":false,"user_verified":1,"aggr_type":1,"cell_type":0,"article_sub_type":0,"bury_count":0,"title":"2017 Q2服务器营收增长2.8% 华为增58%","ignore_web_transform":1,"source_icon_style":2,"tip":1,"hot":1,"share_url":"http://m.toutiao.com/a6467688082761056782/?iid=3642583580&app=news_article","has_mp4_video":0,"source":"IT168企业级","comment_count":2,"article_url":"http://toutiao.com/group/6467688082761056782/","filter_words":[{"id":"8:0","name":"看过了","is_selected":false},{"id":"9:1","name":"内容太水","is_selected":false},{"id":"5:62396182","name":"拉黑作者:IT168企业级","is_selected":false},{"id":"6:18107","name":"不想看:华为","is_selected":false}],"share_count":5,"publish_time":1505875979,"action_list":[{"action":1,"extra":{},"desc":""},{"action":3,"extra":{},"desc":""},{"action":7,"extra":{},"desc":""},{"action":9,"extra":{},"desc":""}],"gallary_image_count":3,"cell_layout_style":1,"tag_id":6467688082761056782,"action_extra":"{\"channel_id\": 3189399007}","video_style":0,"verified_content":"IT168官方头条号","display_url":"http://toutiao.com/group/6467688082761056782/","large_image_list":[],"media_info":{"user_id":51842642815,"verified_content":"","avatar_url":"http://p3.pstatp.com/large/ef50008ac962a68910e","media_id":51849204507,"name":"IT168企业级","recommend_type":0,"follow":false,"recommend_reason":"","is_star_user":false,"user_verified":true},"item_id":6467688082761056782,"is_subject":false,"show_portrait":false,"repin_count":4,"cell_flag":11,"user_info":{"verified_content":"IT168官方头条号","avatar_url":"http://p3.pstatp.com/thumb/ef50008ac962a68910e","user_id":51842642815,"name":"IT168企业级","follower_count":0,"follow":false,"user_auth_info":"{\"auth_type\": \"0\", \"auth_info\": \"IT168官方头条号\"}","user_verified":true,"description":"为用户提供趋势分析、技术选型、产品导购、方案应用等建议。"},"source_open_url":"sslocal://profile?uid=51842642815","level":0,"ugc_recommend":{"reason":"IT168官方头条号","activity":""},"behot_time":1505959796,"cursor":1505959796999,"url":"http://toutiao.com/group/6467688082761056782/","preload_web":1,"user_repin":0,"has_image":true,"item_version":0,"has_video":false,"group_id":6467688082761056782,"middle_image":{"url":"http://p3.pstatp.com/list/3b0e0000f0cd01fadd36","width":670,"url_list":[{"url":"http://p3.pstatp.com/list/3b0e0000f0cd01fadd36"},{"url":"http://pb9.pstatp.com/list/3b0e0000f0cd01fadd36"},{"url":"http://pb1.pstatp.com/list/3b0e0000f0cd01fadd36"}],"uri":"list/3b0e0000f0cd01fadd36","height":376}},{"log_pb":{"impr_id":"20170921100956010008062212846B72"},"read_count":2020,"media_name":"好买商学院","ban_comment":0,"abstract":"导读：买基金除了要挑选基金公司和基金经理，更重要的是了解基金。那么，从哪些维度了解呢？一、基金概况基金名称、基金代码、成立时间、基金类型基金公司、基金经理、基金托管人基金规模投资目标、投资范围、投资策略业绩比较基准1）成立时间：新基金、还是老基金？","image_list":[{"url":"http://p3.pstatp.com/list/3b0c0000f956cb4e68e8","width":640,"url_list":[{"url":"http://p3.pstatp.com/list/3b0c0000f956cb4e68e8"},{"url":"http://pb9.pstatp.com/list/3b0c0000f956cb4e68e8"},{"url":"http://pb1.pstatp.com/list/3b0c0000f956cb4e68e8"}],"uri":"list/3b0c0000f956cb4e68e8","height":360},{"url":"http://p1.pstatp.com/list/3b08000420a0e0018f0b","width":235,"url_list":[{"url":"http://p1.pstatp.com/list/3b08000420a0e0018f0b"},{"url":"http://pb3.pstatp.com/list/3b08000420a0e0018f0b"},{"url":"http://pb9.pstatp.com/list/3b08000420a0e0018f0b"}],"uri":"list/3b08000420a0e0018f0b","height":121},{"url":"http://p1.pstatp.com/list/3b0c0000f94f15af418e","width":224,"url_list":[{"url":"http://p1.pstatp.com/list/3b0c0000f94f15af418e"},{"url":"http://pb3.pstatp.com/list/3b0c0000f94f15af418e"},{"url":"http://pb9.pstatp.com/list/3b0c0000f94f15af418e"}],"uri":"list/3b0c0000f94f15af418e","height":121}],"digg_count":0,"article_type":0,"tag":"news_finance","forward_info":{"forward_count":0},"has_m3u8_video":0,"keywords":"价值型,蜘蛛网,夏普比率,投资风格,重仓股","rid":"20170921100956010008062212846B72","show_portrait_article":false,"user_verified":0,"aggr_type":1,"cell_type":0,"article_sub_type":0,"bury_count":0,"title":"基金亏了怪谁，你真的了解你的基金吗？","ignore_web_transform":1,"source_icon_style":1,"tip":0,"hot":0,"share_url":"http://m.toutiao.com/a6467732111779430669/?iid=3642583580&app=news_article","has_mp4_video":0,"source":"好买商学院","comment_count":0,"article_url":"http://toutiao.com/group/6467732111779430669/","filter_words":[{"id":"8:0","name":"看过了","is_selected":false},{"id":"9:1","name":"内容太水","is_selected":false},{"id":"5:586015550","name":"拉黑作者:好买商学院","is_selected":false},{"id":"3:11781054","name":"不想看:基金","is_selected":false}],"share_count":30,"publish_time":1505876104,"action_list":[{"action":1,"extra":{},"desc":""},{"action":3,"extra":{},"desc":""},{"action":7,"extra":{},"desc":""},{"action":9,"extra":{},"desc":""}],"gallary_image_count":7,"cell_layout_style":1,"tag_id":6467732111779430669,"action_extra":"{\"channel_id\": 3189399007}","video_style":0,"verified_content":"","display_url":"http://toutiao.com/group/6467732111779430669/","large_image_list":[],"media_info":{"user_id":3743529453,"verified_content":"","avatar_url":"http://p3.pstatp.com/large/bc30000db7e2af7fe38","media_id":50385528322,"name":"好买商学院","recommend_type":0,"follow":false,"recommend_reason":"","is_star_user":false,"user_verified":false},"item_id":6467685821171368462,"is_subject":false,"show_portrait":false,"repin_count":172,"cell_flag":11,"user_info":{"verified_content":"","avatar_url":"http://p1.pstatp.com/thumb/bc30000db7e2af7fe38","user_id":3743529453,"name":"好买商学院","follower_count":0,"follow":false,"user_auth_info":"","user_verified":false,"description":"好买财富致力于提升中国人的理财质量！"},"source_open_url":"sslocal://profile?uid=3743529453","level":0,"ugc_recommend":{"reason":"","activity":""},"behot_time":1505959761,"cursor":1505959761999,"url":"http://toutiao.com/group/6467732111779430669/","preload_web":1,"user_repin":0,"has_image":true,"item_version":0,"has_video":false,"group_id":6467732111779430669,"middle_image":{"url":"http://p3.pstatp.com/list/3b0c0000f956cb4e68e8","width":640,"url_list":[{"url":"http://p3.pstatp.com/list/3b0c0000f956cb4e68e8"},{"url":"http://pb9.pstatp.com/list/3b0c0000f956cb4e68e8"},{"url":"http://pb1.pstatp.com/list/3b0c0000f956cb4e68e8"}],"uri":"list/3b0c0000f956cb4e68e8","height":360}},{"log_pb":{"impr_id":"20170921100956010008062212846B72"},"read_count":22023,"media_name":"小六忠诚","ban_comment":0,"abstract":"请点击\u201c关注\u201d按钮，关注小六忠诚！股市里面崩盘的故事常常上演，保千里600074已经停牌两个月。我们来打开保千里看看，自从股价崩盘之后一直就在震荡下行，股价在停牌前已经跌去了2/3。保千里净资产才1.","image_list":[],"digg_count":0,"article_type":0,"tag":"news_finance","forward_info":{"forward_count":1},"has_m3u8_video":0,"keywords":"平安银行,证监会,汇丰银行,净资产,达股份,保千里","rid":"20170921100956010008062212846B72","show_portrait_article":false,"user_verified":1,"aggr_type":1,"cell_type":0,"article_sub_type":0,"bury_count":0,"title":"保千里为什么会崩盘？","ignore_web_transform":1,"source_icon_style":2,"tip":0,"hot":0,"share_url":"http://m.toutiao.com/a6467761400730092046/?iid=3642583580&app=news_article","has_mp4_video":0,"source":"小六忠诚","comment_count":33,"article_url":"http://toutiao.com/group/6467761400730092046/","filter_words":[{"id":"8:0","name":"看过了","is_selected":false},{"id":"9:1","name":"内容太水","is_selected":false},{"id":"5:14880755","name":"拉黑作者:小六忠诚","is_selected":false},{"id":"4:306458403","name":"不想看:电子行业","is_selected":false},{"id":"6:5148374","name":"不想看:保千里","is_selected":false}],"share_count":72,"publish_time":1505893050,"action_list":[{"action":1,"extra":{},"desc":""},{"action":3,"extra":{},"desc":""},{"action":7,"extra":{},"desc":""},{"action":9,"extra":{},"desc":""}],"gallary_image_count":2,"cell_layout_style":1,"tag_id":6467761400730092046,"action_extra":"{\"channel_id\": 3189399007}","video_style":0,"verified_content":"财经自媒体","display_url":"http://toutiao.com/group/6467761400730092046/","large_image_list":[],"media_info":{"user_id":7020359883,"verified_content":"","avatar_url":"http://p3.pstatp.com/large/97e0014be7c7c8f5ea5","media_id":7020359883,"name":"小六忠诚","recommend_type":0,"follow":false,"recommend_reason":"","is_star_user":false,"user_verified":true},"item_id":6467761400730092046,"is_subject":false,"show_portrait":false,"repin_count":70,"cell_flag":11,"user_info":{"verified_content":"财经自媒体","avatar_url":"http://p3.pstatp.com/thumb/97e0014be7c7c8f5ea5","user_id":7020359883,"name":"小六忠诚","follower_count":0,"follow":false,"user_auth_info":"{\"auth_type\": \"0\", \"auth_info\": \"财经自媒体\"}","user_verified":true,"description":"18年前踏进股市，尝尽酸甜苦辣，但从未放弃,坚持至今。终于掌握股市生存之道,成为价值投资捍卫者。"},"source_open_url":"sslocal://profile?uid=7020359883","level":0,"ugc_recommend":{"reason":"财经自媒体","activity":""},"behot_time":1505959726,"cursor":1505959726999,"url":"http://toutiao.com/group/6467761400730092046/","preload_web":1,"user_repin":0,"has_image":true,"item_version":0,"has_video":false,"group_id":6467761400730092046,"middle_image":{"url":"http://p3.pstatp.com/list/3b0b000202ce9f3de805","width":607,"url_list":[{"url":"http://p3.pstatp.com/list/3b0b000202ce9f3de805"},{"url":"http://pb9.pstatp.com/list/3b0b000202ce9f3de805"},{"url":"http://pb1.pstatp.com/list/3b0b000202ce9f3de805"}],"uri":"list/3b0b000202ce9f3de805","height":341}},{"log_pb":{"impr_id":"20170921100956010008062212846B72"},"read_count":1787,"media_name":"人走水凉","ban_comment":0,"abstract":"所谓白手起家就是指没有经济基础或者基础很差而创立的一番事业，那么对于白手起家的朋友来说，困难自然是不必说的，但是也不是没有成功的可能，只要方向对在加上自己的拼搏和努力就一定可以取得成功。许多人常常诉说，没有技术，没有资金，没有经验，没有门路不知该搞哪一门。其实不然。","image_list":[],"digg_count":0,"article_type":0,"tag":"news_finance","forward_info":{"forward_count":1},"has_m3u8_video":0,"keywords":"录音磁带,幼儿教育,创业者,白手起家,市场调查","rid":"20170921100956010008062212846B72","show_portrait_article":false,"user_verified":0,"aggr_type":1,"cell_type":0,"article_sub_type":0,"bury_count":0,"title":"白手起家的条件和案例","ignore_web_transform":1,"source_icon_style":2,"tip":0,"hot":0,"share_url":"http://m.toutiao.com/a6467736734795825677/?iid=3642583580&app=news_article","has_mp4_video":0,"source":"人走水凉","comment_count":0,"article_url":"http://toutiao.com/group/6467736734795825677/","filter_words":[{"id":"8:0","name":"看过了","is_selected":false},{"id":"9:1","name":"内容太水","is_selected":false},{"id":"5:1521704691","name":"拉黑作者:人走水凉","is_selected":false},{"id":"2:306442035","name":"不想看:创业","is_selected":false}],"share_count":71,"publish_time":1505887307,"action_list":[{"action":1,"extra":{},"desc":""},{"action":3,"extra":{},"desc":""},{"action":7,"extra":{},"desc":""},{"action":9,"extra":{},"desc":""}],"gallary_image_count":1,"cell_layout_style":1,"tag_id":6467736734795825677,"action_extra":"{\"channel_id\": 3189399007}","video_style":0,"verified_content":"","display_url":"http://toutiao.com/group/6467736734795825677/","large_image_list":[],"media_info":{"user_id":68621688919,"verified_content":"","avatar_url":"http://p3.pstatp.com/large/39ba000107a9c4783cf9","media_id":1578135976501261,"name":"人走水凉","recommend_type":0,"follow":false,"recommend_reason":"","is_star_user":false,"user_verified":false},"item_id":6467736734795825677,"is_subject":false,"show_portrait":false,"repin_count":293,"cell_flag":11,"user_info":{"verified_content":"","avatar_url":"http://p3.pstatp.com/thumb/39ba000107a9c4783cf9","user_id":68621688919,"name":"人走水凉","follower_count":0,"follow":false,"user_auth_info":"","user_verified":false,"description":"渐渐地明白，其实一个人挺好的。曾经不过萍水相逢、"},"source_open_url":"sslocal://profile?uid=68621688919","level":0,"ugc_recommend":{"reason":"","activity":""},"behot_time":1505959691,"cursor":1505959691999,"url":"http://toutiao.com/group/6467736734795825677/","preload_web":1,"user_repin":0,"has_image":false,"item_version":0,"has_video":false,"group_id":6467736734795825677,"middle_image":{}},{"log_pb":{"impr_id":"20170921100956010008062212846B72"},"read_count":2677,"media_name":"不浪漫无罪名","ban_comment":0,"abstract":"漫漫创业路荣光伴我行，呈现十年创业心酸大片！","image_list":[{"url":"http://p3.pstatp.com/list/39a70004d438d3550118","width":640,"url_list":[{"url":"http://p3.pstatp.com/list/39a70004d438d3550118"},{"url":"http://pb9.pstatp.com/list/39a70004d438d3550118"},{"url":"http://pb1.pstatp.com/list/39a70004d438d3550118"}],"uri":"list/39a70004d438d3550118","height":360},{"url":"http://p3.pstatp.com/list/39a60004db77e4e451af","width":700,"url_list":[{"url":"http://p3.pstatp.com/list/39a60004db77e4e451af"},{"url":"http://pb9.pstatp.com/list/39a60004db77e4e451af"},{"url":"http://pb1.pstatp.com/list/39a60004db77e4e451af"}],"uri":"list/39a60004db77e4e451af","height":393},{"url":"http://p3.pstatp.com/list/39a50004dc3e3fecf742","width":700,"url_list":[{"url":"http://p3.pstatp.com/list/39a50004dc3e3fecf742"},{"url":"http://pb9.pstatp.com/list/39a50004dc3e3fecf742"},{"url":"http://pb1.pstatp.com/list/39a50004dc3e3fecf742"}],"uri":"list/39a50004dc3e3fecf742","height":393}],"digg_count":0,"article_type":0,"tag":"news_finance","forward_info":{"forward_count":0},"has_m3u8_video":0,"keywords":"风里来雨里去,走亲戚,骨里香,那时候,精原细胞瘤,富爸爸,老丈人","rid":"20170921100956010008062212846B72","show_portrait_article":false,"user_verified":0,"aggr_type":1,"cell_type":0,"article_sub_type":0,"bury_count":0,"title":"漫漫创业路十年辛酸创业大片","ignore_web_transform":1,"source_icon_style":4,"tip":1,"hot":1,"share_url":"http://m.toutiao.com/a6462577578736615949/?iid=3642583580&app=news_article","has_mp4_video":0,"source":"不浪漫无罪名","comment_count":22,"article_url":"http://toutiao.com/group/6462577578736615949/","filter_words":[{"id":"8:0","name":"看过了","is_selected":false},{"id":"9:1","name":"内容太水","is_selected":false},{"id":"5:806122748","name":"拉黑作者:不浪漫无罪名","is_selected":false},{"id":"6:18246","name":"不想看:创业","is_selected":false}],"share_count":32,"publish_time":1504686097,"action_list":[{"action":1,"extra":{},"desc":""},{"action":3,"extra":{},"desc":""},{"action":7,"extra":{},"desc":""},{"action":9,"extra":{},"desc":""}],"gallary_image_count":45,"cell_layout_style":1,"tag_id":6462577578736615949,"action_extra":"{\"channel_id\": 3189399007}","video_style":0,"verified_content":"","display_url":"http://toutiao.com/group/6462577578736615949/","large_image_list":[],"media_info":{"user_id":3718597092,"verified_content":"","avatar_url":"http://p3.pstatp.com/large/e590014f02b4a6185d4","media_id":52432550480,"name":"不浪漫无罪名","recommend_type":0,"follow":false,"recommend_reason":"","is_star_user":false,"user_verified":false},"item_id":6462577578736615949,"is_subject":false,"show_portrait":false,"repin_count":61,"cell_flag":11,"user_info":{"verified_content":"","avatar_url":"http://p1.pstatp.com/thumb/e590014f02b4a6185d4","user_id":3718597092,"name":"不浪漫无罪名","follower_count":0,"follow":false,"user_auth_info":"","user_verified":false,"description":"看电影，听音乐，世间百态新闻，在这里都是经典"},"source_open_url":"sslocal://profile?uid=3718597092","level":0,"ugc_recommend":{"reason":"","activity":""},"behot_time":1505959656,"cursor":1505959656999,"url":"http://toutiao.com/group/6462577578736615949/","preload_web":1,"user_repin":0,"has_image":true,"item_version":0,"has_video":false,"group_id":6462577578736615949,"middle_image":{"url":"http://p3.pstatp.com/list/39a70004d438d3550118","width":640,"url_list":[{"url":"http://p3.pstatp.com/list/39a70004d438d3550118"},{"url":"http://pb9.pstatp.com/list/39a70004d438d3550118"},{"url":"http://pb1.pstatp.com/list/39a70004d438d3550118"}],"uri":"list/39a70004d438d3550118","height":360}},{"log_pb":{"impr_id":"20170921100956010008062212846B72"},"read_count":5592,"media_name":"小牛股票","ban_comment":0,"abstract":"科大国创这波行情也是翻倍了，今年大牛股之一，无论是涨多高，有人会接盘，这是不争的事实。每当出现这种行情，有人盆满钵盈，有人高位站岗。因为不是空就是多，互做对手盘。","image_list":[{"url":"http://p3.pstatp.com/list/3b09000442d22438d24d","width":1212,"url_list":[{"url":"http://p3.pstatp.com/list/3b09000442d22438d24d"},{"url":"http://pb9.pstatp.com/list/3b09000442d22438d24d"},{"url":"http://pb1.pstatp.com/list/3b09000442d22438d24d"}],"uri":"list/3b09000442d22438d24d","height":568},{"url":"http://p3.pstatp.com/list/3b0b00012f7696bec5f0","width":651,"url_list":[{"url":"http://p3.pstatp.com/list/3b0b00012f7696bec5f0"},{"url":"http://pb9.pstatp.com/list/3b0b00012f7696bec5f0"},{"url":"http://pb1.pstatp.com/list/3b0b00012f7696bec5f0"}],"uri":"list/3b0b00012f7696bec5f0","height":366},{"url":"http://p3.pstatp.com/list/3b0d000136265fed790d","width":541,"url_list":[{"url":"http://p3.pstatp.com/list/3b0d000136265fed790d"},{"url":"http://pb9.pstatp.com/list/3b0d000136265fed790d"},{"url":"http://pb1.pstatp.com/list/3b0d000136265fed790d"}],"uri":"list/3b0d000136265fed790d","height":241}],"digg_count":0,"article_type":0,"tag":"news_finance","forward_info":{"forward_count":0},"has_m3u8_video":0,"keywords":"大国,科大国创,外卖","rid":"20170921100956010008062212846B72","show_portrait_article":false,"user_verified":0,"aggr_type":1,"cell_type":0,"article_sub_type":0,"bury_count":0,"title":"科大国创天天涨，外卖小哥忍不住，追高被套，惨了，外卖白送了","ignore_web_transform":1,"source_icon_style":4,"tip":0,"hot":0,"share_url":"http://m.toutiao.com/a6467701469989569037/?iid=3642583580&app=news_article","has_mp4_video":0,"source":"小牛股票","comment_count":13,"article_url":"http://toutiao.com/group/6467701469989569037/","filter_words":[{"id":"8:0","name":"看过了","is_selected":false},{"id":"9:1","name":"内容太水","is_selected":false},{"id":"5:351455476","name":"拉黑作者:小牛股票","is_selected":false},{"id":"3:11781038","name":"不想看:股票","is_selected":false}],"share_count":7,"publish_time":1505879096,"action_list":[{"action":1,"extra":{},"desc":""},{"action":3,"extra":{},"desc":""},{"action":7,"extra":{},"desc":""},{"action":9,"extra":{},"desc":""}],"gallary_image_count":3,"cell_layout_style":1,"tag_id":6467701469989569037,"action_extra":"{\"channel_id\": 3189399007}","video_style":0,"verified_content":"","display_url":"http://toutiao.com/group/6467701469989569037/","large_image_list":[],"media_info":{"user_id":59064652546,"verified_content":"","avatar_url":"http://p9.pstatp.com/large/1bf3001f43d87ef91968","media_id":1564634178598913,"name":"小牛股票","recommend_type":0,"follow":false,"recommend_reason":"","is_star_user":false,"user_verified":false},"item_id":6467701469989569037,"is_subject":false,"show_portrait":false,"repin_count":13,"cell_flag":11,"user_info":{"verified_content":"","avatar_url":"http://p1.pstatp.com/thumb/1bf3001f43d87ef91968","user_id":59064652546,"name":"小牛股票","follower_count":0,"follow":false,"user_auth_info":"","user_verified":false,"description":"专业投资者交流社区，每日独家解读投资机会、挖掘涨停潜力股"},"source_open_url":"sslocal://profile?uid=59064652546","level":0,"ugc_recommend":{"reason":"","activity":""},"behot_time":1505959621,"cursor":1505959621999,"url":"http://toutiao.com/group/6467701469989569037/","preload_web":1,"user_repin":0,"has_image":true,"item_version":0,"has_video":false,"group_id":6467701469989569037,"middle_image":{"url":"http://p3.pstatp.com/list/3b09000442d22438d24d","width":1212,"url_list":[{"url":"http://p3.pstatp.com/list/3b09000442d22438d24d"},{"url":"http://pb9.pstatp.com/list/3b09000442d22438d24d"},{"url":"http://pb1.pstatp.com/list/3b09000442d22438d24d"}],"uri":"list/3b09000442d22438d24d","height":568}},{"log_pb":{"impr_id":"20170921100956010008062212846B72"},"read_count":10175,"media_name":"股市杂谈","ban_comment":0,"abstract":"【凯瑞德董事长未来12个月拟继续增持公司不低于10%股份】凯瑞德晚间公告称，公司持股5%以上股东、共同实际控制人、董事长张培峰未来12个月内拟继续增持比例不低于公司已发行股份总数10%的股份。截止本公告日，张培峰先生个人持有公司普通股股票914.3万股，占公司总股本的5.","image_list":[],"digg_count":0,"article_type":0,"tag":"news_finance","forward_info":{"forward_count":0},"has_m3u8_video":0,"keywords":"华联控股,科达洁能,增持公司,尤夫股份,凯瑞德","rid":"20170921100956010008062212846B72","show_portrait_article":false,"user_verified":0,"aggr_type":1,"cell_type":0,"article_sub_type":0,"bury_count":0,"title":"收藏：4股，增持！","ignore_web_transform":1,"source_icon_style":5,"tip":0,"hot":0,"share_url":"http://m.toutiao.com/a6467843601354195470/?iid=3642583580&app=news_article","has_mp4_video":0,"source":"股市杂谈","comment_count":1,"article_url":"http://toutiao.com/group/6467843601354195470/","filter_words":[{"id":"8:0","name":"看过了","is_selected":false},{"id":"9:1","name":"内容太水","is_selected":false},{"id":"5:138901149","name":"拉黑作者:股市杂谈","is_selected":false},{"id":"3:11781038","name":"不想看:股票","is_selected":false}],"share_count":30,"publish_time":1505912189,"action_list":[{"action":1,"extra":{},"desc":""},{"action":3,"extra":{},"desc":""},{"action":7,"extra":{},"desc":""},{"action":9,"extra":{},"desc":""}],"cell_layout_style":1,"tag_id":6467843601354195470,"action_extra":"{\"channel_id\": 3189399007}","video_style":0,"verified_content":"","display_url":"http://toutiao.com/group/6467843601354195470/","large_image_list":[],"media_info":{"user_id":52730755375,"verified_content":"","avatar_url":"http://p1.pstatp.com/large/ef500188ce946f9c7ab","media_id":1553223274830849,"name":"股市杂谈","recommend_type":0,"follow":false,"recommend_reason":"","is_star_user":false,"user_verified":false},"item_id":6467843601354195470,"is_subject":false,"show_portrait":false,"repin_count":73,"cell_flag":11,"user_info":{"verified_content":"","avatar_url":"http://p3.pstatp.com/thumb/ef500188ce946f9c7ab","user_id":52730755375,"name":"股市杂谈","follower_count":0,"follow":false,"user_auth_info":"","user_verified":false,"description":"股市杂谈，财经笑侃，人生百态"},"source_open_url":"sslocal://profile?uid=52730755375","level":0,"ugc_recommend":{"reason":"","activity":""},"behot_time":1505959586,"cursor":1505959586999,"url":"http://toutiao.com/group/6467843601354195470/","preload_web":1,"user_repin":0,"has_image":false,"item_version":0,"has_video":false,"group_id":6467843601354195470,"middle_image":{}},{"log_pb":{"impr_id":"20170921100956010008062212846B72"},"read_count":15,"media_name":"绘景人","ban_comment":0,"abstract":"最近，中国农业银行，开始为其遍布全国大江南北的ATM机，上线\u201c刷脸取款\u201d，站在农行ATM机前，看一眼摄像头，再输入手机号、取款金额、密码，自动吐钞，拿走现金。整个过程，不要银行卡、不要手机扫码，只靠我们的一张脸，就可以在20秒之内，完成现金取款。","image_list":[{"url":"http://p1.pstatp.com/list/3b0d00033827a63ee151","width":640,"url_list":[{"url":"http://p1.pstatp.com/list/3b0d00033827a63ee151"},{"url":"http://pb3.pstatp.com/list/3b0d00033827a63ee151"},{"url":"http://pb9.pstatp.com/list/3b0d00033827a63ee151"}],"uri":"list/3b0d00033827a63ee151","height":360},{"url":"http://p1.pstatp.com/list/3b0c00033ac99665f5c4","width":640,"url_list":[{"url":"http://p1.pstatp.com/list/3b0c00033ac99665f5c4"},{"url":"http://pb3.pstatp.com/list/3b0c00033ac99665f5c4"},{"url":"http://pb9.pstatp.com/list/3b0c00033ac99665f5c4"}],"uri":"list/3b0c00033ac99665f5c4","height":360},{"url":"http://p9.pstatp.com/list/3b0e00032230144d73a6","width":518,"url_list":[{"url":"http://p9.pstatp.com/list/3b0e00032230144d73a6"},{"url":"http://pb1.pstatp.com/list/3b0e00032230144d73a6"},{"url":"http://pb3.pstatp.com/list/3b0e00032230144d73a6"}],"uri":"list/3b0e00032230144d73a6","height":291}],"digg_count":0,"article_type":0,"tag":"news_finance","forward_info":{"forward_count":0},"has_m3u8_video":0,"keywords":"刷脸取款,农行,人脸识别,银行,ATM机","rid":"20170921100956010008062212846B72","show_portrait_article":false,"user_verified":0,"aggr_type":1,"cell_type":0,"article_sub_type":0,"bury_count":0,"title":"银行推行的刷脸取款真的靠谱么？\u2014\u2014我来告诉你！","ignore_web_transform":1,"source_icon_style":4,"tip":1,"hot":1,"share_url":"http://m.toutiao.com/a6467857199581364749/?iid=3642583580&app=news_article","has_mp4_video":0,"source":"绘景人","comment_count":0,"article_url":"http://toutiao.com/group/6467857199581364749/","filter_words":[{"id":"8:0","name":"看过了","is_selected":false},{"id":"9:1","name":"内容太水","is_selected":false},{"id":"5:1125052565","name":"拉黑作者:绘景人","is_selected":false},{"id":"4:306442037","name":"不想看:银行业","is_selected":false}],"publish_time":1505915355,"action_list":[{"action":1,"extra":{},"desc":""},{"action":3,"extra":{},"desc":""},{"action":7,"extra":{},"desc":""},{"action":9,"extra":{},"desc":""}],"gallary_image_count":8,"cell_layout_style":1,"tag_id":6467857199581364749,"action_extra":"{\"channel_id\": 3189399007}","video_style":0,"verified_content":"","large_image_list":[],"media_info":{"user_id":58767450672,"verified_content":"","avatar_url":"http://p3.pstatp.com/large/1a6a000aba43444e853b","media_id":1563493757961217,"name":"绘景人","recommend_type":0,"follow":false,"recommend_reason":"","is_star_user":false,"user_verified":false},"item_id":6467857199581364749,"is_subject":false,"show_portrait":false,"level":0,"cell_flag":11,"user_info":{"verified_content":"","avatar_url":"http://p9.pstatp.com/thumb/1a6a000aba43444e853b","user_id":58767450672,"name":"绘景人","follower_count":0,"follow":false,"user_auth_info":"","user_verified":false,"description":"奇闻异事同分享，良辰美景读华章。"},"source_open_url":"sslocal://profile?uid=58767450672","display_url":"http://toutiao.com/group/6467857199581364749/","ugc_recommend":{"reason":"","activity":""},"behot_time":1505959551,"cursor":1505959551999,"url":"http://toutiao.com/group/6467857199581364749/","preload_web":1,"user_repin":0,"has_image":true,"item_version":0,"has_video":false,"group_id":6467857199581364749,"middle_image":{"url":"http://p1.pstatp.com/list/3b0d00033827a63ee151","width":640,"url_list":[{"url":"http://p1.pstatp.com/list/3b0d00033827a63ee151"},{"url":"http://pb3.pstatp.com/list/3b0d00033827a63ee151"},{"url":"http://pb9.pstatp.com/list/3b0d00033827a63ee151"}],"uri":"list/3b0d00033827a63ee151","height":360}},{"log_pb":{"impr_id":"20170921100956010008062212846B72"},"read_count":420,"media_name":"汇金网","ban_comment":0,"abstract":"欧阳赤钱欧阳赤钱：9.20黄金回踩1308直接多！美联储决议黄金冲高回落？上午好！进入九月，入秋以后，天气慢慢开始转凉，这段时间感冒的人挺多的，包括我，鼻子一直不通，挺难受的，你们一定要注意身体，谨防感冒！9.20美联储决议来袭，黄金1200时代再来临？","image_list":[{"url":"http://p3.pstatp.com/list/3171000954a90795aed2","width":200,"url_list":[{"url":"http://p3.pstatp.com/list/3171000954a90795aed2"},{"url":"http://pb9.pstatp.com/list/3171000954a90795aed2"},{"url":"http://pb1.pstatp.com/list/3171000954a90795aed2"}],"uri":"list/3171000954a90795aed2","height":112},{"url":"http://p1.pstatp.com/list/31740001a6eb52f19e54","width":600,"url_list":[{"url":"http://p1.pstatp.com/list/31740001a6eb52f19e54"},{"url":"http://pb3.pstatp.com/list/31740001a6eb52f19e54"},{"url":"http://pb9.pstatp.com/list/31740001a6eb52f19e54"}],"uri":"list/31740001a6eb52f19e54","height":337},{"url":"http://p1.pstatp.com/list/316600057d1420c99dc0","width":600,"url_list":[{"url":"http://p1.pstatp.com/list/316600057d1420c99dc0"},{"url":"http://pb3.pstatp.com/list/316600057d1420c99dc0"},{"url":"http://pb9.pstatp.com/list/316600057d1420c99dc0"}],"uri":"list/316600057d1420c99dc0","height":337}],"digg_count":0,"article_type":0,"tag":"news_finance","forward_info":{"forward_count":0},"has_m3u8_video":0,"keywords":"分析师,黄金价格,美联储,黄金,决议","rid":"20170921100956010008062212846B72","show_portrait_article":false,"user_verified":0,"aggr_type":1,"cell_type":0,"article_sub_type":0,"bury_count":0,"title":"黄金回踩1308直接多！决议黄金冲高回落？","ignore_web_transform":1,"source_icon_style":4,"tip":0,"hot":0,"share_url":"http://m.toutiao.com/group/6467680138032578830/?iid=3642583580&app=news_article","has_mp4_video":0,"source":"汇金网","comment_count":2,"article_url":"http://www.gold678.com/dy/a/3181666","filter_words":[{"id":"8:0","name":"看过了","is_selected":false},{"id":"9:1","name":"内容太水","is_selected":false},{"id":"5:9312317","name":"拉黑作者:汇金网","is_selected":false},{"id":"3:31135329","name":"不想看:贵金属","is_selected":false},{"id":"6:15555","name":"不想看:黄金","is_selected":false}],"publish_time":1505874756,"action_list":[{"action":1,"extra":{},"desc":""},{"action":3,"extra":{},"desc":""},{"action":7,"extra":{},"desc":""},{"action":9,"extra":{},"desc":""}],"gallary_image_count":3,"cell_layout_style":1,"tag_id":6467680138032578830,"action_extra":"{\"channel_id\": 3189399007}","video_style":0,"verified_content":"","display_url":"http://toutiao.com/group/6467680138032578830/","large_image_list":[],"media_info":{"user_id":6033789125,"verified_content":"","avatar_url":"http://p3.pstatp.com/large/4d001eabd2a8a0b203","media_id":6033923151,"name":"汇金网","recommend_type":0,"follow":false,"recommend_reason":"","is_star_user":false,"user_verified":false},"item_id":6467686885064966670,"is_subject":false,"show_portrait":false,"repin_count":1,"cell_flag":11,"user_info":{"verified_content":"","avatar_url":"http://p1.pstatp.com/thumb/4d001eabd2a8a0b203","user_id":6033789125,"name":"汇金网","follower_count":0,"follow":false,"user_auth_info":"","user_verified":false,"description":"汇金网，更有效的方式看财经。"},"source_open_url":"sslocal://profile?uid=6033789125","level":0,"ugc_recommend":{"reason":"","activity":""},"behot_time":1505959516,"cursor":1505959516999,"url":"http://www.gold678.com/dy/a/3181666","preload_web":1,"user_repin":0,"has_image":true,"item_version":0,"has_video":false,"group_id":6467680138032578830,"middle_image":{"url":"http://p3.pstatp.com/list/3171000954a90795aed2","width":200,"url_list":[{"url":"http://p3.pstatp.com/list/3171000954a90795aed2"},{"url":"http://pb9.pstatp.com/list/3171000954a90795aed2"},{"url":"http://pb1.pstatp.com/list/3171000954a90795aed2"}],"uri":"list/3171000954a90795aed2","height":112}},{"log_pb":{"impr_id":"20170921100956010008062212846B72"},"read_count":27609,"media_name":"快看时尚","ban_comment":0,"abstract":"\u201c海澜之家，男人的衣柜\u201d多少人对它影响深刻，一跃成为国民男装品牌，但在很多人眼中，海澜之家更像一个\u201c老男人衣柜\u201d。然而这个\u201c衣柜\u201d却在服装企业业绩纷纷遇冷的大环境下成为\u201c另类\u201d，市值突破600亿，超越Coach、Prada、Burberry等世界著名品牌！","image_list":[],"digg_count":0,"article_type":0,"tag":"news_fashion","forward_info":{"forward_count":0},"has_m3u8_video":0,"keywords":"林更新,Coach,老男人,Prada,海澜,丁世忠","rid":"20170921100956010008062212846B72","show_portrait_article":false,"user_verified":0,"aggr_type":1,"cell_type":0,"article_sub_type":0,"bury_count":0,"title":"服装零售如何逆袭？男人的衣柜海澜之家教你杀出重围","ignore_web_transform":1,"source_icon_style":4,"tip":0,"hot":0,"share_url":"http://m.toutiao.com/a6446999890970755342/?iid=3642583580&app=news_article","has_mp4_video":0,"source":"快看时尚","comment_count":0,"article_url":"http://toutiao.com/group/6446999890970755342/","filter_words":[{"id":"8:0","name":"看过了","is_selected":false},{"id":"9:1","name":"内容太水","is_selected":false},{"id":"5:1150641921","name":"拉黑作者:快看时尚","is_selected":false},{"id":"4:306464213","name":"不想看:纺织服装业","is_selected":false},{"id":"6:48120024","name":"不想看:海澜之家","is_selected":false}],"publish_time":1501059733,"action_list":[{"action":1,"extra":{},"desc":""},{"action":3,"extra":{},"desc":""},{"action":7,"extra":{},"desc":""},{"action":9,"extra":{},"desc":""}],"gallary_image_count":6,"cell_layout_style":1,"tag_id":6446999890970755342,"action_extra":"{\"channel_id\": 3189399007}","video_style":0,"verified_content":"","display_url":"http://toutiao.com/group/6446999890970755342/","large_image_list":[],"media_info":{"user_id":59191579269,"verified_content":"","avatar_url":"http://p1.pstatp.com/large/1bf4000f01963e6bceea","media_id":1565072175797249,"name":"快看时尚","recommend_type":0,"follow":false,"recommend_reason":"","is_star_user":false,"user_verified":false},"item_id":6446517613290848781,"is_subject":false,"show_portrait":false,"repin_count":5,"cell_flag":11,"user_info":{"verified_content":"","avatar_url":"http://p1.pstatp.com/thumb/1bf4000f01963e6bceea","user_id":59191579269,"name":"快看时尚","follower_count":0,"follow":false,"user_auth_info":"","user_verified":false,"description":"服装行业永远不缺潮牌，只缺冷静思考的智慧，和大把挥霍的时间"},"source_open_url":"sslocal://profile?uid=59191579269","level":0,"ugc_recommend":{"reason":"","activity":""},"behot_time":1505959481,"cursor":1505959481999,"url":"http://toutiao.com/group/6446999890970755342/","preload_web":1,"user_repin":0,"has_image":true,"item_version":0,"has_video":false,"group_id":6446999890970755342,"middle_image":{"url":"http://p1.pstatp.com/list/2ede00047ff0ba85b4b5","width":440,"url_list":[{"url":"http://p1.pstatp.com/list/2ede00047ff0ba85b4b5"},{"url":"http://pb3.pstatp.com/list/2ede00047ff0ba85b4b5"},{"url":"http://pb9.pstatp.com/list/2ede00047ff0ba85b4b5"}],"uri":"list/2ede00047ff0ba85b4b5","height":245}}]
     * tips : {"display_info":"今日头条推荐引擎有10条更新","open_url":"","web_url":"","app_name":"今日头条","package_name":"","display_template":"今日头条推荐引擎有%s条更新","type":"app","display_duration":2,"download_url":""}
     */

    private int login_status;
    private int total_number;
    private boolean has_more;
    private String post_content_hint;
    private int show_et_status;
    private int feed_flag;
    private String message;
    private boolean has_more_to_refresh;
    private TipsBean tips;
    private List<DataBean> data;

    public static MyBean objectFromData(String str) {

        return new Gson().fromJson(str, MyBean.class);
    }

    public int getLogin_status() {
        return login_status;
    }

    public void setLogin_status(int login_status) {
        this.login_status = login_status;
    }

    public int getTotal_number() {
        return total_number;
    }

    public void setTotal_number(int total_number) {
        this.total_number = total_number;
    }

    public boolean isHas_more() {
        return has_more;
    }

    public void setHas_more(boolean has_more) {
        this.has_more = has_more;
    }

    public String getPost_content_hint() {
        return post_content_hint;
    }

    public void setPost_content_hint(String post_content_hint) {
        this.post_content_hint = post_content_hint;
    }

    public int getShow_et_status() {
        return show_et_status;
    }

    public void setShow_et_status(int show_et_status) {
        this.show_et_status = show_et_status;
    }

    public int getFeed_flag() {
        return feed_flag;
    }

    public void setFeed_flag(int feed_flag) {
        this.feed_flag = feed_flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isHas_more_to_refresh() {
        return has_more_to_refresh;
    }

    public void setHas_more_to_refresh(boolean has_more_to_refresh) {
        this.has_more_to_refresh = has_more_to_refresh;
    }

    public TipsBean getTips() {
        return tips;
    }

    public void setTips(TipsBean tips) {
        this.tips = tips;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class TipsBean {
        /**
         * display_info : 今日头条推荐引擎有10条更新
         * open_url :
         * web_url :
         * app_name : 今日头条
         * package_name :
         * display_template : 今日头条推荐引擎有%s条更新
         * type : app
         * display_duration : 2
         * download_url :
         */

        private String display_info;
        private String open_url;
        private String web_url;
        private String app_name;
        private String package_name;
        private String display_template;
        private String type;
        private int display_duration;
        private String download_url;

        public static TipsBean objectFromData(String str) {

            return new Gson().fromJson(str, TipsBean.class);
        }

        public String getDisplay_info() {
            return display_info;
        }

        public void setDisplay_info(String display_info) {
            this.display_info = display_info;
        }

        public String getOpen_url() {
            return open_url;
        }

        public void setOpen_url(String open_url) {
            this.open_url = open_url;
        }

        public String getWeb_url() {
            return web_url;
        }

        public void setWeb_url(String web_url) {
            this.web_url = web_url;
        }

        public String getApp_name() {
            return app_name;
        }

        public void setApp_name(String app_name) {
            this.app_name = app_name;
        }

        public String getPackage_name() {
            return package_name;
        }

        public void setPackage_name(String package_name) {
            this.package_name = package_name;
        }

        public String getDisplay_template() {
            return display_template;
        }

        public void setDisplay_template(String display_template) {
            this.display_template = display_template;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getDisplay_duration() {
            return display_duration;
        }

        public void setDisplay_duration(int display_duration) {
            this.display_duration = display_duration;
        }

        public String getDownload_url() {
            return download_url;
        }

        public void setDownload_url(String download_url) {
            this.download_url = download_url;
        }
    }

    public static class DataBean {
        /**
         * log_pb : {"impr_id":"20170921100956010008062212846B72"}
         * read_count : 702
         * media_name : IT168企业级
         * ban_comment : 0
         * abstract : 根据Gartner的数据，全球服务器收入在2017年第二季度同比增长了2.8%，而出货量比2016年第二季度增长了2.4%。惠普(HPE)在收入方面，继续领先全球服务器市场。尽管下滑了9.4%，公司在2017年第二季度的收入总额达到了32亿美元，占到总营收的23%。
         * image_list : [{"url":"http://p3.pstatp.com/list/3b0e0000f0cd01fadd36","width":670,"url_list":[{"url":"http://p3.pstatp.com/list/3b0e0000f0cd01fadd36"},{"url":"http://pb9.pstatp.com/list/3b0e0000f0cd01fadd36"},{"url":"http://pb1.pstatp.com/list/3b0e0000f0cd01fadd36"}],"uri":"list/3b0e0000f0cd01fadd36","height":376},{"url":"http://p3.pstatp.com/list/3b0800042f17e3f5978b","width":670,"url_list":[{"url":"http://p3.pstatp.com/list/3b0800042f17e3f5978b"},{"url":"http://pb9.pstatp.com/list/3b0800042f17e3f5978b"},{"url":"http://pb1.pstatp.com/list/3b0800042f17e3f5978b"}],"uri":"list/3b0800042f17e3f5978b","height":349},{"url":"http://p3.pstatp.com/list/3b09000425a99b8cf0ec","width":670,"url_list":[{"url":"http://p3.pstatp.com/list/3b09000425a99b8cf0ec"},{"url":"http://pb9.pstatp.com/list/3b09000425a99b8cf0ec"},{"url":"http://pb1.pstatp.com/list/3b09000425a99b8cf0ec"}],"uri":"list/3b09000425a99b8cf0ec","height":356}]
         * digg_count : 0
         * article_type : 0
         * tag : news_tech
         * forward_info : {"forward_count":0}
         * has_m3u8_video : 0
         * keywords : x86,Gartner,出货量,服务器,EMC
         * rid : 20170921100956010008062212846B72
         * show_portrait_article : false
         * user_verified : 1
         * aggr_type : 1
         * cell_type : 0
         * article_sub_type : 0
         * bury_count : 0
         * title : 2017 Q2服务器营收增长2.8% 华为增58%
         * ignore_web_transform : 1
         * source_icon_style : 2
         * tip : 1
         * hot : 1
         * share_url : http://m.toutiao.com/a6467688082761056782/?iid=3642583580&app=news_article
         * has_mp4_video : 0
         * source : IT168企业级
         * comment_count : 2
         * article_url : http://toutiao.com/group/6467688082761056782/
         * filter_words : [{"id":"8:0","name":"看过了","is_selected":false},{"id":"9:1","name":"内容太水","is_selected":false},{"id":"5:62396182","name":"拉黑作者:IT168企业级","is_selected":false},{"id":"6:18107","name":"不想看:华为","is_selected":false}]
         * share_count : 5
         * publish_time : 1505875979
         * action_list : [{"action":1,"extra":{},"desc":""},{"action":3,"extra":{},"desc":""},{"action":7,"extra":{},"desc":""},{"action":9,"extra":{},"desc":""}]
         * gallary_image_count : 3
         * cell_layout_style : 1
         * tag_id : 6467688082761056782
         * action_extra : {"channel_id": 3189399007}
         * video_style : 0
         * verified_content : IT168官方头条号
         * display_url : http://toutiao.com/group/6467688082761056782/
         * large_image_list : []
         * media_info : {"user_id":51842642815,"verified_content":"","avatar_url":"http://p3.pstatp.com/large/ef50008ac962a68910e","media_id":51849204507,"name":"IT168企业级","recommend_type":0,"follow":false,"recommend_reason":"","is_star_user":false,"user_verified":true}
         * item_id : 6467688082761056782
         * is_subject : false
         * show_portrait : false
         * repin_count : 4
         * cell_flag : 11
         * user_info : {"verified_content":"IT168官方头条号","avatar_url":"http://p3.pstatp.com/thumb/ef50008ac962a68910e","user_id":51842642815,"name":"IT168企业级","follower_count":0,"follow":false,"user_auth_info":"{\"auth_type\": \"0\", \"auth_info\": \"IT168官方头条号\"}","user_verified":true,"description":"为用户提供趋势分析、技术选型、产品导购、方案应用等建议。"}
         * source_open_url : sslocal://profile?uid=51842642815
         * level : 0
         * ugc_recommend : {"reason":"IT168官方头条号","activity":""}
         * behot_time : 1505959796
         * cursor : 1505959796999
         * url : http://toutiao.com/group/6467688082761056782/
         * preload_web : 1
         * user_repin : 0
         * has_image : true
         * item_version : 0
         * has_video : false
         * group_id : 6467688082761056782
         * middle_image : {"url":"http://p3.pstatp.com/list/3b0e0000f0cd01fadd36","width":670,"url_list":[{"url":"http://p3.pstatp.com/list/3b0e0000f0cd01fadd36"},{"url":"http://pb9.pstatp.com/list/3b0e0000f0cd01fadd36"},{"url":"http://pb1.pstatp.com/list/3b0e0000f0cd01fadd36"}],"uri":"list/3b0e0000f0cd01fadd36","height":376}
         */

        private LogPbBean log_pb;
        private int read_count;
        private String media_name;
        private int ban_comment;
        @SerializedName("abstract")
        private String abstractX;
        private int digg_count;
        private int article_type;
        private String tag;
        private ForwardInfoBean forward_info;
        private int has_m3u8_video;
        private String keywords;
        private String rid;
        private boolean show_portrait_article;
        private int user_verified;
        private int aggr_type;
        private int cell_type;
        private int article_sub_type;
        private int bury_count;
        private String title;
        private int ignore_web_transform;
        private int source_icon_style;
        private int tip;
        private int hot;
        private String share_url;
        private int has_mp4_video;
        private String source;
        private int comment_count;
        private String article_url;
        private int share_count;
        private int publish_time;
        private int gallary_image_count;
        private int cell_layout_style;
        private long tag_id;
        private String action_extra;
        private int video_style;
        private String verified_content;
        private String display_url;
        private MediaInfoBean media_info;
        private long item_id;
        private boolean is_subject;
        private boolean show_portrait;
        private int repin_count;
        private int cell_flag;
        private UserInfoBean user_info;
        private String source_open_url;
        private int level;
        private UgcRecommendBean ugc_recommend;
        private int behot_time;
        private long cursor;
        private String url;
        private int preload_web;
        private int user_repin;
        private boolean has_image;
        private int item_version;
        private boolean has_video;
        private long group_id;
        private MiddleImageBean middle_image;
        private List<ImageListBean> image_list;
        private List<FilterWordsBean> filter_words;
        private List<ActionListBean> action_list;
        private List<?> large_image_list;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public LogPbBean getLog_pb() {
            return log_pb;
        }

        public void setLog_pb(LogPbBean log_pb) {
            this.log_pb = log_pb;
        }

        public int getRead_count() {
            return read_count;
        }

        public void setRead_count(int read_count) {
            this.read_count = read_count;
        }

        public String getMedia_name() {
            return media_name;
        }

        public void setMedia_name(String media_name) {
            this.media_name = media_name;
        }

        public int getBan_comment() {
            return ban_comment;
        }

        public void setBan_comment(int ban_comment) {
            this.ban_comment = ban_comment;
        }

        public String getAbstractX() {
            return abstractX;
        }

        public void setAbstractX(String abstractX) {
            this.abstractX = abstractX;
        }

        public int getDigg_count() {
            return digg_count;
        }

        public void setDigg_count(int digg_count) {
            this.digg_count = digg_count;
        }

        public int getArticle_type() {
            return article_type;
        }

        public void setArticle_type(int article_type) {
            this.article_type = article_type;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public ForwardInfoBean getForward_info() {
            return forward_info;
        }

        public void setForward_info(ForwardInfoBean forward_info) {
            this.forward_info = forward_info;
        }

        public int getHas_m3u8_video() {
            return has_m3u8_video;
        }

        public void setHas_m3u8_video(int has_m3u8_video) {
            this.has_m3u8_video = has_m3u8_video;
        }

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public String getRid() {
            return rid;
        }

        public void setRid(String rid) {
            this.rid = rid;
        }

        public boolean isShow_portrait_article() {
            return show_portrait_article;
        }

        public void setShow_portrait_article(boolean show_portrait_article) {
            this.show_portrait_article = show_portrait_article;
        }

        public int getUser_verified() {
            return user_verified;
        }

        public void setUser_verified(int user_verified) {
            this.user_verified = user_verified;
        }

        public int getAggr_type() {
            return aggr_type;
        }

        public void setAggr_type(int aggr_type) {
            this.aggr_type = aggr_type;
        }

        public int getCell_type() {
            return cell_type;
        }

        public void setCell_type(int cell_type) {
            this.cell_type = cell_type;
        }

        public int getArticle_sub_type() {
            return article_sub_type;
        }

        public void setArticle_sub_type(int article_sub_type) {
            this.article_sub_type = article_sub_type;
        }

        public int getBury_count() {
            return bury_count;
        }

        public void setBury_count(int bury_count) {
            this.bury_count = bury_count;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getIgnore_web_transform() {
            return ignore_web_transform;
        }

        public void setIgnore_web_transform(int ignore_web_transform) {
            this.ignore_web_transform = ignore_web_transform;
        }

        public int getSource_icon_style() {
            return source_icon_style;
        }

        public void setSource_icon_style(int source_icon_style) {
            this.source_icon_style = source_icon_style;
        }

        public int getTip() {
            return tip;
        }

        public void setTip(int tip) {
            this.tip = tip;
        }

        public int getHot() {
            return hot;
        }

        public void setHot(int hot) {
            this.hot = hot;
        }

        public String getShare_url() {
            return share_url;
        }

        public void setShare_url(String share_url) {
            this.share_url = share_url;
        }

        public int getHas_mp4_video() {
            return has_mp4_video;
        }

        public void setHas_mp4_video(int has_mp4_video) {
            this.has_mp4_video = has_mp4_video;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public int getComment_count() {
            return comment_count;
        }

        public void setComment_count(int comment_count) {
            this.comment_count = comment_count;
        }

        public String getArticle_url() {
            return article_url;
        }

        public void setArticle_url(String article_url) {
            this.article_url = article_url;
        }

        public int getShare_count() {
            return share_count;
        }

        public void setShare_count(int share_count) {
            this.share_count = share_count;
        }

        public int getPublish_time() {
            return publish_time;
        }

        public void setPublish_time(int publish_time) {
            this.publish_time = publish_time;
        }

        public int getGallary_image_count() {
            return gallary_image_count;
        }

        public void setGallary_image_count(int gallary_image_count) {
            this.gallary_image_count = gallary_image_count;
        }

        public int getCell_layout_style() {
            return cell_layout_style;
        }

        public void setCell_layout_style(int cell_layout_style) {
            this.cell_layout_style = cell_layout_style;
        }

        public long getTag_id() {
            return tag_id;
        }

        public void setTag_id(long tag_id) {
            this.tag_id = tag_id;
        }

        public String getAction_extra() {
            return action_extra;
        }

        public void setAction_extra(String action_extra) {
            this.action_extra = action_extra;
        }

        public int getVideo_style() {
            return video_style;
        }

        public void setVideo_style(int video_style) {
            this.video_style = video_style;
        }

        public String getVerified_content() {
            return verified_content;
        }

        public void setVerified_content(String verified_content) {
            this.verified_content = verified_content;
        }

        public String getDisplay_url() {
            return display_url;
        }

        public void setDisplay_url(String display_url) {
            this.display_url = display_url;
        }

        public MediaInfoBean getMedia_info() {
            return media_info;
        }

        public void setMedia_info(MediaInfoBean media_info) {
            this.media_info = media_info;
        }

        public long getItem_id() {
            return item_id;
        }

        public void setItem_id(long item_id) {
            this.item_id = item_id;
        }

        public boolean isIs_subject() {
            return is_subject;
        }

        public void setIs_subject(boolean is_subject) {
            this.is_subject = is_subject;
        }

        public boolean isShow_portrait() {
            return show_portrait;
        }

        public void setShow_portrait(boolean show_portrait) {
            this.show_portrait = show_portrait;
        }

        public int getRepin_count() {
            return repin_count;
        }

        public void setRepin_count(int repin_count) {
            this.repin_count = repin_count;
        }

        public int getCell_flag() {
            return cell_flag;
        }

        public void setCell_flag(int cell_flag) {
            this.cell_flag = cell_flag;
        }

        public UserInfoBean getUser_info() {
            return user_info;
        }

        public void setUser_info(UserInfoBean user_info) {
            this.user_info = user_info;
        }

        public String getSource_open_url() {
            return source_open_url;
        }

        public void setSource_open_url(String source_open_url) {
            this.source_open_url = source_open_url;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public UgcRecommendBean getUgc_recommend() {
            return ugc_recommend;
        }

        public void setUgc_recommend(UgcRecommendBean ugc_recommend) {
            this.ugc_recommend = ugc_recommend;
        }

        public int getBehot_time() {
            return behot_time;
        }

        public void setBehot_time(int behot_time) {
            this.behot_time = behot_time;
        }

        public long getCursor() {
            return cursor;
        }

        public void setCursor(long cursor) {
            this.cursor = cursor;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getPreload_web() {
            return preload_web;
        }

        public void setPreload_web(int preload_web) {
            this.preload_web = preload_web;
        }

        public int getUser_repin() {
            return user_repin;
        }

        public void setUser_repin(int user_repin) {
            this.user_repin = user_repin;
        }

        public boolean isHas_image() {
            return has_image;
        }

        public void setHas_image(boolean has_image) {
            this.has_image = has_image;
        }

        public int getItem_version() {
            return item_version;
        }

        public void setItem_version(int item_version) {
            this.item_version = item_version;
        }

        public boolean isHas_video() {
            return has_video;
        }

        public void setHas_video(boolean has_video) {
            this.has_video = has_video;
        }

        public long getGroup_id() {
            return group_id;
        }

        public void setGroup_id(long group_id) {
            this.group_id = group_id;
        }

        public MiddleImageBean getMiddle_image() {
            return middle_image;
        }

        public void setMiddle_image(MiddleImageBean middle_image) {
            this.middle_image = middle_image;
        }

        public List<ImageListBean> getImage_list() {
            return image_list;
        }

        public void setImage_list(List<ImageListBean> image_list) {
            this.image_list = image_list;
        }

        public List<FilterWordsBean> getFilter_words() {
            return filter_words;
        }

        public void setFilter_words(List<FilterWordsBean> filter_words) {
            this.filter_words = filter_words;
        }

        public List<ActionListBean> getAction_list() {
            return action_list;
        }

        public void setAction_list(List<ActionListBean> action_list) {
            this.action_list = action_list;
        }

        public List<?> getLarge_image_list() {
            return large_image_list;
        }

        public void setLarge_image_list(List<?> large_image_list) {
            this.large_image_list = large_image_list;
        }

        public static class LogPbBean {
            /**
             * impr_id : 20170921100956010008062212846B72
             */

            private String impr_id;

            public static LogPbBean objectFromData(String str) {

                return new Gson().fromJson(str, LogPbBean.class);
            }

            public String getImpr_id() {
                return impr_id;
            }

            public void setImpr_id(String impr_id) {
                this.impr_id = impr_id;
            }
        }

        public static class ForwardInfoBean {
            /**
             * forward_count : 0
             */

            private int forward_count;

            public static ForwardInfoBean objectFromData(String str) {

                return new Gson().fromJson(str, ForwardInfoBean.class);
            }

            public int getForward_count() {
                return forward_count;
            }

            public void setForward_count(int forward_count) {
                this.forward_count = forward_count;
            }
        }

        public static class MediaInfoBean {
            /**
             * user_id : 51842642815
             * verified_content :
             * avatar_url : http://p3.pstatp.com/large/ef50008ac962a68910e
             * media_id : 51849204507
             * name : IT168企业级
             * recommend_type : 0
             * follow : false
             * recommend_reason :
             * is_star_user : false
             * user_verified : true
             */

            private long user_id;
            private String verified_content;
            private String avatar_url;
            private long media_id;
            private String name;
            private int recommend_type;
            private boolean follow;
            private String recommend_reason;
            private boolean is_star_user;
            private boolean user_verified;

            public static MediaInfoBean objectFromData(String str) {

                return new Gson().fromJson(str, MediaInfoBean.class);
            }

            public long getUser_id() {
                return user_id;
            }

            public void setUser_id(long user_id) {
                this.user_id = user_id;
            }

            public String getVerified_content() {
                return verified_content;
            }

            public void setVerified_content(String verified_content) {
                this.verified_content = verified_content;
            }

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public long getMedia_id() {
                return media_id;
            }

            public void setMedia_id(long media_id) {
                this.media_id = media_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getRecommend_type() {
                return recommend_type;
            }

            public void setRecommend_type(int recommend_type) {
                this.recommend_type = recommend_type;
            }

            public boolean isFollow() {
                return follow;
            }

            public void setFollow(boolean follow) {
                this.follow = follow;
            }

            public String getRecommend_reason() {
                return recommend_reason;
            }

            public void setRecommend_reason(String recommend_reason) {
                this.recommend_reason = recommend_reason;
            }

            public boolean isIs_star_user() {
                return is_star_user;
            }

            public void setIs_star_user(boolean is_star_user) {
                this.is_star_user = is_star_user;
            }

            public boolean isUser_verified() {
                return user_verified;
            }

            public void setUser_verified(boolean user_verified) {
                this.user_verified = user_verified;
            }
        }

        public static class UserInfoBean {
            /**
             * verified_content : IT168官方头条号
             * avatar_url : http://p3.pstatp.com/thumb/ef50008ac962a68910e
             * user_id : 51842642815
             * name : IT168企业级
             * follower_count : 0
             * follow : false
             * user_auth_info : {"auth_type": "0", "auth_info": "IT168官方头条号"}
             * user_verified : true
             * description : 为用户提供趋势分析、技术选型、产品导购、方案应用等建议。
             */

            private String verified_content;
            private String avatar_url;
            private long user_id;
            private String name;
            private int follower_count;
            private boolean follow;
            private String user_auth_info;
            private boolean user_verified;
            private String description;

            public static UserInfoBean objectFromData(String str) {

                return new Gson().fromJson(str, UserInfoBean.class);
            }

            public String getVerified_content() {
                return verified_content;
            }

            public void setVerified_content(String verified_content) {
                this.verified_content = verified_content;
            }

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public long getUser_id() {
                return user_id;
            }

            public void setUser_id(long user_id) {
                this.user_id = user_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getFollower_count() {
                return follower_count;
            }

            public void setFollower_count(int follower_count) {
                this.follower_count = follower_count;
            }

            public boolean isFollow() {
                return follow;
            }

            public void setFollow(boolean follow) {
                this.follow = follow;
            }

            public String getUser_auth_info() {
                return user_auth_info;
            }

            public void setUser_auth_info(String user_auth_info) {
                this.user_auth_info = user_auth_info;
            }

            public boolean isUser_verified() {
                return user_verified;
            }

            public void setUser_verified(boolean user_verified) {
                this.user_verified = user_verified;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }
        }

        public static class UgcRecommendBean {
            /**
             * reason : IT168官方头条号
             * activity :
             */

            private String reason;
            private String activity;

            public static UgcRecommendBean objectFromData(String str) {

                return new Gson().fromJson(str, UgcRecommendBean.class);
            }

            public String getReason() {
                return reason;
            }

            public void setReason(String reason) {
                this.reason = reason;
            }

            public String getActivity() {
                return activity;
            }

            public void setActivity(String activity) {
                this.activity = activity;
            }
        }

        public static class MiddleImageBean {
            /**
             * url : http://p3.pstatp.com/list/3b0e0000f0cd01fadd36
             * width : 670
             * url_list : [{"url":"http://p3.pstatp.com/list/3b0e0000f0cd01fadd36"},{"url":"http://pb9.pstatp.com/list/3b0e0000f0cd01fadd36"},{"url":"http://pb1.pstatp.com/list/3b0e0000f0cd01fadd36"}]
             * uri : list/3b0e0000f0cd01fadd36
             * height : 376
             */

            private String url;
            private int width;
            private String uri;
            private int height;
            private List<UrlListBean> url_list;

            public static MiddleImageBean objectFromData(String str) {

                return new Gson().fromJson(str, MiddleImageBean.class);
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public List<UrlListBean> getUrl_list() {
                return url_list;
            }

            public void setUrl_list(List<UrlListBean> url_list) {
                this.url_list = url_list;
            }

            public static class UrlListBean {
                /**
                 * url : http://p3.pstatp.com/list/3b0e0000f0cd01fadd36
                 */

                private String url;

                public static UrlListBean objectFromData(String str) {

                    return new Gson().fromJson(str, UrlListBean.class);
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }

        public static class ImageListBean {
            /**
             * url : http://p3.pstatp.com/list/3b0e0000f0cd01fadd36
             * width : 670
             * url_list : [{"url":"http://p3.pstatp.com/list/3b0e0000f0cd01fadd36"},{"url":"http://pb9.pstatp.com/list/3b0e0000f0cd01fadd36"},{"url":"http://pb1.pstatp.com/list/3b0e0000f0cd01fadd36"}]
             * uri : list/3b0e0000f0cd01fadd36
             * height : 376
             */

            private String url;
            private int width;
            private String uri;
            private int height;
            private List<UrlListBeanX> url_list;

            public static ImageListBean objectFromData(String str) {

                return new Gson().fromJson(str, ImageListBean.class);
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public List<UrlListBeanX> getUrl_list() {
                return url_list;
            }

            public void setUrl_list(List<UrlListBeanX> url_list) {
                this.url_list = url_list;
            }

            public static class UrlListBeanX {
                /**
                 * url : http://p3.pstatp.com/list/3b0e0000f0cd01fadd36
                 */

                private String url;

                public static UrlListBeanX objectFromData(String str) {

                    return new Gson().fromJson(str, UrlListBeanX.class);
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }

        public static class FilterWordsBean {
            /**
             * id : 8:0
             * name : 看过了
             * is_selected : false
             */

            private String id;
            private String name;
            private boolean is_selected;

            public static FilterWordsBean objectFromData(String str) {

                return new Gson().fromJson(str, FilterWordsBean.class);
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public boolean isIs_selected() {
                return is_selected;
            }

            public void setIs_selected(boolean is_selected) {
                this.is_selected = is_selected;
            }
        }

        public static class ActionListBean {
            /**
             * action : 1
             * extra : {}
             * desc :
             */

            private int action;
            private ExtraBean extra;
            private String desc;

            public static ActionListBean objectFromData(String str) {

                return new Gson().fromJson(str, ActionListBean.class);
            }

            public int getAction() {
                return action;
            }

            public void setAction(int action) {
                this.action = action;
            }

            public ExtraBean getExtra() {
                return extra;
            }

            public void setExtra(ExtraBean extra) {
                this.extra = extra;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public static class ExtraBean {
                public static ExtraBean objectFromData(String str) {

                    return new Gson().fromJson(str, ExtraBean.class);
                }
            }
        }
    }
}
