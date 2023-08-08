package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.compose.p004ui.graphics.C15307r2;
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
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\ba\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 ~2\u00020\u0001:\u0002~B¡\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0016\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0000\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bx\u0010yBµ\u0002\b\u0017\u0012\u0006\u0010z\u001a\u00020\t\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0001\u00100\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0016\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u0000\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u00106\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00107\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00109\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010<\u001a\u0004\u0018\u00010\f\u0012\b\u0010|\u001a\u0004\u0018\u00010{¢\u0006\u0004\bx\u0010}J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0016HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003Jª\u0002\u0010=\u001a\u00020\u00002\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00162\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u00103\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u00106\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b=\u0010>J\t\u0010?\u001a\u00020\fHÖ\u0001J\t\u0010@\u001a\u00020\tHÖ\u0001J\u0013\u0010B\u001a\u00020\u00192\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010&\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010C\u0012\u0004\bE\u0010F\u001a\u0004\bD\u0010\u000bR\"\u0010'\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010G\u0012\u0004\bJ\u0010F\u001a\u0004\bH\u0010IR\"\u0010(\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010C\u0012\u0004\bL\u0010F\u001a\u0004\bK\u0010\u000bR\"\u0010)\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010G\u0012\u0004\bN\u0010F\u001a\u0004\bM\u0010IR\"\u0010*\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010G\u0012\u0004\bP\u0010F\u001a\u0004\bO\u0010IR\"\u0010+\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010G\u0012\u0004\bR\u0010F\u001a\u0004\bQ\u0010IR\"\u0010,\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010G\u0012\u0004\bT\u0010F\u001a\u0004\bS\u0010IR\"\u0010-\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010G\u0012\u0004\bV\u0010F\u001a\u0004\bU\u0010IR\"\u0010.\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010G\u0012\u0004\bX\u0010F\u001a\u0004\bW\u0010IR\"\u0010/\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010G\u0012\u0004\bZ\u0010F\u001a\u0004\bY\u0010IR(\u00100\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00168\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010[\u0012\u0004\b^\u0010F\u001a\u0004\b\\\u0010]R\"\u00101\u001a\u0004\u0018\u00010\u00008\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010_\u0012\u0004\bb\u0010F\u001a\u0004\b`\u0010aR\"\u00102\u001a\u0004\u0018\u00010\u00198\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010c\u0012\u0004\bd\u0010F\u001a\u0004\b2\u0010\u001bR\"\u00103\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010G\u0012\u0004\bf\u0010F\u001a\u0004\be\u0010IR\"\u00104\u001a\u0004\u0018\u00010\u00198\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u0010c\u0012\u0004\bg\u0010F\u001a\u0004\b4\u0010\u001bR\"\u00105\u001a\u0004\u0018\u00010\u00198\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010c\u0012\u0004\bi\u0010F\u001a\u0004\bh\u0010\u001bR\"\u00106\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u0010G\u0012\u0004\bk\u0010F\u001a\u0004\bj\u0010IR\"\u00107\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u0010G\u0012\u0004\bm\u0010F\u001a\u0004\bl\u0010IR\"\u00108\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u0010G\u0012\u0004\bo\u0010F\u001a\u0004\bn\u0010IR\"\u00109\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u0010G\u0012\u0004\bq\u0010F\u001a\u0004\bp\u0010IR\"\u0010:\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u0010G\u0012\u0004\bs\u0010F\u001a\u0004\br\u0010IR\"\u0010;\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b;\u0010G\u0012\u0004\bu\u0010F\u001a\u0004\bt\u0010IR\"\u0010<\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010G\u0012\u0004\bw\u0010F\u001a\u0004\bv\u0010I¨\u0006\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonCategory;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "()Ljava/lang/Integer;", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "", "component11", "component12", "", "component13", "()Ljava/lang/Boolean;", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "level", "code", "orderNum", "picturePath", "name", "slug", "status", "type", "bffType", "shopId", "subNodes", "subNode", "isNew", "alimentaryType", "isBoutique", "withOrigin", "idPath", "fieldPath", "fieldPathOrigin", "id", "copyOf", "bffId", "bffSearchParam", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonCategory;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonCategory;", "toString", "hashCode", "other", "equals", "Ljava/lang/Integer;", "getLevel", "getLevel$annotations", "()V", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "getCode$annotations", "getOrderNum", "getOrderNum$annotations", "getPicturePath", "getPicturePath$annotations", "getName", "getName$annotations", "getSlug", "getSlug$annotations", "getStatus", "getStatus$annotations", "getType", "getType$annotations", "getBffType", "getBffType$annotations", "getShopId", "getShopId$annotations", "Ljava/util/List;", "getSubNodes", "()Ljava/util/List;", "getSubNodes$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonCategory;", "getSubNode", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonCategory;", "getSubNode$annotations", "Ljava/lang/Boolean;", "isNew$annotations", "getAlimentaryType", "getAlimentaryType$annotations", "isBoutique$annotations", "getWithOrigin", "getWithOrigin$annotations", "getIdPath", "getIdPath$annotations", "getFieldPath", "getFieldPath$annotations", "getFieldPathOrigin", "getFieldPathOrigin$annotations", "getId", "getId$annotations", "getCopyOf", "getCopyOf$annotations", "getBffId", "getBffId$annotations", "getBffSearchParam", "getBffSearchParam$annotations", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonCategory;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonCategory;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffCommonCategory {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, new C12269f(BffCommonCategory$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String alimentaryType;
    @C12580l
    private final String bffId;
    @C12580l
    private final String bffSearchParam;
    @C12580l
    private final String bffType;
    @C12580l
    private final String code;
    @C12580l
    private final String copyOf;
    @C12580l
    private final String fieldPath;
    @C12580l
    private final String fieldPathOrigin;
    @C12580l

    /* renamed from: id */
    private final String f100674id;
    @C12580l
    private final String idPath;
    @C12580l
    private final Boolean isBoutique;
    @C12580l
    private final Boolean isNew;
    @C12580l
    private final Integer level;
    @C12580l
    private final String name;
    @C12580l
    private final Integer orderNum;
    @C12580l
    private final String picturePath;
    @C12580l
    private final String shopId;
    @C12580l
    private final String slug;
    @C12580l
    private final String status;
    @C12580l
    private final BffCommonCategory subNode;
    @C12580l
    private final List<BffCommonCategory> subNodes;
    @C12580l
    private final String type;
    @C12580l
    private final Boolean withOrigin;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonCategory$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonCategory;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffCommonCategory> serializer() {
            return BffCommonCategory$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffCommonCategory() {
        this((Integer) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (BffCommonCategory) null, (Boolean) null, (String) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (int) C15307r2.f37674R0, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffCommonCategory copy$default(BffCommonCategory bffCommonCategory, Integer num, String str, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, BffCommonCategory bffCommonCategory2, Boolean bool, String str9, Boolean bool2, Boolean bool3, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, Object obj) {
        BffCommonCategory bffCommonCategory3 = bffCommonCategory;
        int i2 = i;
        return bffCommonCategory.copy((i2 & 1) != 0 ? bffCommonCategory3.level : num, (i2 & 2) != 0 ? bffCommonCategory3.code : str, (i2 & 4) != 0 ? bffCommonCategory3.orderNum : num2, (i2 & 8) != 0 ? bffCommonCategory3.picturePath : str2, (i2 & 16) != 0 ? bffCommonCategory3.name : str3, (i2 & 32) != 0 ? bffCommonCategory3.slug : str4, (i2 & 64) != 0 ? bffCommonCategory3.status : str5, (i2 & 128) != 0 ? bffCommonCategory3.type : str6, (i2 & 256) != 0 ? bffCommonCategory3.bffType : str7, (i2 & 512) != 0 ? bffCommonCategory3.shopId : str8, (i2 & 1024) != 0 ? bffCommonCategory3.subNodes : list, (i2 & 2048) != 0 ? bffCommonCategory3.subNode : bffCommonCategory2, (i2 & 4096) != 0 ? bffCommonCategory3.isNew : bool, (i2 & 8192) != 0 ? bffCommonCategory3.alimentaryType : str9, (i2 & 16384) != 0 ? bffCommonCategory3.isBoutique : bool2, (i2 & 32768) != 0 ? bffCommonCategory3.withOrigin : bool3, (i2 & 65536) != 0 ? bffCommonCategory3.idPath : str10, (i2 & 131072) != 0 ? bffCommonCategory3.fieldPath : str11, (i2 & 262144) != 0 ? bffCommonCategory3.fieldPathOrigin : str12, (i2 & 524288) != 0 ? bffCommonCategory3.f100674id : str13, (i2 & 1048576) != 0 ? bffCommonCategory3.copyOf : str14, (i2 & 2097152) != 0 ? bffCommonCategory3.bffId : str15, (i2 & 4194304) != 0 ? bffCommonCategory3.bffSearchParam : str16);
    }

    @C12438n("alimentary_type")
    public static /* synthetic */ void getAlimentaryType$annotations() {
    }

    @C12438n("bff_id")
    public static /* synthetic */ void getBffId$annotations() {
    }

    @C12438n("bff_search_param")
    public static /* synthetic */ void getBffSearchParam$annotations() {
    }

    @C12438n("bff_type")
    public static /* synthetic */ void getBffType$annotations() {
    }

    @C12438n("code")
    public static /* synthetic */ void getCode$annotations() {
    }

    @C12438n("copy_of")
    public static /* synthetic */ void getCopyOf$annotations() {
    }

    @C12438n("fieldPath")
    public static /* synthetic */ void getFieldPath$annotations() {
    }

    @C12438n("field_path_origin")
    public static /* synthetic */ void getFieldPathOrigin$annotations() {
    }

    @C12438n("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @C12438n("id_path")
    public static /* synthetic */ void getIdPath$annotations() {
    }

    @C12438n("level")
    public static /* synthetic */ void getLevel$annotations() {
    }

    @C12438n("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @C12438n("order_num")
    public static /* synthetic */ void getOrderNum$annotations() {
    }

    @C12438n("picture_path")
    public static /* synthetic */ void getPicturePath$annotations() {
    }

    @C12438n("shop_id")
    public static /* synthetic */ void getShopId$annotations() {
    }

    @C12438n("slug")
    public static /* synthetic */ void getSlug$annotations() {
    }

    @C12438n("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @C12438n("sub_node")
    public static /* synthetic */ void getSubNode$annotations() {
    }

    @C12438n("sub_nodes")
    public static /* synthetic */ void getSubNodes$annotations() {
    }

    @C12438n("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @C12438n("with_origin")
    public static /* synthetic */ void getWithOrigin$annotations() {
    }

    @C12438n("is_boutique")
    public static /* synthetic */ void isBoutique$annotations() {
    }

    @C12438n("is_new")
    public static /* synthetic */ void isNew$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffCommonCategory bffCommonCategory, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffCommonCategory.level != null) {
            dVar.mo24912i(fVar, 0, C12276h0.f30067a, bffCommonCategory.level);
        }
        if (dVar.mo24897A(fVar, 1) || bffCommonCategory.code != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffCommonCategory.code);
        }
        if (dVar.mo24897A(fVar, 2) || bffCommonCategory.orderNum != null) {
            dVar.mo24912i(fVar, 2, C12276h0.f30067a, bffCommonCategory.orderNum);
        }
        if (dVar.mo24897A(fVar, 3) || bffCommonCategory.picturePath != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffCommonCategory.picturePath);
        }
        if (dVar.mo24897A(fVar, 4) || bffCommonCategory.name != null) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffCommonCategory.name);
        }
        if (dVar.mo24897A(fVar, 5) || bffCommonCategory.slug != null) {
            dVar.mo24912i(fVar, 5, C12310s1.f30117a, bffCommonCategory.slug);
        }
        if (dVar.mo24897A(fVar, 6) || bffCommonCategory.status != null) {
            dVar.mo24912i(fVar, 6, C12310s1.f30117a, bffCommonCategory.status);
        }
        if (dVar.mo24897A(fVar, 7) || bffCommonCategory.type != null) {
            dVar.mo24912i(fVar, 7, C12310s1.f30117a, bffCommonCategory.type);
        }
        if (dVar.mo24897A(fVar, 8) || bffCommonCategory.bffType != null) {
            dVar.mo24912i(fVar, 8, C12310s1.f30117a, bffCommonCategory.bffType);
        }
        if (dVar.mo24897A(fVar, 9) || bffCommonCategory.shopId != null) {
            dVar.mo24912i(fVar, 9, C12310s1.f30117a, bffCommonCategory.shopId);
        }
        if (dVar.mo24897A(fVar, 10) || bffCommonCategory.subNodes != null) {
            dVar.mo24912i(fVar, 10, gVarArr[10], bffCommonCategory.subNodes);
        }
        if (dVar.mo24897A(fVar, 11) || bffCommonCategory.subNode != null) {
            dVar.mo24912i(fVar, 11, BffCommonCategory$$serializer.INSTANCE, bffCommonCategory.subNode);
        }
        if (dVar.mo24897A(fVar, 12) || bffCommonCategory.isNew != null) {
            dVar.mo24912i(fVar, 12, C12278i.f30070a, bffCommonCategory.isNew);
        }
        if (dVar.mo24897A(fVar, 13) || bffCommonCategory.alimentaryType != null) {
            dVar.mo24912i(fVar, 13, C12310s1.f30117a, bffCommonCategory.alimentaryType);
        }
        if (dVar.mo24897A(fVar, 14) || bffCommonCategory.isBoutique != null) {
            dVar.mo24912i(fVar, 14, C12278i.f30070a, bffCommonCategory.isBoutique);
        }
        if (dVar.mo24897A(fVar, 15) || bffCommonCategory.withOrigin != null) {
            dVar.mo24912i(fVar, 15, C12278i.f30070a, bffCommonCategory.withOrigin);
        }
        if (dVar.mo24897A(fVar, 16) || bffCommonCategory.idPath != null) {
            dVar.mo24912i(fVar, 16, C12310s1.f30117a, bffCommonCategory.idPath);
        }
        if (dVar.mo24897A(fVar, 17) || bffCommonCategory.fieldPath != null) {
            dVar.mo24912i(fVar, 17, C12310s1.f30117a, bffCommonCategory.fieldPath);
        }
        if (dVar.mo24897A(fVar, 18) || bffCommonCategory.fieldPathOrigin != null) {
            dVar.mo24912i(fVar, 18, C12310s1.f30117a, bffCommonCategory.fieldPathOrigin);
        }
        if (dVar.mo24897A(fVar, 19) || bffCommonCategory.f100674id != null) {
            dVar.mo24912i(fVar, 19, C12310s1.f30117a, bffCommonCategory.f100674id);
        }
        if (dVar.mo24897A(fVar, 20) || bffCommonCategory.copyOf != null) {
            dVar.mo24912i(fVar, 20, C12310s1.f30117a, bffCommonCategory.copyOf);
        }
        if (dVar.mo24897A(fVar, 21) || bffCommonCategory.bffId != null) {
            dVar.mo24912i(fVar, 21, C12310s1.f30117a, bffCommonCategory.bffId);
        }
        if (dVar.mo24897A(fVar, 22) || bffCommonCategory.bffSearchParam != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 22, C12310s1.f30117a, bffCommonCategory.bffSearchParam);
        }
    }

    @C12580l
    public final Integer component1() {
        return this.level;
    }

    @C12580l
    public final String component10() {
        return this.shopId;
    }

    @C12580l
    public final List<BffCommonCategory> component11() {
        return this.subNodes;
    }

    @C12580l
    public final BffCommonCategory component12() {
        return this.subNode;
    }

    @C12580l
    public final Boolean component13() {
        return this.isNew;
    }

    @C12580l
    public final String component14() {
        return this.alimentaryType;
    }

    @C12580l
    public final Boolean component15() {
        return this.isBoutique;
    }

    @C12580l
    public final Boolean component16() {
        return this.withOrigin;
    }

    @C12580l
    public final String component17() {
        return this.idPath;
    }

    @C12580l
    public final String component18() {
        return this.fieldPath;
    }

    @C12580l
    public final String component19() {
        return this.fieldPathOrigin;
    }

    @C12580l
    public final String component2() {
        return this.code;
    }

    @C12580l
    public final String component20() {
        return this.f100674id;
    }

    @C12580l
    public final String component21() {
        return this.copyOf;
    }

    @C12580l
    public final String component22() {
        return this.bffId;
    }

    @C12580l
    public final String component23() {
        return this.bffSearchParam;
    }

    @C12580l
    public final Integer component3() {
        return this.orderNum;
    }

    @C12580l
    public final String component4() {
        return this.picturePath;
    }

    @C12580l
    public final String component5() {
        return this.name;
    }

    @C12580l
    public final String component6() {
        return this.slug;
    }

    @C12580l
    public final String component7() {
        return this.status;
    }

    @C12580l
    public final String component8() {
        return this.type;
    }

    @C12580l
    public final String component9() {
        return this.bffType;
    }

    @C12579k
    public final BffCommonCategory copy(@C12580l Integer num, @C12580l String str, @C12580l Integer num2, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l List<BffCommonCategory> list, @C12580l BffCommonCategory bffCommonCategory, @C12580l Boolean bool, @C12580l String str9, @C12580l Boolean bool2, @C12580l Boolean bool3, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l String str16) {
        return new BffCommonCategory(num, str, num2, str2, str3, str4, str5, str6, str7, str8, list, bffCommonCategory, bool, str9, bool2, bool3, str10, str11, str12, str13, str14, str15, str16);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffCommonCategory)) {
            return false;
        }
        BffCommonCategory bffCommonCategory = (BffCommonCategory) obj;
        return Intrinsics.areEqual((Object) this.level, (Object) bffCommonCategory.level) && Intrinsics.areEqual((Object) this.code, (Object) bffCommonCategory.code) && Intrinsics.areEqual((Object) this.orderNum, (Object) bffCommonCategory.orderNum) && Intrinsics.areEqual((Object) this.picturePath, (Object) bffCommonCategory.picturePath) && Intrinsics.areEqual((Object) this.name, (Object) bffCommonCategory.name) && Intrinsics.areEqual((Object) this.slug, (Object) bffCommonCategory.slug) && Intrinsics.areEqual((Object) this.status, (Object) bffCommonCategory.status) && Intrinsics.areEqual((Object) this.type, (Object) bffCommonCategory.type) && Intrinsics.areEqual((Object) this.bffType, (Object) bffCommonCategory.bffType) && Intrinsics.areEqual((Object) this.shopId, (Object) bffCommonCategory.shopId) && Intrinsics.areEqual((Object) this.subNodes, (Object) bffCommonCategory.subNodes) && Intrinsics.areEqual((Object) this.subNode, (Object) bffCommonCategory.subNode) && Intrinsics.areEqual((Object) this.isNew, (Object) bffCommonCategory.isNew) && Intrinsics.areEqual((Object) this.alimentaryType, (Object) bffCommonCategory.alimentaryType) && Intrinsics.areEqual((Object) this.isBoutique, (Object) bffCommonCategory.isBoutique) && Intrinsics.areEqual((Object) this.withOrigin, (Object) bffCommonCategory.withOrigin) && Intrinsics.areEqual((Object) this.idPath, (Object) bffCommonCategory.idPath) && Intrinsics.areEqual((Object) this.fieldPath, (Object) bffCommonCategory.fieldPath) && Intrinsics.areEqual((Object) this.fieldPathOrigin, (Object) bffCommonCategory.fieldPathOrigin) && Intrinsics.areEqual((Object) this.f100674id, (Object) bffCommonCategory.f100674id) && Intrinsics.areEqual((Object) this.copyOf, (Object) bffCommonCategory.copyOf) && Intrinsics.areEqual((Object) this.bffId, (Object) bffCommonCategory.bffId) && Intrinsics.areEqual((Object) this.bffSearchParam, (Object) bffCommonCategory.bffSearchParam);
    }

    @C12580l
    public final String getAlimentaryType() {
        return this.alimentaryType;
    }

    @C12580l
    public final String getBffId() {
        return this.bffId;
    }

    @C12580l
    public final String getBffSearchParam() {
        return this.bffSearchParam;
    }

    @C12580l
    public final String getBffType() {
        return this.bffType;
    }

    @C12580l
    public final String getCode() {
        return this.code;
    }

    @C12580l
    public final String getCopyOf() {
        return this.copyOf;
    }

    @C12580l
    public final String getFieldPath() {
        return this.fieldPath;
    }

    @C12580l
    public final String getFieldPathOrigin() {
        return this.fieldPathOrigin;
    }

    @C12580l
    public final String getId() {
        return this.f100674id;
    }

    @C12580l
    public final String getIdPath() {
        return this.idPath;
    }

    @C12580l
    public final Integer getLevel() {
        return this.level;
    }

    @C12580l
    public final String getName() {
        return this.name;
    }

    @C12580l
    public final Integer getOrderNum() {
        return this.orderNum;
    }

    @C12580l
    public final String getPicturePath() {
        return this.picturePath;
    }

    @C12580l
    public final String getShopId() {
        return this.shopId;
    }

    @C12580l
    public final String getSlug() {
        return this.slug;
    }

    @C12580l
    public final String getStatus() {
        return this.status;
    }

    @C12580l
    public final BffCommonCategory getSubNode() {
        return this.subNode;
    }

    @C12580l
    public final List<BffCommonCategory> getSubNodes() {
        return this.subNodes;
    }

    @C12580l
    public final String getType() {
        return this.type;
    }

    @C12580l
    public final Boolean getWithOrigin() {
        return this.withOrigin;
    }

    public int hashCode() {
        Integer num = this.level;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.code;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.orderNum;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.picturePath;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.slug;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.status;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.type;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.bffType;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.shopId;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<BffCommonCategory> list = this.subNodes;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        BffCommonCategory bffCommonCategory = this.subNode;
        int hashCode12 = (hashCode11 + (bffCommonCategory == null ? 0 : bffCommonCategory.hashCode())) * 31;
        Boolean bool = this.isNew;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.alimentaryType;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool2 = this.isBoutique;
        int hashCode15 = (hashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.withOrigin;
        int hashCode16 = (hashCode15 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str10 = this.idPath;
        int hashCode17 = (hashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.fieldPath;
        int hashCode18 = (hashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.fieldPathOrigin;
        int hashCode19 = (hashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f100674id;
        int hashCode20 = (hashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.copyOf;
        int hashCode21 = (hashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.bffId;
        int hashCode22 = (hashCode21 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.bffSearchParam;
        if (str16 != null) {
            i = str16.hashCode();
        }
        return hashCode22 + i;
    }

    @C12580l
    public final Boolean isBoutique() {
        return this.isBoutique;
    }

    @C12580l
    public final Boolean isNew() {
        return this.isNew;
    }

    @C12579k
    public String toString() {
        Integer num = this.level;
        String str = this.code;
        Integer num2 = this.orderNum;
        String str2 = this.picturePath;
        String str3 = this.name;
        String str4 = this.slug;
        String str5 = this.status;
        String str6 = this.type;
        String str7 = this.bffType;
        String str8 = this.shopId;
        List<BffCommonCategory> list = this.subNodes;
        BffCommonCategory bffCommonCategory = this.subNode;
        Boolean bool = this.isNew;
        String str9 = this.alimentaryType;
        Boolean bool2 = this.isBoutique;
        Boolean bool3 = this.withOrigin;
        String str10 = this.idPath;
        String str11 = this.fieldPath;
        String str12 = this.fieldPathOrigin;
        String str13 = this.f100674id;
        String str14 = this.copyOf;
        String str15 = this.bffId;
        String str16 = this.bffSearchParam;
        return "BffCommonCategory(level=" + num + ", code=" + str + ", orderNum=" + num2 + ", picturePath=" + str2 + ", name=" + str3 + ", slug=" + str4 + ", status=" + str5 + ", type=" + str6 + ", bffType=" + str7 + ", shopId=" + str8 + ", subNodes=" + list + ", subNode=" + bffCommonCategory + ", isNew=" + bool + ", alimentaryType=" + str9 + ", isBoutique=" + bool2 + ", withOrigin=" + bool3 + ", idPath=" + str10 + ", fieldPath=" + str11 + ", fieldPathOrigin=" + str12 + ", id=" + str13 + ", copyOf=" + str14 + ", bffId=" + str15 + ", bffSearchParam=" + str16 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffCommonCategory(int i, @C12438n("level") Integer num, @C12438n("code") String str, @C12438n("order_num") Integer num2, @C12438n("picture_path") String str2, @C12438n("name") String str3, @C12438n("slug") String str4, @C12438n("status") String str5, @C12438n("type") String str6, @C12438n("bff_type") String str7, @C12438n("shop_id") String str8, @C12438n("sub_nodes") List list, @C12438n("sub_node") BffCommonCategory bffCommonCategory, @C12438n("is_new") Boolean bool, @C12438n("alimentary_type") String str9, @C12438n("is_boutique") Boolean bool2, @C12438n("with_origin") Boolean bool3, @C12438n("id_path") String str10, @C12438n("fieldPath") String str11, @C12438n("field_path_origin") String str12, @C12438n("id") String str13, @C12438n("copy_of") String str14, @C12438n("bff_id") String str15, @C12438n("bff_search_param") String str16, C12295n1 n1Var) {
        int i2 = i;
        if ((i2 & 0) != 0) {
            C12261c1.m49256b(i, 0, BffCommonCategory$$serializer.INSTANCE.getDescriptor());
        }
        if ((i2 & 1) == 0) {
            this.level = null;
        } else {
            this.level = num;
        }
        if ((i2 & 2) == 0) {
            this.code = null;
        } else {
            this.code = str;
        }
        if ((i2 & 4) == 0) {
            this.orderNum = null;
        } else {
            this.orderNum = num2;
        }
        if ((i2 & 8) == 0) {
            this.picturePath = null;
        } else {
            this.picturePath = str2;
        }
        if ((i2 & 16) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        if ((i2 & 32) == 0) {
            this.slug = null;
        } else {
            this.slug = str4;
        }
        if ((i2 & 64) == 0) {
            this.status = null;
        } else {
            this.status = str5;
        }
        if ((i2 & 128) == 0) {
            this.type = null;
        } else {
            this.type = str6;
        }
        if ((i2 & 256) == 0) {
            this.bffType = null;
        } else {
            this.bffType = str7;
        }
        if ((i2 & 512) == 0) {
            this.shopId = null;
        } else {
            this.shopId = str8;
        }
        if ((i2 & 1024) == 0) {
            this.subNodes = null;
        } else {
            this.subNodes = list;
        }
        if ((i2 & 2048) == 0) {
            this.subNode = null;
        } else {
            this.subNode = bffCommonCategory;
        }
        if ((i2 & 4096) == 0) {
            this.isNew = null;
        } else {
            this.isNew = bool;
        }
        if ((i2 & 8192) == 0) {
            this.alimentaryType = null;
        } else {
            this.alimentaryType = str9;
        }
        if ((i2 & 16384) == 0) {
            this.isBoutique = null;
        } else {
            this.isBoutique = bool2;
        }
        if ((32768 & i2) == 0) {
            this.withOrigin = null;
        } else {
            this.withOrigin = bool3;
        }
        if ((65536 & i2) == 0) {
            this.idPath = null;
        } else {
            this.idPath = str10;
        }
        if ((131072 & i2) == 0) {
            this.fieldPath = null;
        } else {
            this.fieldPath = str11;
        }
        if ((262144 & i2) == 0) {
            this.fieldPathOrigin = null;
        } else {
            this.fieldPathOrigin = str12;
        }
        if ((524288 & i2) == 0) {
            this.f100674id = null;
        } else {
            this.f100674id = str13;
        }
        if ((1048576 & i2) == 0) {
            this.copyOf = null;
        } else {
            this.copyOf = str14;
        }
        if ((2097152 & i2) == 0) {
            this.bffId = null;
        } else {
            this.bffId = str15;
        }
        if ((i2 & 4194304) == 0) {
            this.bffSearchParam = null;
        } else {
            this.bffSearchParam = str16;
        }
    }

    public BffCommonCategory(@C12580l Integer num, @C12580l String str, @C12580l Integer num2, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l List<BffCommonCategory> list, @C12580l BffCommonCategory bffCommonCategory, @C12580l Boolean bool, @C12580l String str9, @C12580l Boolean bool2, @C12580l Boolean bool3, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l String str16) {
        this.level = num;
        this.code = str;
        this.orderNum = num2;
        this.picturePath = str2;
        this.name = str3;
        this.slug = str4;
        this.status = str5;
        this.type = str6;
        this.bffType = str7;
        this.shopId = str8;
        this.subNodes = list;
        this.subNode = bffCommonCategory;
        this.isNew = bool;
        this.alimentaryType = str9;
        this.isBoutique = bool2;
        this.withOrigin = bool3;
        this.idPath = str10;
        this.fieldPath = str11;
        this.fieldPathOrigin = str12;
        this.f100674id = str13;
        this.copyOf = str14;
        this.bffId = str15;
        this.bffSearchParam = str16;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffCommonCategory(java.lang.Integer r25, java.lang.String r26, java.lang.Integer r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.util.List r35, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonCategory r36, java.lang.Boolean r37, java.lang.String r38, java.lang.Boolean r39, java.lang.Boolean r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, int r48, kotlin.jvm.internal.DefaultConstructorMarker r49) {
        /*
            r24 = this;
            r0 = r48
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r25
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r26
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r27
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r28
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r29
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r30
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r31
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r32
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r33
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r34
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r35
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r36
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r37
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r38
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r39
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r40
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r41
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r42
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r43
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b0
            r20 = 0
            goto L_0x00b2
        L_0x00b0:
            r20 = r44
        L_0x00b2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = 0
            goto L_0x00bd
        L_0x00bb:
            r21 = r45
        L_0x00bd:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c6
            r22 = 0
            goto L_0x00c8
        L_0x00c6:
            r22 = r46
        L_0x00c8:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r23
            if (r0 == 0) goto L_0x00d0
            r0 = 0
            goto L_0x00d2
        L_0x00d0:
            r0 = r47
        L_0x00d2:
            r25 = r24
            r26 = r1
            r27 = r3
            r28 = r4
            r29 = r5
            r30 = r6
            r31 = r7
            r32 = r8
            r33 = r9
            r34 = r10
            r35 = r11
            r36 = r12
            r37 = r13
            r38 = r14
            r39 = r15
            r40 = r2
            r41 = r16
            r42 = r17
            r43 = r18
            r44 = r19
            r45 = r20
            r46 = r21
            r47 = r22
            r48 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonCategory.<init>(java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonCategory, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
