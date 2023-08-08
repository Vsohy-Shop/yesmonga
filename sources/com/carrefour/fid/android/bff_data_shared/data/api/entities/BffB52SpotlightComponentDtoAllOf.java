package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.compose.runtime.C8698y1;
import com.urbanairship.util.C9647e0;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12269f;
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b#\n\u0002\u0010\u000b\n\u0002\bJ\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 \u00012\u00020\u0001:\u0004\u0001\u0001Bë\u0002\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010+¢\u0006\u0006\b\u0001\u0010\u0001B\u0003\b\u0017\u0012\u0007\u0010\u0001\u001a\u00020\t\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00105\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00106\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00109\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010<\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010=\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010>\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010?\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010@\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010A\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010B\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010C\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010D\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010E\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010F\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010G\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010H\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0001\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010+\u0012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010+HÆ\u0003Jò\u0002\u0010J\u001a\u00020\u00002\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00108\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010+HÆ\u0001¢\u0006\u0004\bJ\u0010KJ\t\u0010L\u001a\u00020\fHÖ\u0001J\t\u0010M\u001a\u00020\tHÖ\u0001J\u0013\u0010P\u001a\u00020O2\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010-\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010Q\u0012\u0004\bS\u0010T\u001a\u0004\bR\u0010\u000bR\"\u0010.\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010U\u0012\u0004\bX\u0010T\u001a\u0004\bV\u0010WR\"\u0010/\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010U\u0012\u0004\bZ\u0010T\u001a\u0004\bY\u0010WR\"\u00100\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010U\u0012\u0004\b\\\u0010T\u001a\u0004\b[\u0010WR\"\u00101\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010U\u0012\u0004\b^\u0010T\u001a\u0004\b]\u0010WR\"\u00102\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010U\u0012\u0004\b`\u0010T\u001a\u0004\b_\u0010WR\"\u00103\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010U\u0012\u0004\bb\u0010T\u001a\u0004\ba\u0010WR\"\u00104\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u0010U\u0012\u0004\bd\u0010T\u001a\u0004\bc\u0010WR\"\u00105\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010U\u0012\u0004\bf\u0010T\u001a\u0004\be\u0010WR\"\u00106\u001a\u0004\u0018\u00010\u00158\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u0010g\u0012\u0004\bj\u0010T\u001a\u0004\bh\u0010iR\"\u00107\u001a\u0004\u0018\u00010\u00178\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u0010k\u0012\u0004\bn\u0010T\u001a\u0004\bl\u0010mR\"\u00108\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u0010U\u0012\u0004\bp\u0010T\u001a\u0004\bo\u0010WR\"\u00109\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u0010U\u0012\u0004\br\u0010T\u001a\u0004\bq\u0010WR\"\u0010:\u001a\u0004\u0018\u00010\u001b8\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u0010s\u0012\u0004\bv\u0010T\u001a\u0004\bt\u0010uR\"\u0010;\u001a\u0004\u0018\u00010\u001b8\u0006X\u0004¢\u0006\u0012\n\u0004\b;\u0010s\u0012\u0004\bx\u0010T\u001a\u0004\bw\u0010uR\"\u0010<\u001a\u0004\u0018\u00010\u001b8\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010s\u0012\u0004\bz\u0010T\u001a\u0004\by\u0010uR\"\u0010=\u001a\u0004\u0018\u00010\u001b8\u0006X\u0004¢\u0006\u0012\n\u0004\b=\u0010s\u0012\u0004\b|\u0010T\u001a\u0004\b{\u0010uR\"\u0010>\u001a\u0004\u0018\u00010\u001b8\u0006X\u0004¢\u0006\u0012\n\u0004\b>\u0010s\u0012\u0004\b~\u0010T\u001a\u0004\b}\u0010uR#\u0010?\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0013\n\u0004\b?\u0010U\u0012\u0005\b\u0001\u0010T\u001a\u0004\b\u0010WR$\u0010@\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0014\n\u0004\b@\u0010U\u0012\u0005\b\u0001\u0010T\u001a\u0005\b\u0001\u0010WR$\u0010A\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0014\n\u0004\bA\u0010U\u0012\u0005\b\u0001\u0010T\u001a\u0005\b\u0001\u0010WR$\u0010B\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0014\n\u0004\bB\u0010U\u0012\u0005\b\u0001\u0010T\u001a\u0005\b\u0001\u0010WR$\u0010C\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0014\n\u0004\bC\u0010U\u0012\u0005\b\u0001\u0010T\u001a\u0005\b\u0001\u0010WR$\u0010D\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0014\n\u0004\bD\u0010U\u0012\u0005\b\u0001\u0010T\u001a\u0005\b\u0001\u0010WR$\u0010E\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0014\n\u0004\bE\u0010U\u0012\u0005\b\u0001\u0010T\u001a\u0005\b\u0001\u0010WR$\u0010F\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0014\n\u0004\bF\u0010U\u0012\u0005\b\u0001\u0010T\u001a\u0005\b\u0001\u0010WR$\u0010G\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0014\n\u0004\bG\u0010U\u0012\u0005\b\u0001\u0010T\u001a\u0005\b\u0001\u0010WR$\u0010H\u001a\u0004\u0018\u00010\u00158\u0006X\u0004¢\u0006\u0014\n\u0004\bH\u0010g\u0012\u0005\b\u0001\u0010T\u001a\u0005\b\u0001\u0010iR,\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010+8\u0006X\u0004¢\u0006\u0016\n\u0005\bI\u0010\u0001\u0012\u0005\b\u0001\u0010T\u001a\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB52SpotlightComponentDtoAllOf;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "()Ljava/lang/Integer;", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;", "component10", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTimeTableDto;", "component11", "component12", "component13", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "", "component29", "contentId", "title", "design", "logoType", "textColor", "variant", "countdown", "offerColor", "backgroundColor", "cta", "timetable", "description", "flag", "imageLarge", "image", "backgroundImage", "backgroundMobileImage", "brandLogo", "legalMentions", "ean", "offerPrefix", "offer", "offerSuffix", "discountDesign", "discountPrefix", "discount", "discountSuffix", "imageLink", "links", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTimeTableDto;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Ljava/util/List;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB52SpotlightComponentDtoAllOf;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Integer;", "getContentId", "getContentId$annotations", "()V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getTitle$annotations", "getDesign", "getDesign$annotations", "getLogoType", "getLogoType$annotations", "getTextColor", "getTextColor$annotations", "getVariant", "getVariant$annotations", "getCountdown", "getCountdown$annotations", "getOfferColor", "getOfferColor$annotations", "getBackgroundColor", "getBackgroundColor$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;", "getCta", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;", "getCta$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTimeTableDto;", "getTimetable", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTimeTableDto;", "getTimetable$annotations", "getDescription", "getDescription$annotations", "getFlag", "getFlag$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "getImageLarge", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "getImageLarge$annotations", "getImage", "getImage$annotations", "getBackgroundImage", "getBackgroundImage$annotations", "getBackgroundMobileImage", "getBackgroundMobileImage$annotations", "getBrandLogo", "getBrandLogo$annotations", "getLegalMentions", "getLegalMentions$annotations", "getEan", "getEan$annotations", "getOfferPrefix", "getOfferPrefix$annotations", "getOffer", "getOffer$annotations", "getOfferSuffix", "getOfferSuffix$annotations", "getDiscountDesign", "getDiscountDesign$annotations", "getDiscountPrefix", "getDiscountPrefix$annotations", "getDiscount", "getDiscount$annotations", "getDiscountSuffix", "getDiscountSuffix$annotations", "getImageLink", "getImageLink$annotations", "Ljava/util/List;", "getLinks", "()Ljava/util/List;", "getLinks$annotations", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTimeTableDto;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTimeTableDto;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Ljava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffB52SpotlightComponentDtoAllOf {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C12269f(BffUrlDto$$serializer.INSTANCE)};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String backgroundColor;
    @C12580l
    private final BffImageDto backgroundImage;
    @C12580l
    private final BffImageDto backgroundMobileImage;
    @C12580l
    private final BffImageDto brandLogo;
    @C12580l
    private final Integer contentId;
    @C12580l
    private final String countdown;
    @C12580l
    private final BffUrlDto cta;
    @C12580l
    private final String description;
    @C12580l
    private final String design;
    @C12580l
    private final String discount;
    @C12580l
    private final String discountDesign;
    @C12580l
    private final String discountPrefix;
    @C12580l
    private final String discountSuffix;
    @C12580l
    private final String ean;
    @C12580l
    private final String flag;
    @C12580l
    private final BffImageDto image;
    @C12580l
    private final BffImageDto imageLarge;
    @C12580l
    private final BffUrlDto imageLink;
    @C12580l
    private final String legalMentions;
    @C12580l
    private final List<BffUrlDto> links;
    @C12580l
    private final String logoType;
    @C12580l
    private final String offer;
    @C12580l
    private final String offerColor;
    @C12580l
    private final String offerPrefix;
    @C12580l
    private final String offerSuffix;
    @C12580l
    private final String textColor;
    @C12580l
    private final BffTimeTableDto timetable;
    @C12580l
    private final String title;
    @C12580l
    private final String variant;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB52SpotlightComponentDtoAllOf$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB52SpotlightComponentDtoAllOf;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffB52SpotlightComponentDtoAllOf> serializer() {
            return BffB52SpotlightComponentDtoAllOf$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffB52SpotlightComponentDtoAllOf() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BffUrlDto) null, (BffTimeTableDto) null, (String) null, (String) null, (BffImageDto) null, (BffImageDto) null, (BffImageDto) null, (BffImageDto) null, (BffImageDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BffUrlDto) null, (List) null, 536870911, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffB52SpotlightComponentDtoAllOf copy$default(BffB52SpotlightComponentDtoAllOf bffB52SpotlightComponentDtoAllOf, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BffUrlDto bffUrlDto, BffTimeTableDto bffTimeTableDto, String str9, String str10, BffImageDto bffImageDto, BffImageDto bffImageDto2, BffImageDto bffImageDto3, BffImageDto bffImageDto4, BffImageDto bffImageDto5, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, BffUrlDto bffUrlDto2, List list, int i, Object obj) {
        BffB52SpotlightComponentDtoAllOf bffB52SpotlightComponentDtoAllOf2 = bffB52SpotlightComponentDtoAllOf;
        int i2 = i;
        return bffB52SpotlightComponentDtoAllOf.copy((i2 & 1) != 0 ? bffB52SpotlightComponentDtoAllOf2.contentId : num, (i2 & 2) != 0 ? bffB52SpotlightComponentDtoAllOf2.title : str, (i2 & 4) != 0 ? bffB52SpotlightComponentDtoAllOf2.design : str2, (i2 & 8) != 0 ? bffB52SpotlightComponentDtoAllOf2.logoType : str3, (i2 & 16) != 0 ? bffB52SpotlightComponentDtoAllOf2.textColor : str4, (i2 & 32) != 0 ? bffB52SpotlightComponentDtoAllOf2.variant : str5, (i2 & 64) != 0 ? bffB52SpotlightComponentDtoAllOf2.countdown : str6, (i2 & 128) != 0 ? bffB52SpotlightComponentDtoAllOf2.offerColor : str7, (i2 & 256) != 0 ? bffB52SpotlightComponentDtoAllOf2.backgroundColor : str8, (i2 & 512) != 0 ? bffB52SpotlightComponentDtoAllOf2.cta : bffUrlDto, (i2 & 1024) != 0 ? bffB52SpotlightComponentDtoAllOf2.timetable : bffTimeTableDto, (i2 & 2048) != 0 ? bffB52SpotlightComponentDtoAllOf2.description : str9, (i2 & 4096) != 0 ? bffB52SpotlightComponentDtoAllOf2.flag : str10, (i2 & 8192) != 0 ? bffB52SpotlightComponentDtoAllOf2.imageLarge : bffImageDto, (i2 & 16384) != 0 ? bffB52SpotlightComponentDtoAllOf2.image : bffImageDto2, (i2 & 32768) != 0 ? bffB52SpotlightComponentDtoAllOf2.backgroundImage : bffImageDto3, (i2 & 65536) != 0 ? bffB52SpotlightComponentDtoAllOf2.backgroundMobileImage : bffImageDto4, (i2 & 131072) != 0 ? bffB52SpotlightComponentDtoAllOf2.brandLogo : bffImageDto5, (i2 & 262144) != 0 ? bffB52SpotlightComponentDtoAllOf2.legalMentions : str11, (i2 & 524288) != 0 ? bffB52SpotlightComponentDtoAllOf2.ean : str12, (i2 & 1048576) != 0 ? bffB52SpotlightComponentDtoAllOf2.offerPrefix : str13, (i2 & 2097152) != 0 ? bffB52SpotlightComponentDtoAllOf2.offer : str14, (i2 & 4194304) != 0 ? bffB52SpotlightComponentDtoAllOf2.offerSuffix : str15, (i2 & 8388608) != 0 ? bffB52SpotlightComponentDtoAllOf2.discountDesign : str16, (i2 & 16777216) != 0 ? bffB52SpotlightComponentDtoAllOf2.discountPrefix : str17, (i2 & C9647e0.f26435a) != 0 ? bffB52SpotlightComponentDtoAllOf2.discount : str18, (i2 & C8698y1.f23302n) != 0 ? bffB52SpotlightComponentDtoAllOf2.discountSuffix : str19, (i2 & C8698y1.f23301m) != 0 ? bffB52SpotlightComponentDtoAllOf2.imageLink : bffUrlDto2, (i2 & 268435456) != 0 ? bffB52SpotlightComponentDtoAllOf2.links : list);
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

    @C12438n("brand_logo")
    public static /* synthetic */ void getBrandLogo$annotations() {
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

    @C12438n("ean")
    public static /* synthetic */ void getEan$annotations() {
    }

    @C12438n("flag")
    public static /* synthetic */ void getFlag$annotations() {
    }

    @C12438n("image")
    public static /* synthetic */ void getImage$annotations() {
    }

    @C12438n("image_large")
    public static /* synthetic */ void getImageLarge$annotations() {
    }

    @C12438n("image_link")
    public static /* synthetic */ void getImageLink$annotations() {
    }

    @C12438n("legal_mentions")
    public static /* synthetic */ void getLegalMentions$annotations() {
    }

    @C12438n("links")
    public static /* synthetic */ void getLinks$annotations() {
    }

    @C12438n("logo_type")
    public static /* synthetic */ void getLogoType$annotations() {
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

    @C12438n("text_color")
    public static /* synthetic */ void getTextColor$annotations() {
    }

    @C12438n("timetable")
    public static /* synthetic */ void getTimetable$annotations() {
    }

    @C12438n("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @C12438n("variant")
    public static /* synthetic */ void getVariant$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffB52SpotlightComponentDtoAllOf bffB52SpotlightComponentDtoAllOf, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffB52SpotlightComponentDtoAllOf.contentId != null) {
            dVar.mo24912i(fVar, 0, C12276h0.f30067a, bffB52SpotlightComponentDtoAllOf.contentId);
        }
        if (dVar.mo24897A(fVar, 1) || bffB52SpotlightComponentDtoAllOf.title != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffB52SpotlightComponentDtoAllOf.title);
        }
        if (dVar.mo24897A(fVar, 2) || bffB52SpotlightComponentDtoAllOf.design != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffB52SpotlightComponentDtoAllOf.design);
        }
        if (dVar.mo24897A(fVar, 3) || bffB52SpotlightComponentDtoAllOf.logoType != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffB52SpotlightComponentDtoAllOf.logoType);
        }
        if (dVar.mo24897A(fVar, 4) || bffB52SpotlightComponentDtoAllOf.textColor != null) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffB52SpotlightComponentDtoAllOf.textColor);
        }
        if (dVar.mo24897A(fVar, 5) || bffB52SpotlightComponentDtoAllOf.variant != null) {
            dVar.mo24912i(fVar, 5, C12310s1.f30117a, bffB52SpotlightComponentDtoAllOf.variant);
        }
        if (dVar.mo24897A(fVar, 6) || bffB52SpotlightComponentDtoAllOf.countdown != null) {
            dVar.mo24912i(fVar, 6, C12310s1.f30117a, bffB52SpotlightComponentDtoAllOf.countdown);
        }
        if (dVar.mo24897A(fVar, 7) || bffB52SpotlightComponentDtoAllOf.offerColor != null) {
            dVar.mo24912i(fVar, 7, C12310s1.f30117a, bffB52SpotlightComponentDtoAllOf.offerColor);
        }
        if (dVar.mo24897A(fVar, 8) || bffB52SpotlightComponentDtoAllOf.backgroundColor != null) {
            dVar.mo24912i(fVar, 8, C12310s1.f30117a, bffB52SpotlightComponentDtoAllOf.backgroundColor);
        }
        if (dVar.mo24897A(fVar, 9) || bffB52SpotlightComponentDtoAllOf.cta != null) {
            dVar.mo24912i(fVar, 9, BffUrlDto$$serializer.INSTANCE, bffB52SpotlightComponentDtoAllOf.cta);
        }
        if (dVar.mo24897A(fVar, 10) || bffB52SpotlightComponentDtoAllOf.timetable != null) {
            dVar.mo24912i(fVar, 10, BffTimeTableDto$$serializer.INSTANCE, bffB52SpotlightComponentDtoAllOf.timetable);
        }
        if (dVar.mo24897A(fVar, 11) || bffB52SpotlightComponentDtoAllOf.description != null) {
            dVar.mo24912i(fVar, 11, C12310s1.f30117a, bffB52SpotlightComponentDtoAllOf.description);
        }
        if (dVar.mo24897A(fVar, 12) || bffB52SpotlightComponentDtoAllOf.flag != null) {
            dVar.mo24912i(fVar, 12, C12310s1.f30117a, bffB52SpotlightComponentDtoAllOf.flag);
        }
        if (dVar.mo24897A(fVar, 13) || bffB52SpotlightComponentDtoAllOf.imageLarge != null) {
            dVar.mo24912i(fVar, 13, BffImageDto$$serializer.INSTANCE, bffB52SpotlightComponentDtoAllOf.imageLarge);
        }
        if (dVar.mo24897A(fVar, 14) || bffB52SpotlightComponentDtoAllOf.image != null) {
            dVar.mo24912i(fVar, 14, BffImageDto$$serializer.INSTANCE, bffB52SpotlightComponentDtoAllOf.image);
        }
        if (dVar.mo24897A(fVar, 15) || bffB52SpotlightComponentDtoAllOf.backgroundImage != null) {
            dVar.mo24912i(fVar, 15, BffImageDto$$serializer.INSTANCE, bffB52SpotlightComponentDtoAllOf.backgroundImage);
        }
        if (dVar.mo24897A(fVar, 16) || bffB52SpotlightComponentDtoAllOf.backgroundMobileImage != null) {
            dVar.mo24912i(fVar, 16, BffImageDto$$serializer.INSTANCE, bffB52SpotlightComponentDtoAllOf.backgroundMobileImage);
        }
        if (dVar.mo24897A(fVar, 17) || bffB52SpotlightComponentDtoAllOf.brandLogo != null) {
            dVar.mo24912i(fVar, 17, BffImageDto$$serializer.INSTANCE, bffB52SpotlightComponentDtoAllOf.brandLogo);
        }
        if (dVar.mo24897A(fVar, 18) || bffB52SpotlightComponentDtoAllOf.legalMentions != null) {
            dVar.mo24912i(fVar, 18, C12310s1.f30117a, bffB52SpotlightComponentDtoAllOf.legalMentions);
        }
        if (dVar.mo24897A(fVar, 19) || bffB52SpotlightComponentDtoAllOf.ean != null) {
            dVar.mo24912i(fVar, 19, C12310s1.f30117a, bffB52SpotlightComponentDtoAllOf.ean);
        }
        if (dVar.mo24897A(fVar, 20) || bffB52SpotlightComponentDtoAllOf.offerPrefix != null) {
            dVar.mo24912i(fVar, 20, C12310s1.f30117a, bffB52SpotlightComponentDtoAllOf.offerPrefix);
        }
        if (dVar.mo24897A(fVar, 21) || bffB52SpotlightComponentDtoAllOf.offer != null) {
            dVar.mo24912i(fVar, 21, C12310s1.f30117a, bffB52SpotlightComponentDtoAllOf.offer);
        }
        if (dVar.mo24897A(fVar, 22) || bffB52SpotlightComponentDtoAllOf.offerSuffix != null) {
            dVar.mo24912i(fVar, 22, C12310s1.f30117a, bffB52SpotlightComponentDtoAllOf.offerSuffix);
        }
        if (dVar.mo24897A(fVar, 23) || bffB52SpotlightComponentDtoAllOf.discountDesign != null) {
            dVar.mo24912i(fVar, 23, C12310s1.f30117a, bffB52SpotlightComponentDtoAllOf.discountDesign);
        }
        if (dVar.mo24897A(fVar, 24) || bffB52SpotlightComponentDtoAllOf.discountPrefix != null) {
            dVar.mo24912i(fVar, 24, C12310s1.f30117a, bffB52SpotlightComponentDtoAllOf.discountPrefix);
        }
        if (dVar.mo24897A(fVar, 25) || bffB52SpotlightComponentDtoAllOf.discount != null) {
            dVar.mo24912i(fVar, 25, C12310s1.f30117a, bffB52SpotlightComponentDtoAllOf.discount);
        }
        if (dVar.mo24897A(fVar, 26) || bffB52SpotlightComponentDtoAllOf.discountSuffix != null) {
            dVar.mo24912i(fVar, 26, C12310s1.f30117a, bffB52SpotlightComponentDtoAllOf.discountSuffix);
        }
        if (dVar.mo24897A(fVar, 27) || bffB52SpotlightComponentDtoAllOf.imageLink != null) {
            dVar.mo24912i(fVar, 27, BffUrlDto$$serializer.INSTANCE, bffB52SpotlightComponentDtoAllOf.imageLink);
        }
        if (dVar.mo24897A(fVar, 28) || bffB52SpotlightComponentDtoAllOf.links != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 28, gVarArr[28], bffB52SpotlightComponentDtoAllOf.links);
        }
    }

    @C12580l
    public final Integer component1() {
        return this.contentId;
    }

    @C12580l
    public final BffUrlDto component10() {
        return this.cta;
    }

    @C12580l
    public final BffTimeTableDto component11() {
        return this.timetable;
    }

    @C12580l
    public final String component12() {
        return this.description;
    }

    @C12580l
    public final String component13() {
        return this.flag;
    }

    @C12580l
    public final BffImageDto component14() {
        return this.imageLarge;
    }

    @C12580l
    public final BffImageDto component15() {
        return this.image;
    }

    @C12580l
    public final BffImageDto component16() {
        return this.backgroundImage;
    }

    @C12580l
    public final BffImageDto component17() {
        return this.backgroundMobileImage;
    }

    @C12580l
    public final BffImageDto component18() {
        return this.brandLogo;
    }

    @C12580l
    public final String component19() {
        return this.legalMentions;
    }

    @C12580l
    public final String component2() {
        return this.title;
    }

    @C12580l
    public final String component20() {
        return this.ean;
    }

    @C12580l
    public final String component21() {
        return this.offerPrefix;
    }

    @C12580l
    public final String component22() {
        return this.offer;
    }

    @C12580l
    public final String component23() {
        return this.offerSuffix;
    }

    @C12580l
    public final String component24() {
        return this.discountDesign;
    }

    @C12580l
    public final String component25() {
        return this.discountPrefix;
    }

    @C12580l
    public final String component26() {
        return this.discount;
    }

    @C12580l
    public final String component27() {
        return this.discountSuffix;
    }

    @C12580l
    public final BffUrlDto component28() {
        return this.imageLink;
    }

    @C12580l
    public final List<BffUrlDto> component29() {
        return this.links;
    }

    @C12580l
    public final String component3() {
        return this.design;
    }

    @C12580l
    public final String component4() {
        return this.logoType;
    }

    @C12580l
    public final String component5() {
        return this.textColor;
    }

    @C12580l
    public final String component6() {
        return this.variant;
    }

    @C12580l
    public final String component7() {
        return this.countdown;
    }

    @C12580l
    public final String component8() {
        return this.offerColor;
    }

    @C12580l
    public final String component9() {
        return this.backgroundColor;
    }

    @C12579k
    public final BffB52SpotlightComponentDtoAllOf copy(@C12580l Integer num, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l BffUrlDto bffUrlDto, @C12580l BffTimeTableDto bffTimeTableDto, @C12580l String str9, @C12580l String str10, @C12580l BffImageDto bffImageDto, @C12580l BffImageDto bffImageDto2, @C12580l BffImageDto bffImageDto3, @C12580l BffImageDto bffImageDto4, @C12580l BffImageDto bffImageDto5, @C12580l String str11, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l String str16, @C12580l String str17, @C12580l String str18, @C12580l String str19, @C12580l BffUrlDto bffUrlDto2, @C12580l List<BffUrlDto> list) {
        return new BffB52SpotlightComponentDtoAllOf(num, str, str2, str3, str4, str5, str6, str7, str8, bffUrlDto, bffTimeTableDto, str9, str10, bffImageDto, bffImageDto2, bffImageDto3, bffImageDto4, bffImageDto5, str11, str12, str13, str14, str15, str16, str17, str18, str19, bffUrlDto2, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffB52SpotlightComponentDtoAllOf)) {
            return false;
        }
        BffB52SpotlightComponentDtoAllOf bffB52SpotlightComponentDtoAllOf = (BffB52SpotlightComponentDtoAllOf) obj;
        return Intrinsics.areEqual((Object) this.contentId, (Object) bffB52SpotlightComponentDtoAllOf.contentId) && Intrinsics.areEqual((Object) this.title, (Object) bffB52SpotlightComponentDtoAllOf.title) && Intrinsics.areEqual((Object) this.design, (Object) bffB52SpotlightComponentDtoAllOf.design) && Intrinsics.areEqual((Object) this.logoType, (Object) bffB52SpotlightComponentDtoAllOf.logoType) && Intrinsics.areEqual((Object) this.textColor, (Object) bffB52SpotlightComponentDtoAllOf.textColor) && Intrinsics.areEqual((Object) this.variant, (Object) bffB52SpotlightComponentDtoAllOf.variant) && Intrinsics.areEqual((Object) this.countdown, (Object) bffB52SpotlightComponentDtoAllOf.countdown) && Intrinsics.areEqual((Object) this.offerColor, (Object) bffB52SpotlightComponentDtoAllOf.offerColor) && Intrinsics.areEqual((Object) this.backgroundColor, (Object) bffB52SpotlightComponentDtoAllOf.backgroundColor) && Intrinsics.areEqual((Object) this.cta, (Object) bffB52SpotlightComponentDtoAllOf.cta) && Intrinsics.areEqual((Object) this.timetable, (Object) bffB52SpotlightComponentDtoAllOf.timetable) && Intrinsics.areEqual((Object) this.description, (Object) bffB52SpotlightComponentDtoAllOf.description) && Intrinsics.areEqual((Object) this.flag, (Object) bffB52SpotlightComponentDtoAllOf.flag) && Intrinsics.areEqual((Object) this.imageLarge, (Object) bffB52SpotlightComponentDtoAllOf.imageLarge) && Intrinsics.areEqual((Object) this.image, (Object) bffB52SpotlightComponentDtoAllOf.image) && Intrinsics.areEqual((Object) this.backgroundImage, (Object) bffB52SpotlightComponentDtoAllOf.backgroundImage) && Intrinsics.areEqual((Object) this.backgroundMobileImage, (Object) bffB52SpotlightComponentDtoAllOf.backgroundMobileImage) && Intrinsics.areEqual((Object) this.brandLogo, (Object) bffB52SpotlightComponentDtoAllOf.brandLogo) && Intrinsics.areEqual((Object) this.legalMentions, (Object) bffB52SpotlightComponentDtoAllOf.legalMentions) && Intrinsics.areEqual((Object) this.ean, (Object) bffB52SpotlightComponentDtoAllOf.ean) && Intrinsics.areEqual((Object) this.offerPrefix, (Object) bffB52SpotlightComponentDtoAllOf.offerPrefix) && Intrinsics.areEqual((Object) this.offer, (Object) bffB52SpotlightComponentDtoAllOf.offer) && Intrinsics.areEqual((Object) this.offerSuffix, (Object) bffB52SpotlightComponentDtoAllOf.offerSuffix) && Intrinsics.areEqual((Object) this.discountDesign, (Object) bffB52SpotlightComponentDtoAllOf.discountDesign) && Intrinsics.areEqual((Object) this.discountPrefix, (Object) bffB52SpotlightComponentDtoAllOf.discountPrefix) && Intrinsics.areEqual((Object) this.discount, (Object) bffB52SpotlightComponentDtoAllOf.discount) && Intrinsics.areEqual((Object) this.discountSuffix, (Object) bffB52SpotlightComponentDtoAllOf.discountSuffix) && Intrinsics.areEqual((Object) this.imageLink, (Object) bffB52SpotlightComponentDtoAllOf.imageLink) && Intrinsics.areEqual((Object) this.links, (Object) bffB52SpotlightComponentDtoAllOf.links);
    }

    @C12580l
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @C12580l
    public final BffImageDto getBackgroundImage() {
        return this.backgroundImage;
    }

    @C12580l
    public final BffImageDto getBackgroundMobileImage() {
        return this.backgroundMobileImage;
    }

    @C12580l
    public final BffImageDto getBrandLogo() {
        return this.brandLogo;
    }

    @C12580l
    public final Integer getContentId() {
        return this.contentId;
    }

    @C12580l
    public final String getCountdown() {
        return this.countdown;
    }

    @C12580l
    public final BffUrlDto getCta() {
        return this.cta;
    }

    @C12580l
    public final String getDescription() {
        return this.description;
    }

    @C12580l
    public final String getDesign() {
        return this.design;
    }

    @C12580l
    public final String getDiscount() {
        return this.discount;
    }

    @C12580l
    public final String getDiscountDesign() {
        return this.discountDesign;
    }

    @C12580l
    public final String getDiscountPrefix() {
        return this.discountPrefix;
    }

    @C12580l
    public final String getDiscountSuffix() {
        return this.discountSuffix;
    }

    @C12580l
    public final String getEan() {
        return this.ean;
    }

    @C12580l
    public final String getFlag() {
        return this.flag;
    }

    @C12580l
    public final BffImageDto getImage() {
        return this.image;
    }

    @C12580l
    public final BffImageDto getImageLarge() {
        return this.imageLarge;
    }

    @C12580l
    public final BffUrlDto getImageLink() {
        return this.imageLink;
    }

    @C12580l
    public final String getLegalMentions() {
        return this.legalMentions;
    }

    @C12580l
    public final List<BffUrlDto> getLinks() {
        return this.links;
    }

    @C12580l
    public final String getLogoType() {
        return this.logoType;
    }

    @C12580l
    public final String getOffer() {
        return this.offer;
    }

    @C12580l
    public final String getOfferColor() {
        return this.offerColor;
    }

    @C12580l
    public final String getOfferPrefix() {
        return this.offerPrefix;
    }

    @C12580l
    public final String getOfferSuffix() {
        return this.offerSuffix;
    }

    @C12580l
    public final String getTextColor() {
        return this.textColor;
    }

    @C12580l
    public final BffTimeTableDto getTimetable() {
        return this.timetable;
    }

    @C12580l
    public final String getTitle() {
        return this.title;
    }

    @C12580l
    public final String getVariant() {
        return this.variant;
    }

    public int hashCode() {
        Integer num = this.contentId;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.design;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logoType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.textColor;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.variant;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.countdown;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.offerColor;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.backgroundColor;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BffUrlDto bffUrlDto = this.cta;
        int hashCode10 = (hashCode9 + (bffUrlDto == null ? 0 : bffUrlDto.hashCode())) * 31;
        BffTimeTableDto bffTimeTableDto = this.timetable;
        int hashCode11 = (hashCode10 + (bffTimeTableDto == null ? 0 : bffTimeTableDto.hashCode())) * 31;
        String str9 = this.description;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.flag;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        BffImageDto bffImageDto = this.imageLarge;
        int hashCode14 = (hashCode13 + (bffImageDto == null ? 0 : bffImageDto.hashCode())) * 31;
        BffImageDto bffImageDto2 = this.image;
        int hashCode15 = (hashCode14 + (bffImageDto2 == null ? 0 : bffImageDto2.hashCode())) * 31;
        BffImageDto bffImageDto3 = this.backgroundImage;
        int hashCode16 = (hashCode15 + (bffImageDto3 == null ? 0 : bffImageDto3.hashCode())) * 31;
        BffImageDto bffImageDto4 = this.backgroundMobileImage;
        int hashCode17 = (hashCode16 + (bffImageDto4 == null ? 0 : bffImageDto4.hashCode())) * 31;
        BffImageDto bffImageDto5 = this.brandLogo;
        int hashCode18 = (hashCode17 + (bffImageDto5 == null ? 0 : bffImageDto5.hashCode())) * 31;
        String str11 = this.legalMentions;
        int hashCode19 = (hashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.ean;
        int hashCode20 = (hashCode19 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.offerPrefix;
        int hashCode21 = (hashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.offer;
        int hashCode22 = (hashCode21 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.offerSuffix;
        int hashCode23 = (hashCode22 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.discountDesign;
        int hashCode24 = (hashCode23 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.discountPrefix;
        int hashCode25 = (hashCode24 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.discount;
        int hashCode26 = (hashCode25 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.discountSuffix;
        int hashCode27 = (hashCode26 + (str19 == null ? 0 : str19.hashCode())) * 31;
        BffUrlDto bffUrlDto2 = this.imageLink;
        int hashCode28 = (hashCode27 + (bffUrlDto2 == null ? 0 : bffUrlDto2.hashCode())) * 31;
        List<BffUrlDto> list = this.links;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode28 + i;
    }

    @C12579k
    public String toString() {
        Integer num = this.contentId;
        String str = this.title;
        String str2 = this.design;
        String str3 = this.logoType;
        String str4 = this.textColor;
        String str5 = this.variant;
        String str6 = this.countdown;
        String str7 = this.offerColor;
        String str8 = this.backgroundColor;
        BffUrlDto bffUrlDto = this.cta;
        BffTimeTableDto bffTimeTableDto = this.timetable;
        String str9 = this.description;
        String str10 = this.flag;
        BffImageDto bffImageDto = this.imageLarge;
        BffImageDto bffImageDto2 = this.image;
        BffImageDto bffImageDto3 = this.backgroundImage;
        BffImageDto bffImageDto4 = this.backgroundMobileImage;
        BffImageDto bffImageDto5 = this.brandLogo;
        String str11 = this.legalMentions;
        String str12 = this.ean;
        String str13 = this.offerPrefix;
        String str14 = this.offer;
        String str15 = this.offerSuffix;
        String str16 = this.discountDesign;
        String str17 = this.discountPrefix;
        String str18 = this.discount;
        String str19 = this.discountSuffix;
        BffUrlDto bffUrlDto2 = this.imageLink;
        List<BffUrlDto> list = this.links;
        return "BffB52SpotlightComponentDtoAllOf(contentId=" + num + ", title=" + str + ", design=" + str2 + ", logoType=" + str3 + ", textColor=" + str4 + ", variant=" + str5 + ", countdown=" + str6 + ", offerColor=" + str7 + ", backgroundColor=" + str8 + ", cta=" + bffUrlDto + ", timetable=" + bffTimeTableDto + ", description=" + str9 + ", flag=" + str10 + ", imageLarge=" + bffImageDto + ", image=" + bffImageDto2 + ", backgroundImage=" + bffImageDto3 + ", backgroundMobileImage=" + bffImageDto4 + ", brandLogo=" + bffImageDto5 + ", legalMentions=" + str11 + ", ean=" + str12 + ", offerPrefix=" + str13 + ", offer=" + str14 + ", offerSuffix=" + str15 + ", discountDesign=" + str16 + ", discountPrefix=" + str17 + ", discount=" + str18 + ", discountSuffix=" + str19 + ", imageLink=" + bffUrlDto2 + ", links=" + list + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffB52SpotlightComponentDtoAllOf(int i, @C12438n("content_id") Integer num, @C12438n("title") String str, @C12438n("design") String str2, @C12438n("logo_type") String str3, @C12438n("text_color") String str4, @C12438n("variant") String str5, @C12438n("countdown") String str6, @C12438n("offer_color") String str7, @C12438n("background_color") String str8, @C12438n("cta") BffUrlDto bffUrlDto, @C12438n("timetable") BffTimeTableDto bffTimeTableDto, @C12438n("description") String str9, @C12438n("flag") String str10, @C12438n("image_large") BffImageDto bffImageDto, @C12438n("image") BffImageDto bffImageDto2, @C12438n("background_image") BffImageDto bffImageDto3, @C12438n("background_mobile_image") BffImageDto bffImageDto4, @C12438n("brand_logo") BffImageDto bffImageDto5, @C12438n("legal_mentions") String str11, @C12438n("ean") String str12, @C12438n("offer_prefix") String str13, @C12438n("offer") String str14, @C12438n("offer_suffix") String str15, @C12438n("discount_design") String str16, @C12438n("discount_prefix") String str17, @C12438n("discount") String str18, @C12438n("discount_suffix") String str19, @C12438n("image_link") BffUrlDto bffUrlDto2, @C12438n("links") List list, C12295n1 n1Var) {
        int i2 = i;
        if ((i2 & 0) != 0) {
            C12261c1.m49256b(i, 0, BffB52SpotlightComponentDtoAllOf$$serializer.INSTANCE.getDescriptor());
        }
        if ((i2 & 1) == 0) {
            this.contentId = null;
        } else {
            this.contentId = num;
        }
        if ((i2 & 2) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i2 & 4) == 0) {
            this.design = null;
        } else {
            this.design = str2;
        }
        if ((i2 & 8) == 0) {
            this.logoType = null;
        } else {
            this.logoType = str3;
        }
        if ((i2 & 16) == 0) {
            this.textColor = null;
        } else {
            this.textColor = str4;
        }
        if ((i2 & 32) == 0) {
            this.variant = null;
        } else {
            this.variant = str5;
        }
        if ((i2 & 64) == 0) {
            this.countdown = null;
        } else {
            this.countdown = str6;
        }
        if ((i2 & 128) == 0) {
            this.offerColor = null;
        } else {
            this.offerColor = str7;
        }
        if ((i2 & 256) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = str8;
        }
        if ((i2 & 512) == 0) {
            this.cta = null;
        } else {
            this.cta = bffUrlDto;
        }
        if ((i2 & 1024) == 0) {
            this.timetable = null;
        } else {
            this.timetable = bffTimeTableDto;
        }
        if ((i2 & 2048) == 0) {
            this.description = null;
        } else {
            this.description = str9;
        }
        if ((i2 & 4096) == 0) {
            this.flag = null;
        } else {
            this.flag = str10;
        }
        if ((i2 & 8192) == 0) {
            this.imageLarge = null;
        } else {
            this.imageLarge = bffImageDto;
        }
        if ((i2 & 16384) == 0) {
            this.image = null;
        } else {
            this.image = bffImageDto2;
        }
        if ((32768 & i2) == 0) {
            this.backgroundImage = null;
        } else {
            this.backgroundImage = bffImageDto3;
        }
        if ((65536 & i2) == 0) {
            this.backgroundMobileImage = null;
        } else {
            this.backgroundMobileImage = bffImageDto4;
        }
        if ((131072 & i2) == 0) {
            this.brandLogo = null;
        } else {
            this.brandLogo = bffImageDto5;
        }
        if ((262144 & i2) == 0) {
            this.legalMentions = null;
        } else {
            this.legalMentions = str11;
        }
        if ((524288 & i2) == 0) {
            this.ean = null;
        } else {
            this.ean = str12;
        }
        if ((1048576 & i2) == 0) {
            this.offerPrefix = null;
        } else {
            this.offerPrefix = str13;
        }
        if ((2097152 & i2) == 0) {
            this.offer = null;
        } else {
            this.offer = str14;
        }
        if ((4194304 & i2) == 0) {
            this.offerSuffix = null;
        } else {
            this.offerSuffix = str15;
        }
        if ((8388608 & i2) == 0) {
            this.discountDesign = null;
        } else {
            this.discountDesign = str16;
        }
        if ((16777216 & i2) == 0) {
            this.discountPrefix = null;
        } else {
            this.discountPrefix = str17;
        }
        if ((33554432 & i2) == 0) {
            this.discount = null;
        } else {
            this.discount = str18;
        }
        if ((67108864 & i2) == 0) {
            this.discountSuffix = null;
        } else {
            this.discountSuffix = str19;
        }
        if ((134217728 & i2) == 0) {
            this.imageLink = null;
        } else {
            this.imageLink = bffUrlDto2;
        }
        if ((i2 & 268435456) == 0) {
            this.links = null;
        } else {
            this.links = list;
        }
    }

    public BffB52SpotlightComponentDtoAllOf(@C12580l Integer num, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l BffUrlDto bffUrlDto, @C12580l BffTimeTableDto bffTimeTableDto, @C12580l String str9, @C12580l String str10, @C12580l BffImageDto bffImageDto, @C12580l BffImageDto bffImageDto2, @C12580l BffImageDto bffImageDto3, @C12580l BffImageDto bffImageDto4, @C12580l BffImageDto bffImageDto5, @C12580l String str11, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l String str16, @C12580l String str17, @C12580l String str18, @C12580l String str19, @C12580l BffUrlDto bffUrlDto2, @C12580l List<BffUrlDto> list) {
        this.contentId = num;
        this.title = str;
        this.design = str2;
        this.logoType = str3;
        this.textColor = str4;
        this.variant = str5;
        this.countdown = str6;
        this.offerColor = str7;
        this.backgroundColor = str8;
        this.cta = bffUrlDto;
        this.timetable = bffTimeTableDto;
        this.description = str9;
        this.flag = str10;
        this.imageLarge = bffImageDto;
        this.image = bffImageDto2;
        this.backgroundImage = bffImageDto3;
        this.backgroundMobileImage = bffImageDto4;
        this.brandLogo = bffImageDto5;
        this.legalMentions = str11;
        this.ean = str12;
        this.offerPrefix = str13;
        this.offer = str14;
        this.offerSuffix = str15;
        this.discountDesign = str16;
        this.discountPrefix = str17;
        this.discount = str18;
        this.discountSuffix = str19;
        this.imageLink = bffUrlDto2;
        this.links = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffB52SpotlightComponentDtoAllOf(java.lang.Integer r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r40, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeTableDto r41, java.lang.String r42, java.lang.String r43, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r44, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r45, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r46, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r47, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r58, java.util.List r59, int r60, kotlin.jvm.internal.DefaultConstructorMarker r61) {
        /*
            r30 = this;
            r0 = r60
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r31
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r32
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r33
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r34
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r35
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r36
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r37
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r38
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r39
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r40
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r41
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r42
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r43
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r44
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r45
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r46
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r47
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r48
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r49
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b0
            r20 = 0
            goto L_0x00b2
        L_0x00b0:
            r20 = r50
        L_0x00b2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = 0
            goto L_0x00bd
        L_0x00bb:
            r21 = r51
        L_0x00bd:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c6
            r22 = 0
            goto L_0x00c8
        L_0x00c6:
            r22 = r52
        L_0x00c8:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d1
            r23 = 0
            goto L_0x00d3
        L_0x00d1:
            r23 = r53
        L_0x00d3:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00dc
            r24 = 0
            goto L_0x00de
        L_0x00dc:
            r24 = r54
        L_0x00de:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00e7
            r25 = 0
            goto L_0x00e9
        L_0x00e7:
            r25 = r55
        L_0x00e9:
            r26 = 33554432(0x2000000, float:9.403955E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00f2
            r26 = 0
            goto L_0x00f4
        L_0x00f2:
            r26 = r56
        L_0x00f4:
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x00fd
            r27 = 0
            goto L_0x00ff
        L_0x00fd:
            r27 = r57
        L_0x00ff:
            r28 = 134217728(0x8000000, float:3.85186E-34)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x0108
            r28 = 0
            goto L_0x010a
        L_0x0108:
            r28 = r58
        L_0x010a:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r0 & r29
            if (r0 == 0) goto L_0x0112
            r0 = 0
            goto L_0x0114
        L_0x0112:
            r0 = r59
        L_0x0114:
            r31 = r30
            r32 = r1
            r33 = r3
            r34 = r4
            r35 = r5
            r36 = r6
            r37 = r7
            r38 = r8
            r39 = r9
            r40 = r10
            r41 = r11
            r42 = r12
            r43 = r13
            r44 = r14
            r45 = r15
            r46 = r2
            r47 = r16
            r48 = r17
            r49 = r18
            r50 = r19
            r51 = r20
            r52 = r21
            r53 = r22
            r54 = r23
            r55 = r24
            r56 = r25
            r57 = r26
            r58 = r27
            r59 = r28
            r60 = r0
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB52SpotlightComponentDtoAllOf.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeTableDto, java.lang.String, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
