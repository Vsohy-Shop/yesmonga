package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import java.util.List;
import kotlin.C11076d0;
import kotlinx.serialization.C12438n;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b^\n\u0002\u0010 \n\u0002\bC\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\t8&X§\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\t8&X§\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00118&X§\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0005\u001a\u0004\b\u0017\u0010\u0007R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00198&X§\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0005\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198&X§\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0005\u001a\u0004\b\u001f\u0010\u001cR\u001c\u0010 \u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0005\u001a\u0004\b\"\u0010\u0007R\u001c\u0010#\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\b$\u0010\u0005\u001a\u0004\b%\u0010\u0007R\u001c\u0010&\u001a\u0004\u0018\u00010\u00198&X§\u0004¢\u0006\f\u0012\u0004\b'\u0010\u0005\u001a\u0004\b(\u0010\u001cR\u001c\u0010)\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0005\u001a\u0004\b+\u0010\u0007R\u001c\u0010,\u001a\u0004\u0018\u00010-8&X§\u0004¢\u0006\f\u0012\u0004\b.\u0010\u0005\u001a\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\b2\u0010\u0005\u001a\u0004\b3\u0010\u0007R\u001c\u00104\u001a\u0004\u0018\u0001058&X§\u0004¢\u0006\f\u0012\u0004\b6\u0010\u0005\u001a\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u0001058&X§\u0004¢\u0006\f\u0012\u0004\b:\u0010\u0005\u001a\u0004\b;\u00108R\u001c\u0010<\u001a\u0004\u0018\u0001058&X§\u0004¢\u0006\f\u0012\u0004\b=\u0010\u0005\u001a\u0004\b>\u00108R\u001c\u0010?\u001a\u0004\u0018\u0001058&X§\u0004¢\u0006\f\u0012\u0004\b@\u0010\u0005\u001a\u0004\bA\u00108R\u001c\u0010B\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\bC\u0010\u0005\u001a\u0004\bD\u0010\u0007R\u001c\u0010E\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\bF\u0010\u0005\u001a\u0004\bG\u0010\u0007R\u001c\u0010H\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\bI\u0010\u0005\u001a\u0004\bJ\u0010\u0007R\u001c\u0010K\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\bL\u0010\u0005\u001a\u0004\bM\u0010\u0007R\u001c\u0010N\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\bO\u0010\u0005\u001a\u0004\bP\u0010\u0007R\u001c\u0010Q\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\bR\u0010\u0005\u001a\u0004\bS\u0010\u0007R\u001c\u0010T\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\bU\u0010\u0005\u001a\u0004\bV\u0010\u0007R\u001c\u0010W\u001a\u0004\u0018\u00010\t8&X§\u0004¢\u0006\f\u0012\u0004\bX\u0010\u0005\u001a\u0004\bY\u0010\fR\u001c\u0010Z\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\b[\u0010\u0005\u001a\u0004\b\\\u0010\u0007R\u001c\u0010]\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\b^\u0010\u0005\u001a\u0004\b_\u0010\u0007R\u001c\u0010`\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\ba\u0010\u0005\u001a\u0004\bb\u0010\u0007R\u001c\u0010c\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\bd\u0010\u0005\u001a\u0004\be\u0010\u0007R\u001c\u0010f\u001a\u0004\u0018\u00010\t8&X§\u0004¢\u0006\f\u0012\u0004\bg\u0010\u0005\u001a\u0004\bh\u0010\fR\u001c\u0010i\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\bj\u0010\u0005\u001a\u0004\bk\u0010\u0007R\u001c\u0010l\u001a\u0004\u0018\u00010-8&X§\u0004¢\u0006\f\u0012\u0004\bm\u0010\u0005\u001a\u0004\bn\u00100R\u001c\u0010o\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\bp\u0010\u0005\u001a\u0004\bq\u0010\u0007R\u001c\u0010r\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\bs\u0010\u0005\u001a\u0004\bt\u0010\u0007R\u001c\u0010u\u001a\u0004\u0018\u00010\u00198&X§\u0004¢\u0006\f\u0012\u0004\bv\u0010\u0005\u001a\u0004\bw\u0010\u001cR\u001c\u0010x\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\by\u0010\u0005\u001a\u0004\bz\u0010\u0007R\u001c\u0010{\u001a\u0004\u0018\u00010\u00198&X§\u0004¢\u0006\f\u0012\u0004\b|\u0010\u0005\u001a\u0004\b}\u0010\u001cR\u001d\u0010~\u001a\u0004\u0018\u0001058&X§\u0004¢\u0006\r\u0012\u0004\b\u0010\u0005\u001a\u0005\b\u0001\u00108R\u001f\u0010\u0001\u001a\u0004\u0018\u00010\u00198&X§\u0004¢\u0006\u000e\u0012\u0005\b\u0001\u0010\u0005\u001a\u0005\b\u0001\u0010\u001cR\u001f\u0010\u0001\u001a\u0004\u0018\u00010\u00198&X§\u0004¢\u0006\u000e\u0012\u0005\b\u0001\u0010\u0005\u001a\u0005\b\u0001\u0010\u001cR\u001f\u0010\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\b\u0001\u0010\u0005\u001a\u0005\b\u0001\u0010\u0007R\u001f\u0010\u0001\u001a\u0004\u0018\u0001058&X§\u0004¢\u0006\u000e\u0012\u0005\b\u0001\u0010\u0005\u001a\u0005\b\u0001\u00108R\u001f\u0010\u0001\u001a\u0004\u0018\u0001058&X§\u0004¢\u0006\u000e\u0012\u0005\b\u0001\u0010\u0005\u001a\u0005\b\u0001\u00108R\u001f\u0010\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\b\u0001\u0010\u0005\u001a\u0005\b\u0001\u0010\u0007R'\u0010\u0001\u001a\u000b\u0012\u0004\u0012\u000205\u0018\u00010\u00018&X§\u0004¢\u0006\u000f\u0012\u0005\b\u0001\u0010\u0005\u001a\u0006\b\u0001\u0010\u0001R\u001f\u0010\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\b\u0001\u0010\u0005\u001a\u0005\b\u0001\u0010\u0007R\u001f\u0010\u0001\u001a\u0004\u0018\u00010\t8&X§\u0004¢\u0006\u000e\u0012\u0005\b\u0001\u0010\u0005\u001a\u0005\b\u0001\u0010\fR\u001f\u0010\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\b\u0001\u0010\u0005\u001a\u0005\b \u0001\u0010\u0007R\u001f\u0010¡\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\b¢\u0001\u0010\u0005\u001a\u0005\b£\u0001\u0010\u0007R\u001f\u0010¤\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\b¥\u0001\u0010\u0005\u001a\u0005\b¦\u0001\u0010\u0007R\u001f\u0010§\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\b¨\u0001\u0010\u0005\u001a\u0005\b©\u0001\u0010\u0007R\u001f\u0010ª\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\b«\u0001\u0010\u0005\u001a\u0005\b¬\u0001\u0010\u0007R\u001f\u0010­\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\b®\u0001\u0010\u0005\u001a\u0005\b¯\u0001\u0010\u0007R\u001f\u0010°\u0001\u001a\u0004\u0018\u00010\u00198&X§\u0004¢\u0006\u000e\u0012\u0005\b±\u0001\u0010\u0005\u001a\u0005\b²\u0001\u0010\u001cR\u001f\u0010³\u0001\u001a\u0004\u0018\u0001058&X§\u0004¢\u0006\u000e\u0012\u0005\b´\u0001\u0010\u0005\u001a\u0005\bµ\u0001\u00108R\u001f\u0010¶\u0001\u001a\u0004\u0018\u00010-8&X§\u0004¢\u0006\u000e\u0012\u0005\b·\u0001\u0010\u0005\u001a\u0005\b¸\u0001\u00100R\u001f\u0010¹\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\bº\u0001\u0010\u0005\u001a\u0005\b»\u0001\u0010\u0007R\u001f\u0010¼\u0001\u001a\u0004\u0018\u00010\t8&X§\u0004¢\u0006\u000e\u0012\u0005\b½\u0001\u0010\u0005\u001a\u0005\b¾\u0001\u0010\fR\u001f\u0010¿\u0001\u001a\u0004\u0018\u0001058&X§\u0004¢\u0006\u000e\u0012\u0005\bÀ\u0001\u0010\u0005\u001a\u0005\bÁ\u0001\u00108R\u001f\u0010Â\u0001\u001a\u0004\u0018\u00010\u00118&X§\u0004¢\u0006\u000e\u0012\u0005\bÃ\u0001\u0010\u0005\u001a\u0005\bÄ\u0001\u0010\u0014R\u001f\u0010Å\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\bÆ\u0001\u0010\u0005\u001a\u0005\bÇ\u0001\u0010\u0007R\u001f\u0010È\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\bÉ\u0001\u0010\u0005\u001a\u0005\bÊ\u0001\u0010\u0007R\u001f\u0010Ë\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\bÌ\u0001\u0010\u0005\u001a\u0005\bÍ\u0001\u0010\u0007R\u001f\u0010Î\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\bÏ\u0001\u0010\u0005\u001a\u0005\bÐ\u0001\u0010\u0007R\u001f\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\bÒ\u0001\u0010\u0005\u001a\u0005\bÓ\u0001\u0010\u0007R\u001f\u0010Ô\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\bÕ\u0001\u0010\u0005\u001a\u0005\bÖ\u0001\u0010\u0007R!\u0010×\u0001\u001a\u0005\u0018\u00010Ø\u00018&X§\u0004¢\u0006\u000f\u0012\u0005\bÙ\u0001\u0010\u0005\u001a\u0006\bÚ\u0001\u0010Û\u0001R\u001f\u0010Ü\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\bÝ\u0001\u0010\u0005\u001a\u0005\bÞ\u0001\u0010\u0007R\u001f\u0010ß\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\bà\u0001\u0010\u0005\u001a\u0005\bá\u0001\u0010\u0007R\u001f\u0010â\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\bã\u0001\u0010\u0005\u001a\u0005\bä\u0001\u0010\u0007R\u001f\u0010å\u0001\u001a\u0004\u0018\u0001058&X§\u0004¢\u0006\u000e\u0012\u0005\bæ\u0001\u0010\u0005\u001a\u0005\bç\u0001\u00108R\u001f\u0010è\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\bé\u0001\u0010\u0005\u001a\u0005\bê\u0001\u0010\u0007R\u001f\u0010ë\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\bì\u0001\u0010\u0005\u001a\u0005\bí\u0001\u0010\u0007R\u001f\u0010î\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\bï\u0001\u0010\u0005\u001a\u0005\bð\u0001\u0010\u0007R\u001f\u0010ñ\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\bò\u0001\u0010\u0005\u001a\u0005\bó\u0001\u0010\u0007R\u001f\u0010ô\u0001\u001a\u0004\u0018\u0001058&X§\u0004¢\u0006\u000e\u0012\u0005\bõ\u0001\u0010\u0005\u001a\u0005\bö\u0001\u00108R\u001f\u0010÷\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\bø\u0001\u0010\u0005\u001a\u0005\bù\u0001\u0010\u0007R\u001f\u0010ú\u0001\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\u000e\u0012\u0005\bû\u0001\u0010\u0005\u001a\u0005\bü\u0001\u0010\u0007R!\u0010ý\u0001\u001a\u0005\u0018\u00010þ\u00018&X§\u0004¢\u0006\u000f\u0012\u0005\bÿ\u0001\u0010\u0005\u001a\u0006\b\u0002\u0010\u0002R\u001f\u0010\u0002\u001a\u0004\u0018\u00010-8&X§\u0004¢\u0006\u000e\u0012\u0005\b\u0002\u0010\u0005\u001a\u0005\b\u0002\u00100R\u001f\u0010\u0002\u001a\u0004\u0018\u00010-8&X§\u0004¢\u0006\u000e\u0012\u0005\b\u0002\u0010\u0005\u001a\u0005\b\u0002\u00100¨\u0006\u0002"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBlock;", "", "adserverPosition", "", "getAdserverPosition$annotations", "()V", "getAdserverPosition", "()Ljava/lang/String;", "adserverStatus", "", "getAdserverStatus$annotations", "getAdserverStatus", "()Ljava/lang/Boolean;", "advertisingEnabled", "getAdvertisingEnabled$annotations", "getAdvertisingEnabled", "allSources", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffT9CatalogStoreDto;", "getAllSources$annotations", "getAllSources", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffT9CatalogStoreDto;", "backgroundColor", "getBackgroundColor$annotations", "getBackgroundColor", "backgroundImage", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "getBackgroundImage$annotations", "getBackgroundImage", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "backgroundMobileImage", "getBackgroundMobileImage$annotations", "getBackgroundMobileImage", "bgColor", "getBgColor$annotations", "getBgColor", "blockPosition", "getBlockPosition$annotations", "getBlockPosition", "brandLogo", "getBrandLogo$annotations", "getBrandLogo", "code", "getCode$annotations", "getCode", "contentId", "", "getContentId$annotations", "getContentId", "()Ljava/lang/Integer;", "countdown", "getCountdown$annotations", "getCountdown", "cta", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;", "getCta$annotations", "getCta", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;", "cta1", "getCta1$annotations", "getCta1", "cta2", "getCta2$annotations", "getCta2", "ctaLeft", "getCtaLeft$annotations", "getCtaLeft", "deeplink", "getDeeplink$annotations", "getDeeplink", "description", "getDescription$annotations", "getDescription", "design", "getDesign$annotations", "getDesign", "discount", "getDiscount$annotations", "getDiscount", "discountDesign", "getDiscountDesign$annotations", "getDiscountDesign", "discountPrefix", "getDiscountPrefix$annotations", "getDiscountPrefix", "discountSuffix", "getDiscountSuffix$annotations", "getDiscountSuffix", "displayFilters", "getDisplayFilters$annotations", "getDisplayFilters", "displayMode", "getDisplayMode$annotations", "getDisplayMode", "ean", "getEan$annotations", "getEan", "esQueryId", "getEsQueryId$annotations", "getEsQueryId", "flag", "getFlag$annotations", "getFlag", "forceDisplayProducts", "getForceDisplayProducts$annotations", "getForceDisplayProducts", "format", "getFormat$annotations", "getFormat", "height", "getHeight$annotations", "getHeight", "id", "getId$annotations", "getId", "idDdm", "getIdDdm$annotations", "getIdDdm", "image", "getImage$annotations", "getImage", "imageFormat", "getImageFormat$annotations", "getImageFormat", "imageLarge", "getImageLarge$annotations", "getImageLarge", "imageLink", "getImageLink$annotations", "getImageLink", "imageMobile", "getImageMobile$annotations", "getImageMobile", "imageTop", "getImageTop$annotations", "getImageTop", "legalMentions", "getLegalMentions$annotations", "getLegalMentions", "link", "getLink$annotations", "getLink", "linkSecondary", "getLinkSecondary$annotations", "getLinkSecondary", "linkType", "getLinkType$annotations", "getLinkType", "links", "", "getLinks$annotations", "getLinks", "()Ljava/util/List;", "logoType", "getLogoType$annotations", "getLogoType", "loyaltyCardLoginEnabled", "getLoyaltyCardLoginEnabled$annotations", "getLoyaltyCardLoginEnabled", "moreInformation", "getMoreInformation$annotations", "getMoreInformation", "offer", "getOffer$annotations", "getOffer", "offerColor", "getOfferColor$annotations", "getOfferColor", "offerPrefix", "getOfferPrefix$annotations", "getOfferPrefix", "offerSuffix", "getOfferSuffix$annotations", "getOfferSuffix", "phoneNumber", "getPhoneNumber$annotations", "getPhoneNumber", "picto", "getPicto$annotations", "getPicto", "pictoLink", "getPictoLink$annotations", "getPictoLink", "productAmount", "getProductAmount$annotations", "getProductAmount", "queryId", "getQueryId$annotations", "getQueryId", "recoEnabled", "getRecoEnabled$annotations", "getRecoEnabled", "shopUrl", "getShopUrl$annotations", "getShopUrl", "sources", "getSources$annotations", "getSources", "subheadTitle", "getSubheadTitle$annotations", "getSubheadTitle", "subheader", "getSubheader$annotations", "getSubheader", "subtitleLeft", "getSubtitleLeft$annotations", "getSubtitleLeft", "subtitleRight", "getSubtitleRight$annotations", "getSubtitleRight", "templateId", "getTemplateId$annotations", "getTemplateId", "textColor", "getTextColor$annotations", "getTextColor", "timetable", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTimeTableDto;", "getTimetable$annotations", "getTimetable", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTimeTableDto;", "title", "getTitle$annotations", "getTitle", "titleAlign", "getTitleAlign$annotations", "getTitleAlign", "titleColor", "getTitleColor$annotations", "getTitleColor", "titleLink", "getTitleLink$annotations", "getTitleLink", "titleMobile", "getTitleMobile$annotations", "getTitleMobile", "titleSize", "getTitleSize$annotations", "getTitleSize", "titleWeight", "getTitleWeight$annotations", "getTitleWeight", "url", "getUrl$annotations", "getUrl", "urlContextualized", "getUrlContextualized$annotations", "getUrlContextualized", "validityDates", "getValidityDates$annotations", "getValidityDates", "variant", "getVariant$annotations", "getVariant", "video", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDto;", "getVideo$annotations", "getVideo", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDto;", "weight", "getWeight$annotations", "getWeight", "width", "getWidth$annotations", "getWidth", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public interface BffBlock {

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class DefaultImpls {
        @C12438n("adserver_position")
        public static /* synthetic */ void getAdserverPosition$annotations() {
        }

        @C12438n("adserver_status")
        public static /* synthetic */ void getAdserverStatus$annotations() {
        }

        @C12438n("advertising_enabled")
        public static /* synthetic */ void getAdvertisingEnabled$annotations() {
        }

        @C12438n("all_sources")
        public static /* synthetic */ void getAllSources$annotations() {
        }

        @C12438n("background_color")
        public static /* synthetic */ void getBackgroundColor$annotations() {
        }

        @C12438n("background_image")
        public static /* synthetic */ void getBackgroundImage$annotations() {
        }

        @C12438n("background_mobile_image")
        public static /* synthetic */ void getBackgroundMobileImage$annotations() {
        }

        @C12438n("bg_color")
        public static /* synthetic */ void getBgColor$annotations() {
        }

        @C12438n("block_position")
        public static /* synthetic */ void getBlockPosition$annotations() {
        }

        @C12438n("brand_logo")
        public static /* synthetic */ void getBrandLogo$annotations() {
        }

        @C12438n("code")
        public static /* synthetic */ void getCode$annotations() {
        }

        @C12438n("content_id")
        public static /* synthetic */ void getContentId$annotations() {
        }

        @C12438n("countdown")
        public static /* synthetic */ void getCountdown$annotations() {
        }

        @C12438n("cta")
        public static /* synthetic */ void getCta$annotations() {
        }

        @C12438n("cta1")
        public static /* synthetic */ void getCta1$annotations() {
        }

        @C12438n("cta2")
        public static /* synthetic */ void getCta2$annotations() {
        }

        @C12438n("cta_left")
        public static /* synthetic */ void getCtaLeft$annotations() {
        }

        @C12438n("deeplink")
        public static /* synthetic */ void getDeeplink$annotations() {
        }

        @C12438n("description")
        public static /* synthetic */ void getDescription$annotations() {
        }

        @C12438n("design")
        public static /* synthetic */ void getDesign$annotations() {
        }

        @C12438n("discount")
        public static /* synthetic */ void getDiscount$annotations() {
        }

        @C12438n("discount_design")
        public static /* synthetic */ void getDiscountDesign$annotations() {
        }

        @C12438n("discount_prefix")
        public static /* synthetic */ void getDiscountPrefix$annotations() {
        }

        @C12438n("discount_suffix")
        public static /* synthetic */ void getDiscountSuffix$annotations() {
        }

        @C12438n("display_filters")
        public static /* synthetic */ void getDisplayFilters$annotations() {
        }

        @C12438n("display_mode")
        public static /* synthetic */ void getDisplayMode$annotations() {
        }

        @C12438n("ean")
        public static /* synthetic */ void getEan$annotations() {
        }

        @C12438n("es_query_id")
        public static /* synthetic */ void getEsQueryId$annotations() {
        }

        @C12438n("flag")
        public static /* synthetic */ void getFlag$annotations() {
        }

        @C12438n("force_display_products")
        public static /* synthetic */ void getForceDisplayProducts$annotations() {
        }

        @C12438n("format")
        public static /* synthetic */ void getFormat$annotations() {
        }

        @C12438n("height")
        public static /* synthetic */ void getHeight$annotations() {
        }

        @C12438n("id")
        public static /* synthetic */ void getId$annotations() {
        }

        @C12438n("id_ddm")
        public static /* synthetic */ void getIdDdm$annotations() {
        }

        @C12438n("image")
        public static /* synthetic */ void getImage$annotations() {
        }

        @C12438n("image_format")
        public static /* synthetic */ void getImageFormat$annotations() {
        }

        @C12438n("image_large")
        public static /* synthetic */ void getImageLarge$annotations() {
        }

        @C12438n("image_link")
        public static /* synthetic */ void getImageLink$annotations() {
        }

        @C12438n("image_mobile")
        public static /* synthetic */ void getImageMobile$annotations() {
        }

        @C12438n("image_top")
        public static /* synthetic */ void getImageTop$annotations() {
        }

        @C12438n("legal_mentions")
        public static /* synthetic */ void getLegalMentions$annotations() {
        }

        @C12438n("link")
        public static /* synthetic */ void getLink$annotations() {
        }

        @C12438n("link_secondary")
        public static /* synthetic */ void getLinkSecondary$annotations() {
        }

        @C12438n("link_type")
        public static /* synthetic */ void getLinkType$annotations() {
        }

        @C12438n("links")
        public static /* synthetic */ void getLinks$annotations() {
        }

        @C12438n("logo_type")
        public static /* synthetic */ void getLogoType$annotations() {
        }

        @C12438n("loyalty_card_login_enabled")
        public static /* synthetic */ void getLoyaltyCardLoginEnabled$annotations() {
        }

        @C12438n("more_information")
        public static /* synthetic */ void getMoreInformation$annotations() {
        }

        @C12438n("offer")
        public static /* synthetic */ void getOffer$annotations() {
        }

        @C12438n("offer_color")
        public static /* synthetic */ void getOfferColor$annotations() {
        }

        @C12438n("offer_prefix")
        public static /* synthetic */ void getOfferPrefix$annotations() {
        }

        @C12438n("offer_suffix")
        public static /* synthetic */ void getOfferSuffix$annotations() {
        }

        @C12438n("phone_number")
        public static /* synthetic */ void getPhoneNumber$annotations() {
        }

        @C12438n("picto")
        public static /* synthetic */ void getPicto$annotations() {
        }

        @C12438n("picto_link")
        public static /* synthetic */ void getPictoLink$annotations() {
        }

        @C12438n("product_amount")
        public static /* synthetic */ void getProductAmount$annotations() {
        }

        @C12438n("query_id")
        public static /* synthetic */ void getQueryId$annotations() {
        }

        @C12438n("reco_enabled")
        public static /* synthetic */ void getRecoEnabled$annotations() {
        }

        @C12438n("shop_url")
        public static /* synthetic */ void getShopUrl$annotations() {
        }

        @C12438n("sources")
        public static /* synthetic */ void getSources$annotations() {
        }

        @C12438n("subhead_title")
        public static /* synthetic */ void getSubheadTitle$annotations() {
        }

        @C12438n("subheader")
        public static /* synthetic */ void getSubheader$annotations() {
        }

        @C12438n("subtitle_left")
        public static /* synthetic */ void getSubtitleLeft$annotations() {
        }

        @C12438n("subtitle_right")
        public static /* synthetic */ void getSubtitleRight$annotations() {
        }

        @C12438n("template_id")
        public static /* synthetic */ void getTemplateId$annotations() {
        }

        @C12438n("text_color")
        public static /* synthetic */ void getTextColor$annotations() {
        }

        @C12438n("timetable")
        public static /* synthetic */ void getTimetable$annotations() {
        }

        @C12438n("title")
        public static /* synthetic */ void getTitle$annotations() {
        }

        @C12438n("title_align")
        public static /* synthetic */ void getTitleAlign$annotations() {
        }

        @C12438n("title_color")
        public static /* synthetic */ void getTitleColor$annotations() {
        }

        @C12438n("title_link")
        public static /* synthetic */ void getTitleLink$annotations() {
        }

        @C12438n("title_mobile")
        public static /* synthetic */ void getTitleMobile$annotations() {
        }

        @C12438n("title_size")
        public static /* synthetic */ void getTitleSize$annotations() {
        }

        @C12438n("title_weight")
        public static /* synthetic */ void getTitleWeight$annotations() {
        }

        @C12438n("url")
        public static /* synthetic */ void getUrl$annotations() {
        }

        @C12438n("url_contextualized")
        public static /* synthetic */ void getUrlContextualized$annotations() {
        }

        @C12438n("validity_dates")
        public static /* synthetic */ void getValidityDates$annotations() {
        }

        @C12438n("variant")
        public static /* synthetic */ void getVariant$annotations() {
        }

        @C12438n("video")
        public static /* synthetic */ void getVideo$annotations() {
        }

        @C12438n("weight")
        public static /* synthetic */ void getWeight$annotations() {
        }

        @C12438n("width")
        public static /* synthetic */ void getWidth$annotations() {
        }
    }

    @C12580l
    String getAdserverPosition();

    @C12580l
    Boolean getAdserverStatus();

    @C12580l
    Boolean getAdvertisingEnabled();

    @C12580l
    BffT9CatalogStoreDto getAllSources();

    @C12580l
    String getBackgroundColor();

    @C12580l
    BffImageDto getBackgroundImage();

    @C12580l
    BffImageDto getBackgroundMobileImage();

    @C12580l
    String getBgColor();

    @C12580l
    String getBlockPosition();

    @C12580l
    BffImageDto getBrandLogo();

    @C12580l
    String getCode();

    @C12580l
    Integer getContentId();

    @C12580l
    String getCountdown();

    @C12580l
    BffUrlDto getCta();

    @C12580l
    BffUrlDto getCta1();

    @C12580l
    BffUrlDto getCta2();

    @C12580l
    BffUrlDto getCtaLeft();

    @C12580l
    String getDeeplink();

    @C12580l
    String getDescription();

    @C12580l
    String getDesign();

    @C12580l
    String getDiscount();

    @C12580l
    String getDiscountDesign();

    @C12580l
    String getDiscountPrefix();

    @C12580l
    String getDiscountSuffix();

    @C12580l
    Boolean getDisplayFilters();

    @C12580l
    String getDisplayMode();

    @C12580l
    String getEan();

    @C12580l
    String getEsQueryId();

    @C12580l
    String getFlag();

    @C12580l
    Boolean getForceDisplayProducts();

    @C12580l
    String getFormat();

    @C12580l
    Integer getHeight();

    @C12580l
    String getId();

    @C12580l
    String getIdDdm();

    @C12580l
    BffImageDto getImage();

    @C12580l
    String getImageFormat();

    @C12580l
    BffImageDto getImageLarge();

    @C12580l
    BffUrlDto getImageLink();

    @C12580l
    BffImageDto getImageMobile();

    @C12580l
    BffImageDto getImageTop();

    @C12580l
    String getLegalMentions();

    @C12580l
    BffUrlDto getLink();

    @C12580l
    BffUrlDto getLinkSecondary();

    @C12580l
    String getLinkType();

    @C12580l
    List<BffUrlDto> getLinks();

    @C12580l
    String getLogoType();

    @C12580l
    Boolean getLoyaltyCardLoginEnabled();

    @C12580l
    String getMoreInformation();

    @C12580l
    String getOffer();

    @C12580l
    String getOfferColor();

    @C12580l
    String getOfferPrefix();

    @C12580l
    String getOfferSuffix();

    @C12580l
    String getPhoneNumber();

    @C12580l
    BffImageDto getPicto();

    @C12580l
    BffUrlDto getPictoLink();

    @C12580l
    Integer getProductAmount();

    @C12580l
    String getQueryId();

    @C12580l
    Boolean getRecoEnabled();

    @C12580l
    BffUrlDto getShopUrl();

    @C12580l
    BffT9CatalogStoreDto getSources();

    @C12580l
    String getSubheadTitle();

    @C12580l
    String getSubheader();

    @C12580l
    String getSubtitleLeft();

    @C12580l
    String getSubtitleRight();

    @C12580l
    String getTemplateId();

    @C12580l
    String getTextColor();

    @C12580l
    BffTimeTableDto getTimetable();

    @C12580l
    String getTitle();

    @C12580l
    String getTitleAlign();

    @C12580l
    String getTitleColor();

    @C12580l
    BffUrlDto getTitleLink();

    @C12580l
    String getTitleMobile();

    @C12580l
    String getTitleSize();

    @C12580l
    String getTitleWeight();

    @C12580l
    String getUrl();

    @C12580l
    BffUrlDto getUrlContextualized();

    @C12580l
    String getValidityDates();

    @C12580l
    String getVariant();

    @C12580l
    BffVideoDto getVideo();

    @C12580l
    Integer getWeight();

    @C12580l
    Integer getWidth();
}
