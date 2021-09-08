package top.misec;

import lombok.Data;

/**
 * 外部配置
 *
 * @author itning
 * @since 2021/4/29 17:55
 */
@Data
public class KeyValueClass {
    private String dedeuserid;
    private String sessdata;
    private String biliJct;
    private String serverpushkey;
    private String telegrambottoken;
    private String telegramchatid;

    private Integer numberOfCoins;
    private Integer reserveCoins;
    private Integer selectLike;
    private Boolean monthEndAutoCharge;
    private Boolean giveGift;
    private String upLive;
    private String chargeForLove;
    private String devicePlatform;
    private Integer coinAddPriority;
    private Boolean skipDailyTask;
    private String userAgent;
    private Integer taskIntervalTime;
    private Integer chargeDay;
    private Integer predictNumberOfCoins;
    private Integer minimumNumberOfCoins;
    private Boolean matchGame;
    private Boolean showHandModel;

    @Override
    public String toString() {
        StringBuilder dedeuserid = new StringBuilder(this.dedeuserid);
        StringBuilder sessData = new StringBuilder(this.sessdata);
        StringBuilder biliJct = new StringBuilder(this.biliJct);
        return "KeyValueClass{" +
                "dedeuserid='" + dedeuserid.replace(2, 4, "****") + '\'' +
                ", sessdata='" + sessData.replace(3, 15, "****") + '\'' +
                ", biliJct='" + biliJct.replace(3, 15, "****") + '\'' +
                ", serverpushkey='" + serverpushkey + '\'' +
                ", telegrambottoken='" + telegrambottoken + '\'' +
                ", telegramchatid='" + telegramchatid + '\'' +
                ", numberOfCoins=" + numberOfCoins +
                ", reserveCoins=" + reserveCoins +
                ", selectLike=" + selectLike +
                ", monthEndAutoCharge=" + monthEndAutoCharge +
                ", giveGift=" + giveGift +
                ", upLive='" + upLive + '\'' +
                ", chargeForLove='" + chargeForLove + '\'' +
                ", devicePlatform='" + devicePlatform + '\'' +
                ", coinAddPriority=" + coinAddPriority +
                ", skipDailyTask=" + skipDailyTask +
                ", userAgent='" + userAgent + '\'' +
                '}';
    }
}
