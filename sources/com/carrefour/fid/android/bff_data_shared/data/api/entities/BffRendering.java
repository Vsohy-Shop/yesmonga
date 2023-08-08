package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.compose.runtime.C8698y1;
import com.urbanairship.util.C9647e0;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.C12027x;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b>\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\bC\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 \u00012\u00020\u0001:\u0004\u0001\u0001Bñ\u0002\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\t¢\u0006\u0006\b\u0001\u0010\u0001B\u0003\b\u0017\u0012\u0007\u0010\u0001\u001a\u00020H\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00105\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00106\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00107\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00109\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010<\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010=\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010>\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010?\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010@\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010A\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010B\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010C\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010D\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010E\u001a\u0004\u0018\u00010\t\u0012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003Jñ\u0002\u0010F\u001a\u00020\u00002\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010G\u001a\u00020\tHÖ\u0001J\t\u0010I\u001a\u00020HHÖ\u0001J\u0013\u0010L\u001a\u00020K2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010(\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010M\u0012\u0004\bP\u0010Q\u001a\u0004\bN\u0010OR\"\u0010)\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010M\u0012\u0004\bS\u0010Q\u001a\u0004\bR\u0010OR\"\u0010*\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010M\u0012\u0004\bU\u0010Q\u001a\u0004\bT\u0010OR\"\u0010+\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010M\u0012\u0004\bW\u0010Q\u001a\u0004\bV\u0010OR\"\u0010,\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010M\u0012\u0004\bY\u0010Q\u001a\u0004\bX\u0010OR\"\u0010-\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010M\u0012\u0004\b[\u0010Q\u001a\u0004\bZ\u0010OR\"\u0010.\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010M\u0012\u0004\b]\u0010Q\u001a\u0004\b\\\u0010OR\"\u0010/\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010M\u0012\u0004\b_\u0010Q\u001a\u0004\b^\u0010OR\"\u00100\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010M\u0012\u0004\ba\u0010Q\u001a\u0004\b`\u0010OR\"\u00101\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010M\u0012\u0004\bc\u0010Q\u001a\u0004\bb\u0010OR\"\u00102\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010M\u0012\u0004\be\u0010Q\u001a\u0004\bd\u0010OR\"\u00103\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010M\u0012\u0004\bg\u0010Q\u001a\u0004\bf\u0010OR\"\u00104\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u0010M\u0012\u0004\bi\u0010Q\u001a\u0004\bh\u0010OR\"\u00105\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010M\u0012\u0004\bk\u0010Q\u001a\u0004\bj\u0010OR\"\u00106\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u0010M\u0012\u0004\bm\u0010Q\u001a\u0004\bl\u0010OR\"\u00107\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u0010M\u0012\u0004\bo\u0010Q\u001a\u0004\bn\u0010OR\"\u00108\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u0010M\u0012\u0004\bq\u0010Q\u001a\u0004\bp\u0010OR\"\u00109\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u0010M\u0012\u0004\bs\u0010Q\u001a\u0004\br\u0010OR\"\u0010:\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u0010M\u0012\u0004\bu\u0010Q\u001a\u0004\bt\u0010OR\"\u0010;\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b;\u0010M\u0012\u0004\bw\u0010Q\u001a\u0004\bv\u0010OR\"\u0010<\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010M\u0012\u0004\by\u0010Q\u001a\u0004\bx\u0010OR\"\u0010=\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b=\u0010M\u0012\u0004\b{\u0010Q\u001a\u0004\bz\u0010OR\"\u0010>\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b>\u0010M\u0012\u0004\b}\u0010Q\u001a\u0004\b|\u0010OR\"\u0010?\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b?\u0010M\u0012\u0004\b\u0010Q\u001a\u0004\b~\u0010OR$\u0010@\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\b@\u0010M\u0012\u0005\b\u0001\u0010Q\u001a\u0005\b\u0001\u0010OR$\u0010A\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bA\u0010M\u0012\u0005\b\u0001\u0010Q\u001a\u0005\b\u0001\u0010OR$\u0010B\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bB\u0010M\u0012\u0005\b\u0001\u0010Q\u001a\u0005\b\u0001\u0010OR$\u0010C\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bC\u0010M\u0012\u0005\b\u0001\u0010Q\u001a\u0005\b\u0001\u0010OR$\u0010D\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bD\u0010M\u0012\u0005\b\u0001\u0010Q\u001a\u0005\b\u0001\u0010OR$\u0010E\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bE\u0010M\u0012\u0005\b\u0001\u0010Q\u001a\u0005\b\u0001\u0010O¨\u0006\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffRendering;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "headerText", "redirectUrl", "button1Text", "optionalButton2Text", "optionalButton3Text", "optionalButton4Text", "optionalButton5Text", "borderColor", "backgroundColor", "buttonColor", "selectedButtonColor", "buttonTextColor", "selectedButtonTextColor", "optionalFooterType", "optionalFooterText", "optionalFooterTextColor", "optionalFooterBackgroundColor", "optionalFooterRedirectUrl", "optionalFooterRedirectUrlApp", "optionalFooterRedirectTarget", "optionalFooterMediaFile", "mobileLogoImage", "bffBackgroundImage", "backgroundImage", "mobileBackgroundImage", "desktopBackgroundImage", "optionalDesktopMultibackgroundImage2", "optionalDesktopMultibackgroundImage3", "optionalDesktopMultibackgroundImage4", "optionalDesktopMultibackgroundImage5", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getHeaderText", "()Ljava/lang/String;", "getHeaderText$annotations", "()V", "getRedirectUrl", "getRedirectUrl$annotations", "getButton1Text", "getButton1Text$annotations", "getOptionalButton2Text", "getOptionalButton2Text$annotations", "getOptionalButton3Text", "getOptionalButton3Text$annotations", "getOptionalButton4Text", "getOptionalButton4Text$annotations", "getOptionalButton5Text", "getOptionalButton5Text$annotations", "getBorderColor", "getBorderColor$annotations", "getBackgroundColor", "getBackgroundColor$annotations", "getButtonColor", "getButtonColor$annotations", "getSelectedButtonColor", "getSelectedButtonColor$annotations", "getButtonTextColor", "getButtonTextColor$annotations", "getSelectedButtonTextColor", "getSelectedButtonTextColor$annotations", "getOptionalFooterType", "getOptionalFooterType$annotations", "getOptionalFooterText", "getOptionalFooterText$annotations", "getOptionalFooterTextColor", "getOptionalFooterTextColor$annotations", "getOptionalFooterBackgroundColor", "getOptionalFooterBackgroundColor$annotations", "getOptionalFooterRedirectUrl", "getOptionalFooterRedirectUrl$annotations", "getOptionalFooterRedirectUrlApp", "getOptionalFooterRedirectUrlApp$annotations", "getOptionalFooterRedirectTarget", "getOptionalFooterRedirectTarget$annotations", "getOptionalFooterMediaFile", "getOptionalFooterMediaFile$annotations", "getMobileLogoImage", "getMobileLogoImage$annotations", "getBffBackgroundImage", "getBffBackgroundImage$annotations", "getBackgroundImage", "getBackgroundImage$annotations", "getMobileBackgroundImage", "getMobileBackgroundImage$annotations", "getDesktopBackgroundImage", "getDesktopBackgroundImage$annotations", "getOptionalDesktopMultibackgroundImage2", "getOptionalDesktopMultibackgroundImage2$annotations", "getOptionalDesktopMultibackgroundImage3", "getOptionalDesktopMultibackgroundImage3$annotations", "getOptionalDesktopMultibackgroundImage4", "getOptionalDesktopMultibackgroundImage4$annotations", "getOptionalDesktopMultibackgroundImage5", "getOptionalDesktopMultibackgroundImage5$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffRendering {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String backgroundColor;
    @C12580l
    private final String backgroundImage;
    @C12580l
    private final String bffBackgroundImage;
    @C12580l
    private final String borderColor;
    @C12580l
    private final String button1Text;
    @C12580l
    private final String buttonColor;
    @C12580l
    private final String buttonTextColor;
    @C12580l
    private final String desktopBackgroundImage;
    @C12580l
    private final String headerText;
    @C12580l
    private final String mobileBackgroundImage;
    @C12580l
    private final String mobileLogoImage;
    @C12580l
    private final String optionalButton2Text;
    @C12580l
    private final String optionalButton3Text;
    @C12580l
    private final String optionalButton4Text;
    @C12580l
    private final String optionalButton5Text;
    @C12580l
    private final String optionalDesktopMultibackgroundImage2;
    @C12580l
    private final String optionalDesktopMultibackgroundImage3;
    @C12580l
    private final String optionalDesktopMultibackgroundImage4;
    @C12580l
    private final String optionalDesktopMultibackgroundImage5;
    @C12580l
    private final String optionalFooterBackgroundColor;
    @C12580l
    private final String optionalFooterMediaFile;
    @C12580l
    private final String optionalFooterRedirectTarget;
    @C12580l
    private final String optionalFooterRedirectUrl;
    @C12580l
    private final String optionalFooterRedirectUrlApp;
    @C12580l
    private final String optionalFooterText;
    @C12580l
    private final String optionalFooterTextColor;
    @C12580l
    private final String optionalFooterType;
    @C12580l
    private final String redirectUrl;
    @C12580l
    private final String selectedButtonColor;
    @C12580l
    private final String selectedButtonTextColor;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffRendering$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffRendering;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffRendering> serializer() {
            return BffRendering$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffRendering() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (int) C12027x.f29642j, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffRendering copy$default(BffRendering bffRendering, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, int i, Object obj) {
        BffRendering bffRendering2 = bffRendering;
        int i2 = i;
        return bffRendering.copy((i2 & 1) != 0 ? bffRendering2.headerText : str, (i2 & 2) != 0 ? bffRendering2.redirectUrl : str2, (i2 & 4) != 0 ? bffRendering2.button1Text : str3, (i2 & 8) != 0 ? bffRendering2.optionalButton2Text : str4, (i2 & 16) != 0 ? bffRendering2.optionalButton3Text : str5, (i2 & 32) != 0 ? bffRendering2.optionalButton4Text : str6, (i2 & 64) != 0 ? bffRendering2.optionalButton5Text : str7, (i2 & 128) != 0 ? bffRendering2.borderColor : str8, (i2 & 256) != 0 ? bffRendering2.backgroundColor : str9, (i2 & 512) != 0 ? bffRendering2.buttonColor : str10, (i2 & 1024) != 0 ? bffRendering2.selectedButtonColor : str11, (i2 & 2048) != 0 ? bffRendering2.buttonTextColor : str12, (i2 & 4096) != 0 ? bffRendering2.selectedButtonTextColor : str13, (i2 & 8192) != 0 ? bffRendering2.optionalFooterType : str14, (i2 & 16384) != 0 ? bffRendering2.optionalFooterText : str15, (i2 & 32768) != 0 ? bffRendering2.optionalFooterTextColor : str16, (i2 & 65536) != 0 ? bffRendering2.optionalFooterBackgroundColor : str17, (i2 & 131072) != 0 ? bffRendering2.optionalFooterRedirectUrl : str18, (i2 & 262144) != 0 ? bffRendering2.optionalFooterRedirectUrlApp : str19, (i2 & 524288) != 0 ? bffRendering2.optionalFooterRedirectTarget : str20, (i2 & 1048576) != 0 ? bffRendering2.optionalFooterMediaFile : str21, (i2 & 2097152) != 0 ? bffRendering2.mobileLogoImage : str22, (i2 & 4194304) != 0 ? bffRendering2.bffBackgroundImage : str23, (i2 & 8388608) != 0 ? bffRendering2.backgroundImage : str24, (i2 & 16777216) != 0 ? bffRendering2.mobileBackgroundImage : str25, (i2 & C9647e0.f26435a) != 0 ? bffRendering2.desktopBackgroundImage : str26, (i2 & C8698y1.f23302n) != 0 ? bffRendering2.optionalDesktopMultibackgroundImage2 : str27, (i2 & C8698y1.f23301m) != 0 ? bffRendering2.optionalDesktopMultibackgroundImage3 : str28, (i2 & 268435456) != 0 ? bffRendering2.optionalDesktopMultibackgroundImage4 : str29, (i2 & 536870912) != 0 ? bffRendering2.optionalDesktopMultibackgroundImage5 : str30);
    }

    @C12438n("background_color")
    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    @C12438n("background_image")
    public static /* synthetic */ void getBackgroundImage$annotations() {
    }

    @C12438n("bff_background_image")
    public static /* synthetic */ void getBffBackgroundImage$annotations() {
    }

    @C12438n("border_color")
    public static /* synthetic */ void getBorderColor$annotations() {
    }

    @C12438n("button_1_text")
    public static /* synthetic */ void getButton1Text$annotations() {
    }

    @C12438n("button_color")
    public static /* synthetic */ void getButtonColor$annotations() {
    }

    @C12438n("button_text_color")
    public static /* synthetic */ void getButtonTextColor$annotations() {
    }

    @C12438n("desktop_background_image")
    public static /* synthetic */ void getDesktopBackgroundImage$annotations() {
    }

    @C12438n("header_text")
    public static /* synthetic */ void getHeaderText$annotations() {
    }

    @C12438n("mobile_background_image")
    public static /* synthetic */ void getMobileBackgroundImage$annotations() {
    }

    @C12438n("mobile_logo_image")
    public static /* synthetic */ void getMobileLogoImage$annotations() {
    }

    @C12438n("optional_button_2_text")
    public static /* synthetic */ void getOptionalButton2Text$annotations() {
    }

    @C12438n("optional_button_3_text")
    public static /* synthetic */ void getOptionalButton3Text$annotations() {
    }

    @C12438n("optional_button_4_text")
    public static /* synthetic */ void getOptionalButton4Text$annotations() {
    }

    @C12438n("optional_button_5_text")
    public static /* synthetic */ void getOptionalButton5Text$annotations() {
    }

    @C12438n("optional_desktop_multibackground_image_2")
    public static /* synthetic */ void getOptionalDesktopMultibackgroundImage2$annotations() {
    }

    @C12438n("optional_desktop_multibackground_image_3")
    public static /* synthetic */ void getOptionalDesktopMultibackgroundImage3$annotations() {
    }

    @C12438n("optional_desktop_multibackground_image_4")
    public static /* synthetic */ void getOptionalDesktopMultibackgroundImage4$annotations() {
    }

    @C12438n("optional_desktop_multibackground_image_5")
    public static /* synthetic */ void getOptionalDesktopMultibackgroundImage5$annotations() {
    }

    @C12438n("optional_footer_background_color")
    public static /* synthetic */ void getOptionalFooterBackgroundColor$annotations() {
    }

    @C12438n("optional_footer_media_file")
    public static /* synthetic */ void getOptionalFooterMediaFile$annotations() {
    }

    @C12438n("optional_footer_redirect_target")
    public static /* synthetic */ void getOptionalFooterRedirectTarget$annotations() {
    }

    @C12438n("optional_footer_redirect_url")
    public static /* synthetic */ void getOptionalFooterRedirectUrl$annotations() {
    }

    @C12438n("optional_footer_redirect_url_app")
    public static /* synthetic */ void getOptionalFooterRedirectUrlApp$annotations() {
    }

    @C12438n("optional_footer_text")
    public static /* synthetic */ void getOptionalFooterText$annotations() {
    }

    @C12438n("optional_footer_text_color")
    public static /* synthetic */ void getOptionalFooterTextColor$annotations() {
    }

    @C12438n("optional_footer_type")
    public static /* synthetic */ void getOptionalFooterType$annotations() {
    }

    @C12438n("redirect_url")
    public static /* synthetic */ void getRedirectUrl$annotations() {
    }

    @C12438n("selected_button_color")
    public static /* synthetic */ void getSelectedButtonColor$annotations() {
    }

    @C12438n("selected_button_text_color")
    public static /* synthetic */ void getSelectedButtonTextColor$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffRendering bffRendering, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffRendering.headerText != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffRendering.headerText);
        }
        if (dVar.mo24897A(fVar, 1) || bffRendering.redirectUrl != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffRendering.redirectUrl);
        }
        if (dVar.mo24897A(fVar, 2) || bffRendering.button1Text != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffRendering.button1Text);
        }
        if (dVar.mo24897A(fVar, 3) || bffRendering.optionalButton2Text != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffRendering.optionalButton2Text);
        }
        if (dVar.mo24897A(fVar, 4) || bffRendering.optionalButton3Text != null) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffRendering.optionalButton3Text);
        }
        if (dVar.mo24897A(fVar, 5) || bffRendering.optionalButton4Text != null) {
            dVar.mo24912i(fVar, 5, C12310s1.f30117a, bffRendering.optionalButton4Text);
        }
        if (dVar.mo24897A(fVar, 6) || bffRendering.optionalButton5Text != null) {
            dVar.mo24912i(fVar, 6, C12310s1.f30117a, bffRendering.optionalButton5Text);
        }
        if (dVar.mo24897A(fVar, 7) || bffRendering.borderColor != null) {
            dVar.mo24912i(fVar, 7, C12310s1.f30117a, bffRendering.borderColor);
        }
        if (dVar.mo24897A(fVar, 8) || bffRendering.backgroundColor != null) {
            dVar.mo24912i(fVar, 8, C12310s1.f30117a, bffRendering.backgroundColor);
        }
        if (dVar.mo24897A(fVar, 9) || bffRendering.buttonColor != null) {
            dVar.mo24912i(fVar, 9, C12310s1.f30117a, bffRendering.buttonColor);
        }
        if (dVar.mo24897A(fVar, 10) || bffRendering.selectedButtonColor != null) {
            dVar.mo24912i(fVar, 10, C12310s1.f30117a, bffRendering.selectedButtonColor);
        }
        if (dVar.mo24897A(fVar, 11) || bffRendering.buttonTextColor != null) {
            dVar.mo24912i(fVar, 11, C12310s1.f30117a, bffRendering.buttonTextColor);
        }
        if (dVar.mo24897A(fVar, 12) || bffRendering.selectedButtonTextColor != null) {
            dVar.mo24912i(fVar, 12, C12310s1.f30117a, bffRendering.selectedButtonTextColor);
        }
        if (dVar.mo24897A(fVar, 13) || bffRendering.optionalFooterType != null) {
            dVar.mo24912i(fVar, 13, C12310s1.f30117a, bffRendering.optionalFooterType);
        }
        if (dVar.mo24897A(fVar, 14) || bffRendering.optionalFooterText != null) {
            dVar.mo24912i(fVar, 14, C12310s1.f30117a, bffRendering.optionalFooterText);
        }
        if (dVar.mo24897A(fVar, 15) || bffRendering.optionalFooterTextColor != null) {
            dVar.mo24912i(fVar, 15, C12310s1.f30117a, bffRendering.optionalFooterTextColor);
        }
        if (dVar.mo24897A(fVar, 16) || bffRendering.optionalFooterBackgroundColor != null) {
            dVar.mo24912i(fVar, 16, C12310s1.f30117a, bffRendering.optionalFooterBackgroundColor);
        }
        if (dVar.mo24897A(fVar, 17) || bffRendering.optionalFooterRedirectUrl != null) {
            dVar.mo24912i(fVar, 17, C12310s1.f30117a, bffRendering.optionalFooterRedirectUrl);
        }
        if (dVar.mo24897A(fVar, 18) || bffRendering.optionalFooterRedirectUrlApp != null) {
            dVar.mo24912i(fVar, 18, C12310s1.f30117a, bffRendering.optionalFooterRedirectUrlApp);
        }
        if (dVar.mo24897A(fVar, 19) || bffRendering.optionalFooterRedirectTarget != null) {
            dVar.mo24912i(fVar, 19, C12310s1.f30117a, bffRendering.optionalFooterRedirectTarget);
        }
        if (dVar.mo24897A(fVar, 20) || bffRendering.optionalFooterMediaFile != null) {
            dVar.mo24912i(fVar, 20, C12310s1.f30117a, bffRendering.optionalFooterMediaFile);
        }
        if (dVar.mo24897A(fVar, 21) || bffRendering.mobileLogoImage != null) {
            dVar.mo24912i(fVar, 21, C12310s1.f30117a, bffRendering.mobileLogoImage);
        }
        if (dVar.mo24897A(fVar, 22) || bffRendering.bffBackgroundImage != null) {
            dVar.mo24912i(fVar, 22, C12310s1.f30117a, bffRendering.bffBackgroundImage);
        }
        if (dVar.mo24897A(fVar, 23) || bffRendering.backgroundImage != null) {
            dVar.mo24912i(fVar, 23, C12310s1.f30117a, bffRendering.backgroundImage);
        }
        if (dVar.mo24897A(fVar, 24) || bffRendering.mobileBackgroundImage != null) {
            dVar.mo24912i(fVar, 24, C12310s1.f30117a, bffRendering.mobileBackgroundImage);
        }
        if (dVar.mo24897A(fVar, 25) || bffRendering.desktopBackgroundImage != null) {
            dVar.mo24912i(fVar, 25, C12310s1.f30117a, bffRendering.desktopBackgroundImage);
        }
        if (dVar.mo24897A(fVar, 26) || bffRendering.optionalDesktopMultibackgroundImage2 != null) {
            dVar.mo24912i(fVar, 26, C12310s1.f30117a, bffRendering.optionalDesktopMultibackgroundImage2);
        }
        if (dVar.mo24897A(fVar, 27) || bffRendering.optionalDesktopMultibackgroundImage3 != null) {
            dVar.mo24912i(fVar, 27, C12310s1.f30117a, bffRendering.optionalDesktopMultibackgroundImage3);
        }
        if (dVar.mo24897A(fVar, 28) || bffRendering.optionalDesktopMultibackgroundImage4 != null) {
            dVar.mo24912i(fVar, 28, C12310s1.f30117a, bffRendering.optionalDesktopMultibackgroundImage4);
        }
        if (dVar.mo24897A(fVar, 29) || bffRendering.optionalDesktopMultibackgroundImage5 != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 29, C12310s1.f30117a, bffRendering.optionalDesktopMultibackgroundImage5);
        }
    }

    @C12580l
    public final String component1() {
        return this.headerText;
    }

    @C12580l
    public final String component10() {
        return this.buttonColor;
    }

    @C12580l
    public final String component11() {
        return this.selectedButtonColor;
    }

    @C12580l
    public final String component12() {
        return this.buttonTextColor;
    }

    @C12580l
    public final String component13() {
        return this.selectedButtonTextColor;
    }

    @C12580l
    public final String component14() {
        return this.optionalFooterType;
    }

    @C12580l
    public final String component15() {
        return this.optionalFooterText;
    }

    @C12580l
    public final String component16() {
        return this.optionalFooterTextColor;
    }

    @C12580l
    public final String component17() {
        return this.optionalFooterBackgroundColor;
    }

    @C12580l
    public final String component18() {
        return this.optionalFooterRedirectUrl;
    }

    @C12580l
    public final String component19() {
        return this.optionalFooterRedirectUrlApp;
    }

    @C12580l
    public final String component2() {
        return this.redirectUrl;
    }

    @C12580l
    public final String component20() {
        return this.optionalFooterRedirectTarget;
    }

    @C12580l
    public final String component21() {
        return this.optionalFooterMediaFile;
    }

    @C12580l
    public final String component22() {
        return this.mobileLogoImage;
    }

    @C12580l
    public final String component23() {
        return this.bffBackgroundImage;
    }

    @C12580l
    public final String component24() {
        return this.backgroundImage;
    }

    @C12580l
    public final String component25() {
        return this.mobileBackgroundImage;
    }

    @C12580l
    public final String component26() {
        return this.desktopBackgroundImage;
    }

    @C12580l
    public final String component27() {
        return this.optionalDesktopMultibackgroundImage2;
    }

    @C12580l
    public final String component28() {
        return this.optionalDesktopMultibackgroundImage3;
    }

    @C12580l
    public final String component29() {
        return this.optionalDesktopMultibackgroundImage4;
    }

    @C12580l
    public final String component3() {
        return this.button1Text;
    }

    @C12580l
    public final String component30() {
        return this.optionalDesktopMultibackgroundImage5;
    }

    @C12580l
    public final String component4() {
        return this.optionalButton2Text;
    }

    @C12580l
    public final String component5() {
        return this.optionalButton3Text;
    }

    @C12580l
    public final String component6() {
        return this.optionalButton4Text;
    }

    @C12580l
    public final String component7() {
        return this.optionalButton5Text;
    }

    @C12580l
    public final String component8() {
        return this.borderColor;
    }

    @C12580l
    public final String component9() {
        return this.backgroundColor;
    }

    @C12579k
    public final BffRendering copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l String str16, @C12580l String str17, @C12580l String str18, @C12580l String str19, @C12580l String str20, @C12580l String str21, @C12580l String str22, @C12580l String str23, @C12580l String str24, @C12580l String str25, @C12580l String str26, @C12580l String str27, @C12580l String str28, @C12580l String str29, @C12580l String str30) {
        return new BffRendering(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffRendering)) {
            return false;
        }
        BffRendering bffRendering = (BffRendering) obj;
        return Intrinsics.areEqual((Object) this.headerText, (Object) bffRendering.headerText) && Intrinsics.areEqual((Object) this.redirectUrl, (Object) bffRendering.redirectUrl) && Intrinsics.areEqual((Object) this.button1Text, (Object) bffRendering.button1Text) && Intrinsics.areEqual((Object) this.optionalButton2Text, (Object) bffRendering.optionalButton2Text) && Intrinsics.areEqual((Object) this.optionalButton3Text, (Object) bffRendering.optionalButton3Text) && Intrinsics.areEqual((Object) this.optionalButton4Text, (Object) bffRendering.optionalButton4Text) && Intrinsics.areEqual((Object) this.optionalButton5Text, (Object) bffRendering.optionalButton5Text) && Intrinsics.areEqual((Object) this.borderColor, (Object) bffRendering.borderColor) && Intrinsics.areEqual((Object) this.backgroundColor, (Object) bffRendering.backgroundColor) && Intrinsics.areEqual((Object) this.buttonColor, (Object) bffRendering.buttonColor) && Intrinsics.areEqual((Object) this.selectedButtonColor, (Object) bffRendering.selectedButtonColor) && Intrinsics.areEqual((Object) this.buttonTextColor, (Object) bffRendering.buttonTextColor) && Intrinsics.areEqual((Object) this.selectedButtonTextColor, (Object) bffRendering.selectedButtonTextColor) && Intrinsics.areEqual((Object) this.optionalFooterType, (Object) bffRendering.optionalFooterType) && Intrinsics.areEqual((Object) this.optionalFooterText, (Object) bffRendering.optionalFooterText) && Intrinsics.areEqual((Object) this.optionalFooterTextColor, (Object) bffRendering.optionalFooterTextColor) && Intrinsics.areEqual((Object) this.optionalFooterBackgroundColor, (Object) bffRendering.optionalFooterBackgroundColor) && Intrinsics.areEqual((Object) this.optionalFooterRedirectUrl, (Object) bffRendering.optionalFooterRedirectUrl) && Intrinsics.areEqual((Object) this.optionalFooterRedirectUrlApp, (Object) bffRendering.optionalFooterRedirectUrlApp) && Intrinsics.areEqual((Object) this.optionalFooterRedirectTarget, (Object) bffRendering.optionalFooterRedirectTarget) && Intrinsics.areEqual((Object) this.optionalFooterMediaFile, (Object) bffRendering.optionalFooterMediaFile) && Intrinsics.areEqual((Object) this.mobileLogoImage, (Object) bffRendering.mobileLogoImage) && Intrinsics.areEqual((Object) this.bffBackgroundImage, (Object) bffRendering.bffBackgroundImage) && Intrinsics.areEqual((Object) this.backgroundImage, (Object) bffRendering.backgroundImage) && Intrinsics.areEqual((Object) this.mobileBackgroundImage, (Object) bffRendering.mobileBackgroundImage) && Intrinsics.areEqual((Object) this.desktopBackgroundImage, (Object) bffRendering.desktopBackgroundImage) && Intrinsics.areEqual((Object) this.optionalDesktopMultibackgroundImage2, (Object) bffRendering.optionalDesktopMultibackgroundImage2) && Intrinsics.areEqual((Object) this.optionalDesktopMultibackgroundImage3, (Object) bffRendering.optionalDesktopMultibackgroundImage3) && Intrinsics.areEqual((Object) this.optionalDesktopMultibackgroundImage4, (Object) bffRendering.optionalDesktopMultibackgroundImage4) && Intrinsics.areEqual((Object) this.optionalDesktopMultibackgroundImage5, (Object) bffRendering.optionalDesktopMultibackgroundImage5);
    }

    @C12580l
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @C12580l
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    @C12580l
    public final String getBffBackgroundImage() {
        return this.bffBackgroundImage;
    }

    @C12580l
    public final String getBorderColor() {
        return this.borderColor;
    }

    @C12580l
    public final String getButton1Text() {
        return this.button1Text;
    }

    @C12580l
    public final String getButtonColor() {
        return this.buttonColor;
    }

    @C12580l
    public final String getButtonTextColor() {
        return this.buttonTextColor;
    }

    @C12580l
    public final String getDesktopBackgroundImage() {
        return this.desktopBackgroundImage;
    }

    @C12580l
    public final String getHeaderText() {
        return this.headerText;
    }

    @C12580l
    public final String getMobileBackgroundImage() {
        return this.mobileBackgroundImage;
    }

    @C12580l
    public final String getMobileLogoImage() {
        return this.mobileLogoImage;
    }

    @C12580l
    public final String getOptionalButton2Text() {
        return this.optionalButton2Text;
    }

    @C12580l
    public final String getOptionalButton3Text() {
        return this.optionalButton3Text;
    }

    @C12580l
    public final String getOptionalButton4Text() {
        return this.optionalButton4Text;
    }

    @C12580l
    public final String getOptionalButton5Text() {
        return this.optionalButton5Text;
    }

    @C12580l
    public final String getOptionalDesktopMultibackgroundImage2() {
        return this.optionalDesktopMultibackgroundImage2;
    }

    @C12580l
    public final String getOptionalDesktopMultibackgroundImage3() {
        return this.optionalDesktopMultibackgroundImage3;
    }

    @C12580l
    public final String getOptionalDesktopMultibackgroundImage4() {
        return this.optionalDesktopMultibackgroundImage4;
    }

    @C12580l
    public final String getOptionalDesktopMultibackgroundImage5() {
        return this.optionalDesktopMultibackgroundImage5;
    }

    @C12580l
    public final String getOptionalFooterBackgroundColor() {
        return this.optionalFooterBackgroundColor;
    }

    @C12580l
    public final String getOptionalFooterMediaFile() {
        return this.optionalFooterMediaFile;
    }

    @C12580l
    public final String getOptionalFooterRedirectTarget() {
        return this.optionalFooterRedirectTarget;
    }

    @C12580l
    public final String getOptionalFooterRedirectUrl() {
        return this.optionalFooterRedirectUrl;
    }

    @C12580l
    public final String getOptionalFooterRedirectUrlApp() {
        return this.optionalFooterRedirectUrlApp;
    }

    @C12580l
    public final String getOptionalFooterText() {
        return this.optionalFooterText;
    }

    @C12580l
    public final String getOptionalFooterTextColor() {
        return this.optionalFooterTextColor;
    }

    @C12580l
    public final String getOptionalFooterType() {
        return this.optionalFooterType;
    }

    @C12580l
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @C12580l
    public final String getSelectedButtonColor() {
        return this.selectedButtonColor;
    }

    @C12580l
    public final String getSelectedButtonTextColor() {
        return this.selectedButtonTextColor;
    }

    public int hashCode() {
        String str = this.headerText;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.redirectUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.button1Text;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.optionalButton2Text;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.optionalButton3Text;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.optionalButton4Text;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.optionalButton5Text;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.borderColor;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.backgroundColor;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.buttonColor;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.selectedButtonColor;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.buttonTextColor;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.selectedButtonTextColor;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.optionalFooterType;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.optionalFooterText;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.optionalFooterTextColor;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.optionalFooterBackgroundColor;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.optionalFooterRedirectUrl;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.optionalFooterRedirectUrlApp;
        int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.optionalFooterRedirectTarget;
        int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.optionalFooterMediaFile;
        int hashCode21 = (hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.mobileLogoImage;
        int hashCode22 = (hashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.bffBackgroundImage;
        int hashCode23 = (hashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.backgroundImage;
        int hashCode24 = (hashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.mobileBackgroundImage;
        int hashCode25 = (hashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.desktopBackgroundImage;
        int hashCode26 = (hashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.optionalDesktopMultibackgroundImage2;
        int hashCode27 = (hashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.optionalDesktopMultibackgroundImage3;
        int hashCode28 = (hashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.optionalDesktopMultibackgroundImage4;
        int hashCode29 = (hashCode28 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.optionalDesktopMultibackgroundImage5;
        if (str30 != null) {
            i = str30.hashCode();
        }
        return hashCode29 + i;
    }

    @C12579k
    public String toString() {
        String str = this.headerText;
        String str2 = this.redirectUrl;
        String str3 = this.button1Text;
        String str4 = this.optionalButton2Text;
        String str5 = this.optionalButton3Text;
        String str6 = this.optionalButton4Text;
        String str7 = this.optionalButton5Text;
        String str8 = this.borderColor;
        String str9 = this.backgroundColor;
        String str10 = this.buttonColor;
        String str11 = this.selectedButtonColor;
        String str12 = this.buttonTextColor;
        String str13 = this.selectedButtonTextColor;
        String str14 = this.optionalFooterType;
        String str15 = this.optionalFooterText;
        String str16 = this.optionalFooterTextColor;
        String str17 = this.optionalFooterBackgroundColor;
        String str18 = this.optionalFooterRedirectUrl;
        String str19 = this.optionalFooterRedirectUrlApp;
        String str20 = this.optionalFooterRedirectTarget;
        String str21 = this.optionalFooterMediaFile;
        String str22 = this.mobileLogoImage;
        String str23 = this.bffBackgroundImage;
        String str24 = this.backgroundImage;
        String str25 = this.mobileBackgroundImage;
        String str26 = this.desktopBackgroundImage;
        String str27 = this.optionalDesktopMultibackgroundImage2;
        String str28 = this.optionalDesktopMultibackgroundImage3;
        String str29 = this.optionalDesktopMultibackgroundImage4;
        String str30 = this.optionalDesktopMultibackgroundImage5;
        return "BffRendering(headerText=" + str + ", redirectUrl=" + str2 + ", button1Text=" + str3 + ", optionalButton2Text=" + str4 + ", optionalButton3Text=" + str5 + ", optionalButton4Text=" + str6 + ", optionalButton5Text=" + str7 + ", borderColor=" + str8 + ", backgroundColor=" + str9 + ", buttonColor=" + str10 + ", selectedButtonColor=" + str11 + ", buttonTextColor=" + str12 + ", selectedButtonTextColor=" + str13 + ", optionalFooterType=" + str14 + ", optionalFooterText=" + str15 + ", optionalFooterTextColor=" + str16 + ", optionalFooterBackgroundColor=" + str17 + ", optionalFooterRedirectUrl=" + str18 + ", optionalFooterRedirectUrlApp=" + str19 + ", optionalFooterRedirectTarget=" + str20 + ", optionalFooterMediaFile=" + str21 + ", mobileLogoImage=" + str22 + ", bffBackgroundImage=" + str23 + ", backgroundImage=" + str24 + ", mobileBackgroundImage=" + str25 + ", desktopBackgroundImage=" + str26 + ", optionalDesktopMultibackgroundImage2=" + str27 + ", optionalDesktopMultibackgroundImage3=" + str28 + ", optionalDesktopMultibackgroundImage4=" + str29 + ", optionalDesktopMultibackgroundImage5=" + str30 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffRendering(int i, @C12438n("header_text") String str, @C12438n("redirect_url") String str2, @C12438n("button_1_text") String str3, @C12438n("optional_button_2_text") String str4, @C12438n("optional_button_3_text") String str5, @C12438n("optional_button_4_text") String str6, @C12438n("optional_button_5_text") String str7, @C12438n("border_color") String str8, @C12438n("background_color") String str9, @C12438n("button_color") String str10, @C12438n("selected_button_color") String str11, @C12438n("button_text_color") String str12, @C12438n("selected_button_text_color") String str13, @C12438n("optional_footer_type") String str14, @C12438n("optional_footer_text") String str15, @C12438n("optional_footer_text_color") String str16, @C12438n("optional_footer_background_color") String str17, @C12438n("optional_footer_redirect_url") String str18, @C12438n("optional_footer_redirect_url_app") String str19, @C12438n("optional_footer_redirect_target") String str20, @C12438n("optional_footer_media_file") String str21, @C12438n("mobile_logo_image") String str22, @C12438n("bff_background_image") String str23, @C12438n("background_image") String str24, @C12438n("mobile_background_image") String str25, @C12438n("desktop_background_image") String str26, @C12438n("optional_desktop_multibackground_image_2") String str27, @C12438n("optional_desktop_multibackground_image_3") String str28, @C12438n("optional_desktop_multibackground_image_4") String str29, @C12438n("optional_desktop_multibackground_image_5") String str30, C12295n1 n1Var) {
        int i2 = i;
        if ((i2 & 0) != 0) {
            C12261c1.m49256b(i, 0, BffRendering$$serializer.INSTANCE.getDescriptor());
        }
        if ((i2 & 1) == 0) {
            this.headerText = null;
        } else {
            this.headerText = str;
        }
        if ((i2 & 2) == 0) {
            this.redirectUrl = null;
        } else {
            this.redirectUrl = str2;
        }
        if ((i2 & 4) == 0) {
            this.button1Text = null;
        } else {
            this.button1Text = str3;
        }
        if ((i2 & 8) == 0) {
            this.optionalButton2Text = null;
        } else {
            this.optionalButton2Text = str4;
        }
        if ((i2 & 16) == 0) {
            this.optionalButton3Text = null;
        } else {
            this.optionalButton3Text = str5;
        }
        if ((i2 & 32) == 0) {
            this.optionalButton4Text = null;
        } else {
            this.optionalButton4Text = str6;
        }
        if ((i2 & 64) == 0) {
            this.optionalButton5Text = null;
        } else {
            this.optionalButton5Text = str7;
        }
        if ((i2 & 128) == 0) {
            this.borderColor = null;
        } else {
            this.borderColor = str8;
        }
        if ((i2 & 256) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = str9;
        }
        if ((i2 & 512) == 0) {
            this.buttonColor = null;
        } else {
            this.buttonColor = str10;
        }
        if ((i2 & 1024) == 0) {
            this.selectedButtonColor = null;
        } else {
            this.selectedButtonColor = str11;
        }
        if ((i2 & 2048) == 0) {
            this.buttonTextColor = null;
        } else {
            this.buttonTextColor = str12;
        }
        if ((i2 & 4096) == 0) {
            this.selectedButtonTextColor = null;
        } else {
            this.selectedButtonTextColor = str13;
        }
        if ((i2 & 8192) == 0) {
            this.optionalFooterType = null;
        } else {
            this.optionalFooterType = str14;
        }
        if ((i2 & 16384) == 0) {
            this.optionalFooterText = null;
        } else {
            this.optionalFooterText = str15;
        }
        if ((32768 & i2) == 0) {
            this.optionalFooterTextColor = null;
        } else {
            this.optionalFooterTextColor = str16;
        }
        if ((65536 & i2) == 0) {
            this.optionalFooterBackgroundColor = null;
        } else {
            this.optionalFooterBackgroundColor = str17;
        }
        if ((131072 & i2) == 0) {
            this.optionalFooterRedirectUrl = null;
        } else {
            this.optionalFooterRedirectUrl = str18;
        }
        if ((262144 & i2) == 0) {
            this.optionalFooterRedirectUrlApp = null;
        } else {
            this.optionalFooterRedirectUrlApp = str19;
        }
        if ((524288 & i2) == 0) {
            this.optionalFooterRedirectTarget = null;
        } else {
            this.optionalFooterRedirectTarget = str20;
        }
        if ((1048576 & i2) == 0) {
            this.optionalFooterMediaFile = null;
        } else {
            this.optionalFooterMediaFile = str21;
        }
        if ((2097152 & i2) == 0) {
            this.mobileLogoImage = null;
        } else {
            this.mobileLogoImage = str22;
        }
        if ((4194304 & i2) == 0) {
            this.bffBackgroundImage = null;
        } else {
            this.bffBackgroundImage = str23;
        }
        if ((8388608 & i2) == 0) {
            this.backgroundImage = null;
        } else {
            this.backgroundImage = str24;
        }
        if ((16777216 & i2) == 0) {
            this.mobileBackgroundImage = null;
        } else {
            this.mobileBackgroundImage = str25;
        }
        if ((33554432 & i2) == 0) {
            this.desktopBackgroundImage = null;
        } else {
            this.desktopBackgroundImage = str26;
        }
        if ((67108864 & i2) == 0) {
            this.optionalDesktopMultibackgroundImage2 = null;
        } else {
            this.optionalDesktopMultibackgroundImage2 = str27;
        }
        if ((134217728 & i2) == 0) {
            this.optionalDesktopMultibackgroundImage3 = null;
        } else {
            this.optionalDesktopMultibackgroundImage3 = str28;
        }
        if ((268435456 & i2) == 0) {
            this.optionalDesktopMultibackgroundImage4 = null;
        } else {
            this.optionalDesktopMultibackgroundImage4 = str29;
        }
        if ((i2 & 536870912) == 0) {
            this.optionalDesktopMultibackgroundImage5 = null;
        } else {
            this.optionalDesktopMultibackgroundImage5 = str30;
        }
    }

    public BffRendering(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l String str16, @C12580l String str17, @C12580l String str18, @C12580l String str19, @C12580l String str20, @C12580l String str21, @C12580l String str22, @C12580l String str23, @C12580l String str24, @C12580l String str25, @C12580l String str26, @C12580l String str27, @C12580l String str28, @C12580l String str29, @C12580l String str30) {
        this.headerText = str;
        this.redirectUrl = str2;
        this.button1Text = str3;
        this.optionalButton2Text = str4;
        this.optionalButton3Text = str5;
        this.optionalButton4Text = str6;
        this.optionalButton5Text = str7;
        this.borderColor = str8;
        this.backgroundColor = str9;
        this.buttonColor = str10;
        this.selectedButtonColor = str11;
        this.buttonTextColor = str12;
        this.selectedButtonTextColor = str13;
        this.optionalFooterType = str14;
        this.optionalFooterText = str15;
        this.optionalFooterTextColor = str16;
        this.optionalFooterBackgroundColor = str17;
        this.optionalFooterRedirectUrl = str18;
        this.optionalFooterRedirectUrlApp = str19;
        this.optionalFooterRedirectTarget = str20;
        this.optionalFooterMediaFile = str21;
        this.mobileLogoImage = str22;
        this.bffBackgroundImage = str23;
        this.backgroundImage = str24;
        this.mobileBackgroundImage = str25;
        this.desktopBackgroundImage = str26;
        this.optionalDesktopMultibackgroundImage2 = str27;
        this.optionalDesktopMultibackgroundImage3 = str28;
        this.optionalDesktopMultibackgroundImage4 = str29;
        this.optionalDesktopMultibackgroundImage5 = str30;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffRendering(java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, int r62, kotlin.jvm.internal.DefaultConstructorMarker r63) {
        /*
            r31 = this;
            r0 = r62
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r32
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r33
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r34
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r35
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r36
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r37
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r38
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r39
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r40
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r41
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r42
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r43
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r44
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r45
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r46
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r47
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r48
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r49
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r50
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b0
            r20 = 0
            goto L_0x00b2
        L_0x00b0:
            r20 = r51
        L_0x00b2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = 0
            goto L_0x00bd
        L_0x00bb:
            r21 = r52
        L_0x00bd:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c6
            r22 = 0
            goto L_0x00c8
        L_0x00c6:
            r22 = r53
        L_0x00c8:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d1
            r23 = 0
            goto L_0x00d3
        L_0x00d1:
            r23 = r54
        L_0x00d3:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00dc
            r24 = 0
            goto L_0x00de
        L_0x00dc:
            r24 = r55
        L_0x00de:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00e7
            r25 = 0
            goto L_0x00e9
        L_0x00e7:
            r25 = r56
        L_0x00e9:
            r26 = 33554432(0x2000000, float:9.403955E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00f2
            r26 = 0
            goto L_0x00f4
        L_0x00f2:
            r26 = r57
        L_0x00f4:
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x00fd
            r27 = 0
            goto L_0x00ff
        L_0x00fd:
            r27 = r58
        L_0x00ff:
            r28 = 134217728(0x8000000, float:3.85186E-34)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x0108
            r28 = 0
            goto L_0x010a
        L_0x0108:
            r28 = r59
        L_0x010a:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x0113
            r29 = 0
            goto L_0x0115
        L_0x0113:
            r29 = r60
        L_0x0115:
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r30
            if (r0 == 0) goto L_0x011d
            r0 = 0
            goto L_0x011f
        L_0x011d:
            r0 = r61
        L_0x011f:
            r32 = r31
            r33 = r1
            r34 = r3
            r35 = r4
            r36 = r5
            r37 = r6
            r38 = r7
            r39 = r8
            r40 = r9
            r41 = r10
            r42 = r11
            r43 = r12
            r44 = r13
            r45 = r14
            r46 = r15
            r47 = r2
            r48 = r16
            r49 = r17
            r50 = r18
            r51 = r19
            r52 = r20
            r53 = r21
            r54 = r22
            r55 = r23
            r56 = r24
            r57 = r25
            r58 = r26
            r59 = r27
            r60 = r28
            r61 = r29
            r62 = r0
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffRendering.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
