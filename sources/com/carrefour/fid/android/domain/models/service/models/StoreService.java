package com.carrefour.fid.android.domain.models.service.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C8698y1;
import com.carrefour.fid.android.domain.models.service.models.DeliveryFee;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.urbanairship.util.C9647e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12269f;
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12439o
@C11076d0(mo22515d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u0000 \u00012\u00020\u0001:\u0002O\nB \u0002\u0012\b\b\u0002\u0010)\u001a\u00020\t\u0012\b\b\u0002\u0010*\u001a\u00020\t\u0012\b\b\u0002\u0010+\u001a\u00020\t\u0012\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\b\u0002\u0010-\u001a\u00020\t\u0012\b\b\u0002\u0010.\u001a\u00020\t\u0012\b\b\u0002\u0010/\u001a\u00020\t\u0012\b\b\u0002\u00100\u001a\u00020\t\u0012\b\b\u0002\u00101\u001a\u00020\u000e\u0012\b\b\u0002\u00102\u001a\u00020\t\u0012\b\b\u0002\u00103\u001a\u00020\t\u0012\b\b\u0002\u00104\u001a\u00020\t\u0012\b\b\u0002\u00105\u001a\u00020\t\u0012\b\b\u0002\u00106\u001a\u00020\t\u0012\b\b\u0002\u00107\u001a\u00020\t\u0012\b\b\u0002\u00108\u001a\u00020\t\u0012\b\b\u0002\u00109\u001a\u00020\t\u0012\b\b\u0002\u0010:\u001a\u00020\t\u0012\b\b\u0002\u0010;\u001a\u00020\u000e\u0012\b\b\u0002\u0010<\u001a\u00020\u000e\u0012\b\b\u0002\u0010=\u001a\u00020\u000e\u0012\b\b\u0002\u0010>\u001a\u00020\u000e\u0012\u000f\b\u0002\u0010?\u001a\t\u0018\u00010\"¢\u0006\u0002\b#\u0012\b\b\u0002\u0010@\u001a\u00020\u000e\u0012\b\b\u0002\u0010A\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010B\u001a\b\u0012\u0004\u0012\u00020'0\r¢\u0006\u0004\b~\u0010B¦\u0002\b\u0017\u0012\u0007\u0010\u0001\u001a\u00020E\u0012\b\u0010)\u001a\u0004\u0018\u00010\t\u0012\b\u0010*\u001a\u0004\u0018\u00010\t\u0012\b\u0010+\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010-\u001a\u0004\u0018\u00010\t\u0012\b\u0010.\u001a\u0004\u0018\u00010\t\u0012\b\u0010/\u001a\u0004\u0018\u00010\t\u0012\b\u00100\u001a\u0004\u0018\u00010\t\u0012\u0006\u00101\u001a\u00020\u000e\u0012\b\u00102\u001a\u0004\u0018\u00010\t\u0012\b\u00103\u001a\u0004\u0018\u00010\t\u0012\b\u00104\u001a\u0004\u0018\u00010\t\u0012\b\u00105\u001a\u0004\u0018\u00010\t\u0012\b\u00106\u001a\u0004\u0018\u00010\t\u0012\b\u00107\u001a\u0004\u0018\u00010\t\u0012\b\u00108\u001a\u0004\u0018\u00010\t\u0012\b\u00109\u001a\u0004\u0018\u00010\t\u0012\b\u0010:\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010;\u001a\u00020\u000e\u0012\u0006\u0010<\u001a\u00020\u000e\u0012\u0006\u0010=\u001a\u00020\u000e\u0012\u0006\u0010>\u001a\u00020\u000e\u0012\r\u0010?\u001a\t\u0018\u00010\"¢\u0006\u0002\b#\u0012\u0006\u0010@\u001a\u00020\u000e\u0012\u0006\u0010A\u001a\u00020\u000e\u0012\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\r\u0012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0005\b~\u0010\u0001J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\tHÆ\u0003J\t\u0010\u0011\u001a\u00020\tHÆ\u0003J\t\u0010\u0012\u001a\u00020\tHÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J\t\u0010\u0014\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000eHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000eHÆ\u0003J\t\u0010 \u001a\u00020\u000eHÆ\u0003J\t\u0010!\u001a\u00020\u000eHÆ\u0003J\u0010\u0010$\u001a\t\u0018\u00010\"¢\u0006\u0002\b#HÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\rHÆ\u0003J¢\u0002\u0010C\u001a\u00020\u00002\b\b\u0002\u0010)\u001a\u00020\t2\b\b\u0002\u0010*\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020\t2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\b\u0002\u0010-\u001a\u00020\t2\b\b\u0002\u0010.\u001a\u00020\t2\b\b\u0002\u0010/\u001a\u00020\t2\b\b\u0002\u00100\u001a\u00020\t2\b\b\u0002\u00101\u001a\u00020\u000e2\b\b\u0002\u00102\u001a\u00020\t2\b\b\u0002\u00103\u001a\u00020\t2\b\b\u0002\u00104\u001a\u00020\t2\b\b\u0002\u00105\u001a\u00020\t2\b\b\u0002\u00106\u001a\u00020\t2\b\b\u0002\u00107\u001a\u00020\t2\b\b\u0002\u00108\u001a\u00020\t2\b\b\u0002\u00109\u001a\u00020\t2\b\b\u0002\u0010:\u001a\u00020\t2\b\b\u0002\u0010;\u001a\u00020\u000e2\b\b\u0002\u0010<\u001a\u00020\u000e2\b\b\u0002\u0010=\u001a\u00020\u000e2\b\b\u0002\u0010>\u001a\u00020\u000e2\u000f\b\u0002\u0010?\u001a\t\u0018\u00010\"¢\u0006\u0002\b#2\b\b\u0002\u0010@\u001a\u00020\u000e2\b\b\u0002\u0010A\u001a\u00020\u000e2\u000e\b\u0002\u0010B\u001a\b\u0012\u0004\u0012\u00020'0\rHÆ\u0001J\t\u0010D\u001a\u00020\tHÖ\u0001J\t\u0010F\u001a\u00020EHÖ\u0001J\u0013\u0010I\u001a\u00020\u000e2\b\u0010H\u001a\u0004\u0018\u00010GHÖ\u0003J\t\u0010J\u001a\u00020EHÖ\u0001J\u0019\u0010N\u001a\u00020\u00072\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020EHÖ\u0001R\u0017\u0010)\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010*\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010P\u001a\u0004\bS\u0010RR\u0017\u0010+\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010P\u001a\u0004\bT\u0010RR\u001f\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0016\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010-\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010P\u001a\u0004\bX\u0010RR\u0017\u0010.\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010P\u001a\u0004\bY\u0010RR\u0017\u0010/\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010P\u001a\u0004\bZ\u0010RR\u0017\u00100\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010P\u001a\u0004\b[\u0010RR\u0017\u00101\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\\\u001a\u0004\b]\u0010^R\u0017\u00102\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010P\u001a\u0004\b_\u0010RR\u0017\u00103\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010P\u001a\u0004\b`\u0010RR\u0017\u00104\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010P\u001a\u0004\ba\u0010RR\u0017\u00105\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\ba\u0010P\u001a\u0004\bb\u0010RR\u0017\u00106\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bX\u0010P\u001a\u0004\bc\u0010RR\u0017\u00107\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\\\u0010P\u001a\u0004\bd\u0010RR\u0017\u00108\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\be\u0010P\u001a\u0004\bf\u0010RR\u0017\u00109\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bg\u0010P\u001a\u0004\bh\u0010RR\u0017\u0010:\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bi\u0010P\u001a\u0004\bj\u0010RR\u0017\u0010;\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bk\u0010\\\u001a\u0004\bl\u0010^R\u0017\u0010<\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bm\u0010\\\u001a\u0004\bn\u0010^R\u0017\u0010=\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bo\u0010\\\u001a\u0004\bp\u0010^R\u0017\u0010>\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bq\u0010\\\u001a\u0004\b\\\u0010^R\u001e\u0010?\u001a\t\u0018\u00010\"¢\u0006\u0002\b#8\u0006¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u0017\u0010@\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bv\u0010\\\u001a\u0004\bw\u0010^R\u0017\u0010A\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bx\u0010\\\u001a\u0004\by\u0010^R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020'0\r8\u0006¢\u0006\f\n\u0004\bz\u0010U\u001a\u0004\b{\u0010WR\u0011\u0010}\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b|\u0010^¨\u0006\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/service/models/StoreService;", "Landroid/os/Parcelable;", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "e0", "", "b", "m", "u", "", "", "v", "w", "x", "y", "z", "A", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "n", "o", "p", "Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType;", "Lkotlinx/parcelize/e;", "q", "r", "s", "Lcom/carrefour/fid/android/domain/models/service/models/DeliveryFee;", "t", "serviceId", "name", "label", "passDays", "wording", "description", "weight", "category", "isOpen", "type", "format", "wlecService", "facilityServiceId", "minefiCode", "metiReference", "openingDate", "url", "minOrderAmount", "paymentOnSiteActivated", "isLoyaltyActivated", "returnableShoppingBag", "yieldEligible", "serviceType", "isExpress", "isMirror", "deliveryFees", "B", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "a", "Ljava/lang/String;", "S", "()Ljava/lang/String;", "N", "J", "Ljava/util/List;", "P", "()Ljava/util/List;", "Y", "F", "W", "D", "Z", "d0", "()Z", "U", "H", "X", "G", "M", "K", "E0", "O", "F0", "V", "G0", "L", "H0", "Q", "I0", "b0", "J0", "R", "K0", "L0", "Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType;", "T", "()Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType;", "M0", "a0", "N0", "c0", "O0", "E", "I", "hasFeesCorrectValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLcom/carrefour/fid/android/domain/models/service/models/StoreServiceType;ZZLjava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLcom/carrefour/fid/android/domain/models/service/models/StoreServiceType;ZZLjava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nStoreService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreService.kt\ncom/carrefour/fid/android/domain/models/service/models/StoreService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1726#2,3:53\n*S KotlinDebug\n*F\n+ 1 StoreService.kt\ncom/carrefour/fid/android/domain/models/service/models/StoreService\n*L\n46#1:53,3\n*E\n"})
@C12187d
public final class StoreService implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<StoreService> CREATOR = new C38138c();
    @C12579k
    public static final C38137b Companion = new C38137b((DefaultConstructorMarker) null);
    @C12579k
    @C11287e

    /* renamed from: P0 */
    public static final C12248g<Object>[] f96588P0 = {0, 0, 0, new C12269f(C12278i.f30070a), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, StoreServiceType.Companion.serializer(), 0, 0, new C12269f(DeliveryFee.C38125a.f96566a)};
    @C12579k

    /* renamed from: E0 */
    public final String f96589E0;
    @C12579k

    /* renamed from: F0 */
    public final String f96590F0;
    @C12579k

    /* renamed from: G0 */
    public final String f96591G0;

    /* renamed from: H0 */
    public final boolean f96592H0;

    /* renamed from: I0 */
    public final boolean f96593I0;

    /* renamed from: J0 */
    public final boolean f96594J0;

    /* renamed from: K0 */
    public final boolean f96595K0;
    @C12580l

    /* renamed from: L0 */
    public final StoreServiceType f96596L0;

    /* renamed from: M0 */
    public final boolean f96597M0;

    /* renamed from: N0 */
    public final boolean f96598N0;
    @C12579k

    /* renamed from: O0 */
    public final List<DeliveryFee> f96599O0;
    @C12579k

    /* renamed from: X */
    public final String f96600X;
    @C12579k

    /* renamed from: Y */
    public final String f96601Y;
    @C12579k

    /* renamed from: Z */
    public final String f96602Z;
    @C12579k

    /* renamed from: a */
    public final String f96603a;
    @C12579k

    /* renamed from: b */
    public final String f96604b;
    @C12579k

    /* renamed from: c */
    public final String f96605c;
    @C12580l

    /* renamed from: d */
    public final List<Boolean> f96606d;
    @C12579k

    /* renamed from: e */
    public final String f96607e;
    @C12579k

    /* renamed from: f */
    public final String f96608f;
    @C12579k

    /* renamed from: g */
    public final String f96609g;
    @C12579k

    /* renamed from: v */
    public final String f96610v;

    /* renamed from: w */
    public final boolean f96611w;
    @C12579k

    /* renamed from: x */
    public final String f96612x;
    @C12579k

    /* renamed from: y */
    public final String f96613y;
    @C12579k

    /* renamed from: z */
    public final String f96614z;

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    /* renamed from: com.carrefour.fid.android.domain.models.service.models.StoreService$a */
    public static final class C38136a implements C12327y<StoreService> {
        @C12579k

        /* renamed from: a */
        public static final C38136a f96615a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f96616b;

        static {
            C38136a aVar = new C38136a();
            f96615a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.domain.models.service.models.StoreService", aVar, 26);
            pluginGeneratedSerialDescriptor.mo24966k("serviceId", true);
            pluginGeneratedSerialDescriptor.mo24966k("name", true);
            pluginGeneratedSerialDescriptor.mo24966k("label", true);
            pluginGeneratedSerialDescriptor.mo24966k("passDays", true);
            pluginGeneratedSerialDescriptor.mo24966k("wording", true);
            pluginGeneratedSerialDescriptor.mo24966k("description", true);
            pluginGeneratedSerialDescriptor.mo24966k("weight", true);
            pluginGeneratedSerialDescriptor.mo24966k("category", true);
            pluginGeneratedSerialDescriptor.mo24966k("isOpen", true);
            pluginGeneratedSerialDescriptor.mo24966k("type", true);
            pluginGeneratedSerialDescriptor.mo24966k("format", true);
            pluginGeneratedSerialDescriptor.mo24966k("wlecService", true);
            pluginGeneratedSerialDescriptor.mo24966k(C28547h2.f69320h, true);
            pluginGeneratedSerialDescriptor.mo24966k("minefiCode", true);
            pluginGeneratedSerialDescriptor.mo24966k("metiReference", true);
            pluginGeneratedSerialDescriptor.mo24966k("openingDate", true);
            pluginGeneratedSerialDescriptor.mo24966k("url", true);
            pluginGeneratedSerialDescriptor.mo24966k("minOrderAmount", true);
            pluginGeneratedSerialDescriptor.mo24966k("paymentOnSiteActivated", true);
            pluginGeneratedSerialDescriptor.mo24966k("isLoyaltyActivated", true);
            pluginGeneratedSerialDescriptor.mo24966k("returnableShoppingBag", true);
            pluginGeneratedSerialDescriptor.mo24966k("yieldEligible", true);
            pluginGeneratedSerialDescriptor.mo24966k("serviceType", true);
            pluginGeneratedSerialDescriptor.mo24966k("isExpress", true);
            pluginGeneratedSerialDescriptor.mo24966k("isMirror", true);
            pluginGeneratedSerialDescriptor.mo24966k("deliveryFees", true);
            f96616b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0161, code lost:
            r10 = r10 | r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x018f, code lost:
            r10 = r10 | r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0238, code lost:
            r9 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x027a, code lost:
            r9 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x027b, code lost:
            r5 = 8;
            r9 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x027d, code lost:
            r8 = 25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0138, code lost:
            r9 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0138, code lost:
            r9 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0138, code lost:
            r9 = r9;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.carrefour.fid.android.domain.models.service.models.StoreService deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r50) {
            /*
                r49 = this;
                r0 = r50
                java.lang.String r1 = "decoder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                kotlinx.serialization.descriptors.f r1 = r49.getDescriptor()
                kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
                kotlinx.serialization.g[] r2 = com.carrefour.fid.android.domain.models.service.models.StoreService.f96588P0
                boolean r3 = r0.mo24886p()
                r11 = 10
                r12 = 9
                r13 = 7
                r14 = 6
                r15 = 5
                r5 = 8
                r4 = 4
                r6 = 2
                r7 = 3
                r8 = 1
                r9 = 0
                r10 = 0
                if (r3 == 0) goto L_0x00fe
                java.lang.String r3 = r0.mo24884m(r1, r9)
                java.lang.String r8 = r0.mo24884m(r1, r8)
                java.lang.String r6 = r0.mo24884m(r1, r6)
                r9 = r2[r7]
                java.lang.Object r7 = r0.mo24885n(r1, r7, r9, r10)
                java.lang.String r4 = r0.mo24884m(r1, r4)
                java.lang.String r9 = r0.mo24884m(r1, r15)
                java.lang.String r14 = r0.mo24884m(r1, r14)
                java.lang.String r13 = r0.mo24884m(r1, r13)
                boolean r5 = r0.mo24866C(r1, r5)
                java.lang.String r12 = r0.mo24884m(r1, r12)
                java.lang.String r11 = r0.mo24884m(r1, r11)
                r15 = 11
                java.lang.String r15 = r0.mo24884m(r1, r15)
                r10 = 12
                java.lang.String r10 = r0.mo24884m(r1, r10)
                r23 = r3
                r3 = 13
                java.lang.String r3 = r0.mo24884m(r1, r3)
                r22 = r3
                r3 = 14
                java.lang.String r3 = r0.mo24884m(r1, r3)
                r19 = r3
                r3 = 15
                java.lang.String r3 = r0.mo24884m(r1, r3)
                r18 = r3
                r3 = 16
                java.lang.String r3 = r0.mo24884m(r1, r3)
                r17 = r3
                r3 = 17
                java.lang.String r3 = r0.mo24884m(r1, r3)
                r16 = r3
                r3 = 18
                boolean r3 = r0.mo24866C(r1, r3)
                r50 = r3
                r3 = 19
                boolean r3 = r0.mo24866C(r1, r3)
                r24 = r3
                r3 = 20
                boolean r3 = r0.mo24866C(r1, r3)
                r26 = r3
                r3 = 21
                boolean r3 = r0.mo24866C(r1, r3)
                r27 = r3
                r21 = r4
                r3 = 22
                r4 = r2[r3]
                r28 = r9
                r9 = 0
                java.lang.Object r3 = r0.mo24885n(r1, r3, r4, r9)
                r4 = 23
                boolean r4 = r0.mo24866C(r1, r4)
                r9 = 24
                boolean r9 = r0.mo24866C(r1, r9)
                r29 = r8
                r8 = 25
                r2 = r2[r8]
                r20 = r6
                r6 = 0
                java.lang.Object r2 = r0.mo24895y(r1, r8, r2, r6)
                r6 = 67108863(0x3ffffff, float:1.5046327E-36)
                r34 = r21
                r25 = r26
                r26 = r27
                r32 = r29
                r29 = r9
                r21 = r17
                r9 = r7
                r17 = r10
                r7 = r20
                r10 = r28
                r28 = r4
                r20 = r18
                r18 = r22
                r4 = r3
                r22 = r16
                r16 = r15
                r15 = r11
                r11 = r14
                r14 = r12
                r12 = r13
                r13 = r5
                r5 = r23
                r23 = r50
                goto L_0x02aa
            L_0x00fe:
                r3 = r6
                r6 = r10
                r10 = r9
                r9 = r8
                r8 = 25
                r3 = r6
                r7 = r3
                r31 = r7
                r32 = r31
                r33 = r32
                r34 = r33
                r35 = r34
                r36 = r35
                r37 = r36
                r38 = r37
                r39 = r38
                r40 = r39
                r41 = r40
                r42 = r41
                r43 = r42
                r44 = r43
                r45 = r44
                r46 = r45
                r47 = r9
                r20 = r10
                r25 = r20
                r26 = r25
                r27 = r26
                r28 = r27
                r30 = r28
                r9 = r46
                r6 = r30
            L_0x0138:
                if (r47 == 0) goto L_0x0281
                int r4 = r0.mo24931o(r1)
                switch(r4) {
                    case -1: goto L_0x0274;
                    case 0: goto L_0x0269;
                    case 1: goto L_0x025e;
                    case 2: goto L_0x0253;
                    case 3: goto L_0x0247;
                    case 4: goto L_0x023a;
                    case 5: goto L_0x022e;
                    case 6: goto L_0x0223;
                    case 7: goto L_0x0218;
                    case 8: goto L_0x020d;
                    case 9: goto L_0x0202;
                    case 10: goto L_0x01f7;
                    case 11: goto L_0x01ec;
                    case 12: goto L_0x01e1;
                    case 13: goto L_0x01d6;
                    case 14: goto L_0x01cb;
                    case 15: goto L_0x01bc;
                    case 16: goto L_0x01ae;
                    case 17: goto L_0x01a0;
                    case 18: goto L_0x0192;
                    case 19: goto L_0x0185;
                    case 20: goto L_0x017a;
                    case 21: goto L_0x016f;
                    case 22: goto L_0x0164;
                    case 23: goto L_0x0159;
                    case 24: goto L_0x0150;
                    case 25: goto L_0x0147;
                    default: goto L_0x0141;
                }
            L_0x0141:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>((int) r4)
                throw r0
            L_0x0147:
                r4 = r2[r8]
                java.lang.Object r7 = r0.mo24895y(r1, r8, r4, r7)
                r4 = 33554432(0x2000000, float:9.403955E-38)
                goto L_0x0161
            L_0x0150:
                r4 = 24
                boolean r30 = r0.mo24866C(r1, r4)
                r4 = 16777216(0x1000000, float:2.3509887E-38)
                goto L_0x0161
            L_0x0159:
                r4 = 23
                boolean r27 = r0.mo24866C(r1, r4)
                r4 = 8388608(0x800000, float:1.17549435E-38)
            L_0x0161:
                r10 = r10 | r4
                r4 = 4
                goto L_0x0138
            L_0x0164:
                r4 = 22
                r8 = r2[r4]
                java.lang.Object r3 = r0.mo24885n(r1, r4, r8, r3)
                r8 = 4194304(0x400000, float:5.877472E-39)
                goto L_0x018f
            L_0x016f:
                r4 = 22
                r8 = 21
                boolean r26 = r0.mo24866C(r1, r8)
                r8 = 2097152(0x200000, float:2.938736E-39)
                goto L_0x018f
            L_0x017a:
                r4 = 22
                r8 = 20
                boolean r25 = r0.mo24866C(r1, r8)
                r8 = 1048576(0x100000, float:1.469368E-39)
                goto L_0x018f
            L_0x0185:
                r4 = 22
                r8 = 19
                boolean r20 = r0.mo24866C(r1, r8)
                r8 = 524288(0x80000, float:7.34684E-40)
            L_0x018f:
                r10 = r10 | r8
                goto L_0x0238
            L_0x0192:
                r4 = 22
                r8 = 18
                boolean r6 = r0.mo24866C(r1, r8)
                r48 = 262144(0x40000, float:3.67342E-40)
                r10 = r10 | r48
                goto L_0x0238
            L_0x01a0:
                r4 = 22
                r8 = 17
                java.lang.String r46 = r0.mo24884m(r1, r8)
                r16 = 131072(0x20000, float:1.83671E-40)
                r10 = r10 | r16
                goto L_0x0238
            L_0x01ae:
                r4 = 22
                r8 = 16
                java.lang.String r45 = r0.mo24884m(r1, r8)
                r17 = 65536(0x10000, float:9.18355E-41)
                r10 = r10 | r17
                goto L_0x0238
            L_0x01bc:
                r4 = 22
                r8 = 15
                java.lang.String r44 = r0.mo24884m(r1, r8)
                r18 = 32768(0x8000, float:4.5918E-41)
                r10 = r10 | r18
                goto L_0x0238
            L_0x01cb:
                r4 = 22
                r8 = 14
                java.lang.String r43 = r0.mo24884m(r1, r8)
                r10 = r10 | 16384(0x4000, float:2.2959E-41)
                goto L_0x0238
            L_0x01d6:
                r4 = 22
                r8 = 13
                java.lang.String r42 = r0.mo24884m(r1, r8)
                r10 = r10 | 8192(0x2000, float:1.14794E-41)
                goto L_0x0238
            L_0x01e1:
                r4 = 22
                r8 = 12
                java.lang.String r41 = r0.mo24884m(r1, r8)
                r10 = r10 | 4096(0x1000, float:5.74E-42)
                goto L_0x0238
            L_0x01ec:
                r4 = 22
                r8 = 11
                java.lang.String r40 = r0.mo24884m(r1, r8)
                r10 = r10 | 2048(0x800, float:2.87E-42)
                goto L_0x0238
            L_0x01f7:
                r4 = 22
                r8 = 11
                java.lang.String r39 = r0.mo24884m(r1, r11)
                r10 = r10 | 1024(0x400, float:1.435E-42)
                goto L_0x0238
            L_0x0202:
                r4 = 22
                r8 = 11
                java.lang.String r38 = r0.mo24884m(r1, r12)
                r10 = r10 | 512(0x200, float:7.175E-43)
                goto L_0x0238
            L_0x020d:
                r4 = 22
                r8 = 11
                boolean r28 = r0.mo24866C(r1, r5)
                r10 = r10 | 256(0x100, float:3.59E-43)
                goto L_0x0238
            L_0x0218:
                r4 = 22
                r8 = 11
                java.lang.String r37 = r0.mo24884m(r1, r13)
                r10 = r10 | 128(0x80, float:1.794E-43)
                goto L_0x0238
            L_0x0223:
                r4 = 22
                r8 = 11
                java.lang.String r36 = r0.mo24884m(r1, r14)
                r10 = r10 | 64
                goto L_0x0238
            L_0x022e:
                r4 = 22
                r8 = 11
                java.lang.String r35 = r0.mo24884m(r1, r15)
                r10 = r10 | 32
            L_0x0238:
                r4 = 4
                goto L_0x027d
            L_0x023a:
                r4 = 22
                r5 = 4
                r8 = 11
                java.lang.String r34 = r0.mo24884m(r1, r5)
                r10 = r10 | 16
                r4 = r5
                goto L_0x027b
            L_0x0247:
                r5 = 3
                r8 = 11
                r4 = r2[r5]
                java.lang.Object r9 = r0.mo24885n(r1, r5, r4, r9)
                r10 = r10 | 8
                goto L_0x027a
            L_0x0253:
                r4 = 2
                r5 = 3
                r8 = 11
                java.lang.String r33 = r0.mo24884m(r1, r4)
                r10 = r10 | 4
                goto L_0x027a
            L_0x025e:
                r4 = 2
                r5 = 1
                r8 = 11
                java.lang.String r32 = r0.mo24884m(r1, r5)
                r10 = r10 | 2
                goto L_0x027a
            L_0x0269:
                r4 = 0
                r5 = 1
                r8 = 11
                java.lang.String r31 = r0.mo24884m(r1, r4)
                r10 = r10 | 1
                goto L_0x027a
            L_0x0274:
                r4 = 0
                r5 = 1
                r8 = 11
                r47 = r4
            L_0x027a:
                r4 = 4
            L_0x027b:
                r5 = 8
            L_0x027d:
                r8 = 25
                goto L_0x0138
            L_0x0281:
                r4 = r3
                r23 = r6
                r2 = r7
                r6 = r10
                r24 = r20
                r13 = r28
                r29 = r30
                r5 = r31
                r7 = r33
                r10 = r35
                r11 = r36
                r12 = r37
                r14 = r38
                r15 = r39
                r16 = r40
                r17 = r41
                r18 = r42
                r19 = r43
                r20 = r44
                r21 = r45
                r22 = r46
                r28 = r27
            L_0x02aa:
                r0.mo24876c(r1)
                com.carrefour.fid.android.domain.models.service.models.StoreService r0 = new com.carrefour.fid.android.domain.models.service.models.StoreService
                r3 = r0
                r8 = r9
                java.util.List r8 = (java.util.List) r8
                r27 = r4
                com.carrefour.fid.android.domain.models.service.models.StoreServiceType r27 = (com.carrefour.fid.android.domain.models.service.models.StoreServiceType) r27
                r30 = r2
                java.util.List r30 = (java.util.List) r30
                r31 = 0
                r4 = r6
                r6 = r32
                r9 = r34
                r3.<init>((int) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.util.List) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (boolean) r13, (java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (java.lang.String) r22, (boolean) r23, (boolean) r24, (boolean) r25, (boolean) r26, (com.carrefour.fid.android.domain.models.service.models.StoreServiceType) r27, (boolean) r28, (boolean) r29, (java.util.List) r30, (kotlinx.serialization.internal.C12295n1) r31)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.service.models.StoreService.C38136a.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.domain.models.service.models.StoreService");
        }

        /* renamed from: b */
        public void serialize(@C12579k C12244g gVar, @C12579k StoreService storeService) {
            Intrinsics.checkNotNullParameter(gVar, "encoder");
            Intrinsics.checkNotNullParameter(storeService, "value");
            C12217f descriptor = getDescriptor();
            C12239d b = gVar.mo24906b(descriptor);
            StoreService.m158000e0(storeService, b, descriptor);
            b.mo24907c(descriptor);
        }

        @C12579k
        public C12248g<?>[] childSerializers() {
            C12248g<?>[] a = StoreService.f96588P0;
            C12310s1 s1Var = C12310s1.f30117a;
            C12278i iVar = C12278i.f30070a;
            return new C12248g[]{s1Var, s1Var, s1Var, C12197a.m48817q(a[3]), s1Var, s1Var, s1Var, s1Var, iVar, s1Var, s1Var, s1Var, s1Var, s1Var, s1Var, s1Var, s1Var, s1Var, iVar, iVar, iVar, iVar, C12197a.m48817q(a[22]), iVar, iVar, a[25]};
        }

        @C12579k
        public C12217f getDescriptor() {
            return f96616b;
        }

        @C12579k
        public C12248g<?>[] typeParametersSerializers() {
            return C12327y.C12328a.m49635a(this);
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.models.service.models.StoreService$b */
    public static final class C38137b {
        public /* synthetic */ C38137b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<StoreService> serializer() {
            return C38136a.f96615a;
        }

        public C38137b() {
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.models.service.models.StoreService$c */
    public static final class C38138c implements Parcelable.Creator<StoreService> {
        @C12579k
        /* renamed from: a */
        public final StoreService createFromParcel(@C12579k Parcel parcel) {
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i2 = 0; i2 != readInt; i2++) {
                    arrayList2.add(Boolean.valueOf(parcel.readInt() != 0));
                }
                arrayList = arrayList2;
            }
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            StoreServiceType storeServiceType = (StoreServiceType) parcel2.readParcelable(StoreService.class.getClassLoader());
            boolean z6 = parcel.readInt() != 0;
            boolean z7 = parcel.readInt() != 0;
            int readInt2 = parcel.readInt();
            String str = readString11;
            ArrayList arrayList3 = new ArrayList(readInt2);
            while (i != readInt2) {
                arrayList3.add(DeliveryFee.CREATOR.createFromParcel(parcel2));
                i++;
                readInt2 = readInt2;
            }
            return new StoreService(readString, readString2, readString3, arrayList, readString4, readString5, readString6, readString7, z, readString8, readString9, readString10, str, readString12, readString13, readString14, readString15, readString16, z2, z3, z4, z5, storeServiceType, z6, z7, arrayList3);
        }

        @C12579k
        /* renamed from: b */
        public final StoreService[] newArray(int i) {
            return new StoreService[i];
        }
    }

    public StoreService() {
        this((String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, false, false, (StoreServiceType) null, false, false, (List) null, (int) C8698y1.f23304p, (DefaultConstructorMarker) null);
    }

    /* renamed from: C */
    public static /* synthetic */ StoreService m157998C(StoreService storeService, String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z2, boolean z3, boolean z4, boolean z5, StoreServiceType storeServiceType, boolean z6, boolean z7, List list2, int i, Object obj) {
        StoreService storeService2 = storeService;
        int i2 = i;
        return storeService.mo119159B((i2 & 1) != 0 ? storeService2.f96603a : str, (i2 & 2) != 0 ? storeService2.f96604b : str2, (i2 & 4) != 0 ? storeService2.f96605c : str3, (i2 & 8) != 0 ? storeService2.f96606d : list, (i2 & 16) != 0 ? storeService2.f96607e : str4, (i2 & 32) != 0 ? storeService2.f96608f : str5, (i2 & 64) != 0 ? storeService2.f96609g : str6, (i2 & 128) != 0 ? storeService2.f96610v : str7, (i2 & 256) != 0 ? storeService2.f96611w : z, (i2 & 512) != 0 ? storeService2.f96612x : str8, (i2 & 1024) != 0 ? storeService2.f96613y : str9, (i2 & 2048) != 0 ? storeService2.f96614z : str10, (i2 & 4096) != 0 ? storeService2.f96600X : str11, (i2 & 8192) != 0 ? storeService2.f96601Y : str12, (i2 & 16384) != 0 ? storeService2.f96602Z : str13, (i2 & 32768) != 0 ? storeService2.f96589E0 : str14, (i2 & 65536) != 0 ? storeService2.f96590F0 : str15, (i2 & 131072) != 0 ? storeService2.f96591G0 : str16, (i2 & 262144) != 0 ? storeService2.f96592H0 : z2, (i2 & 524288) != 0 ? storeService2.f96593I0 : z3, (i2 & 1048576) != 0 ? storeService2.f96594J0 : z4, (i2 & 2097152) != 0 ? storeService2.f96595K0 : z5, (i2 & 4194304) != 0 ? storeService2.f96596L0 : storeServiceType, (i2 & 8388608) != 0 ? storeService2.f96597M0 : z6, (i2 & 16777216) != 0 ? storeService2.f96598N0 : z7, (i2 & C9647e0.f26435a) != 0 ? storeService2.f96599O0 : list2);
    }

    @C11384m
    /* renamed from: e0 */
    public static final /* synthetic */ void m158000e0(StoreService storeService, C12239d dVar, C12217f fVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        C12248g<Object>[] gVarArr = f96588P0;
        boolean z26 = false;
        if (!dVar.mo24897A(fVar, 0) && Intrinsics.areEqual((Object) storeService.f96603a, (Object) "")) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            dVar.mo24929z(fVar, 0, storeService.f96603a);
        }
        if (!dVar.mo24897A(fVar, 1) && Intrinsics.areEqual((Object) storeService.f96604b, (Object) "")) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            dVar.mo24929z(fVar, 1, storeService.f96604b);
        }
        if (!dVar.mo24897A(fVar, 2) && Intrinsics.areEqual((Object) storeService.f96605c, (Object) "")) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            dVar.mo24929z(fVar, 2, storeService.f96605c);
        }
        if (!dVar.mo24897A(fVar, 3) && storeService.f96606d == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            dVar.mo24912i(fVar, 3, gVarArr[3], storeService.f96606d);
        }
        if (!dVar.mo24897A(fVar, 4) && Intrinsics.areEqual((Object) storeService.f96607e, (Object) "")) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5) {
            dVar.mo24929z(fVar, 4, storeService.f96607e);
        }
        if (!dVar.mo24897A(fVar, 5) && Intrinsics.areEqual((Object) storeService.f96608f, (Object) "")) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z6) {
            dVar.mo24929z(fVar, 5, storeService.f96608f);
        }
        if (!dVar.mo24897A(fVar, 6) && Intrinsics.areEqual((Object) storeService.f96609g, (Object) "")) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (z7) {
            dVar.mo24929z(fVar, 6, storeService.f96609g);
        }
        if (!dVar.mo24897A(fVar, 7) && Intrinsics.areEqual((Object) storeService.f96610v, (Object) "")) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (z8) {
            dVar.mo24929z(fVar, 7, storeService.f96610v);
        }
        if (!dVar.mo24897A(fVar, 8) && storeService.f96611w) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            dVar.mo24928y(fVar, 8, storeService.f96611w);
        }
        if (!dVar.mo24897A(fVar, 9) && Intrinsics.areEqual((Object) storeService.f96612x, (Object) "")) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            dVar.mo24929z(fVar, 9, storeService.f96612x);
        }
        if (!dVar.mo24897A(fVar, 10) && Intrinsics.areEqual((Object) storeService.f96613y, (Object) new String())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            dVar.mo24929z(fVar, 10, storeService.f96613y);
        }
        if (!dVar.mo24897A(fVar, 11) && Intrinsics.areEqual((Object) storeService.f96614z, (Object) "")) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            dVar.mo24929z(fVar, 11, storeService.f96614z);
        }
        if (!dVar.mo24897A(fVar, 12) && Intrinsics.areEqual((Object) storeService.f96600X, (Object) "")) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z13) {
            dVar.mo24929z(fVar, 12, storeService.f96600X);
        }
        if (!dVar.mo24897A(fVar, 13) && Intrinsics.areEqual((Object) storeService.f96601Y, (Object) "")) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z14) {
            dVar.mo24929z(fVar, 13, storeService.f96601Y);
        }
        if (!dVar.mo24897A(fVar, 14) && Intrinsics.areEqual((Object) storeService.f96602Z, (Object) "")) {
            z15 = false;
        } else {
            z15 = true;
        }
        if (z15) {
            dVar.mo24929z(fVar, 14, storeService.f96602Z);
        }
        if (!dVar.mo24897A(fVar, 15) && Intrinsics.areEqual((Object) storeService.f96589E0, (Object) "")) {
            z16 = false;
        } else {
            z16 = true;
        }
        if (z16) {
            dVar.mo24929z(fVar, 15, storeService.f96589E0);
        }
        if (!dVar.mo24897A(fVar, 16) && Intrinsics.areEqual((Object) storeService.f96590F0, (Object) "")) {
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            dVar.mo24929z(fVar, 16, storeService.f96590F0);
        }
        if (!dVar.mo24897A(fVar, 17) && Intrinsics.areEqual((Object) storeService.f96591G0, (Object) "")) {
            z18 = false;
        } else {
            z18 = true;
        }
        if (z18) {
            dVar.mo24929z(fVar, 17, storeService.f96591G0);
        }
        if (!dVar.mo24897A(fVar, 18) && !storeService.f96592H0) {
            z19 = false;
        } else {
            z19 = true;
        }
        if (z19) {
            dVar.mo24928y(fVar, 18, storeService.f96592H0);
        }
        if (!dVar.mo24897A(fVar, 19) && !storeService.f96593I0) {
            z20 = false;
        } else {
            z20 = true;
        }
        if (z20) {
            dVar.mo24928y(fVar, 19, storeService.f96593I0);
        }
        if (!dVar.mo24897A(fVar, 20) && !storeService.f96594J0) {
            z21 = false;
        } else {
            z21 = true;
        }
        if (z21) {
            dVar.mo24928y(fVar, 20, storeService.f96594J0);
        }
        if (!dVar.mo24897A(fVar, 21) && !storeService.f96595K0) {
            z22 = false;
        } else {
            z22 = true;
        }
        if (z22) {
            dVar.mo24928y(fVar, 21, storeService.f96595K0);
        }
        if (!dVar.mo24897A(fVar, 22) && storeService.f96596L0 == null) {
            z23 = false;
        } else {
            z23 = true;
        }
        if (z23) {
            dVar.mo24912i(fVar, 22, gVarArr[22], storeService.f96596L0);
        }
        if (!dVar.mo24897A(fVar, 23) && !storeService.f96597M0) {
            z24 = false;
        } else {
            z24 = true;
        }
        if (z24) {
            dVar.mo24928y(fVar, 23, storeService.f96597M0);
        }
        if (!dVar.mo24897A(fVar, 24) && !storeService.f96598N0) {
            z25 = false;
        } else {
            z25 = true;
        }
        if (z25) {
            dVar.mo24928y(fVar, 24, storeService.f96598N0);
        }
        if (dVar.mo24897A(fVar, 25) || !Intrinsics.areEqual((Object) storeService.f96599O0, (Object) CollectionsKt__CollectionsKt.m40441E())) {
            z26 = true;
        }
        if (z26) {
            dVar.mo24899D(fVar, 25, gVarArr[25], storeService.f96599O0);
        }
    }

    /* renamed from: A */
    public final boolean mo119158A() {
        return this.f96611w;
    }

    @C12579k
    /* renamed from: B */
    public final StoreService mo119159B(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12580l List<Boolean> list, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, boolean z, @C12579k String str8, @C12579k String str9, @C12579k String str10, @C12579k String str11, @C12579k String str12, @C12579k String str13, @C12579k String str14, @C12579k String str15, @C12579k String str16, boolean z2, boolean z3, boolean z4, boolean z5, @C12580l StoreServiceType storeServiceType, boolean z6, boolean z7, @C12579k List<DeliveryFee> list2) {
        String str17 = str;
        Intrinsics.checkNotNullParameter(str17, "serviceId");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "label");
        Intrinsics.checkNotNullParameter(str4, "wording");
        Intrinsics.checkNotNullParameter(str5, "description");
        Intrinsics.checkNotNullParameter(str6, "weight");
        Intrinsics.checkNotNullParameter(str7, "category");
        Intrinsics.checkNotNullParameter(str8, "type");
        Intrinsics.checkNotNullParameter(str9, "format");
        Intrinsics.checkNotNullParameter(str10, "wlecService");
        Intrinsics.checkNotNullParameter(str11, C28547h2.f69320h);
        Intrinsics.checkNotNullParameter(str12, "minefiCode");
        Intrinsics.checkNotNullParameter(str13, "metiReference");
        Intrinsics.checkNotNullParameter(str14, "openingDate");
        Intrinsics.checkNotNullParameter(str15, "url");
        Intrinsics.checkNotNullParameter(str16, "minOrderAmount");
        Intrinsics.checkNotNullParameter(list2, "deliveryFees");
        return new StoreService(str17, str2, str3, list, str4, str5, str6, str7, z, str8, str9, str10, str11, str12, str13, str14, str15, str16, z2, z3, z4, z5, storeServiceType, z6, z7, list2);
    }

    @C12579k
    /* renamed from: D */
    public final String mo119160D() {
        return this.f96610v;
    }

    @C12579k
    /* renamed from: E */
    public final List<DeliveryFee> mo119161E() {
        return this.f96599O0;
    }

    @C12579k
    /* renamed from: F */
    public final String mo119162F() {
        return this.f96608f;
    }

    @C12579k
    /* renamed from: G */
    public final String mo119163G() {
        return this.f96600X;
    }

    @C12579k
    /* renamed from: H */
    public final String mo119164H() {
        return this.f96613y;
    }

    /* renamed from: I */
    public final boolean mo119165I() {
        boolean z;
        boolean z2;
        if (this.f96599O0.isEmpty()) {
            return true;
        }
        Iterable iterable = this.f96599O0;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DeliveryFee deliveryFee = (DeliveryFee) it.next();
                if ((deliveryFee.mo119072i() == null || deliveryFee.mo119072i().mo119088j()) && ((deliveryFee.mo119073j() == null || deliveryFee.mo119073j().mo119088j()) && (deliveryFee.mo119070h() == null || deliveryFee.mo119070h().mo119088j()))) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (!z2) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: J */
    public final String mo119166J() {
        return this.f96605c;
    }

    @C12579k
    /* renamed from: K */
    public final String mo119167K() {
        return this.f96602Z;
    }

    @C12579k
    /* renamed from: L */
    public final String mo119168L() {
        return this.f96591G0;
    }

    @C12579k
    /* renamed from: M */
    public final String mo119169M() {
        return this.f96601Y;
    }

    @C12579k
    /* renamed from: N */
    public final String mo119170N() {
        return this.f96604b;
    }

    @C12579k
    /* renamed from: O */
    public final String mo119171O() {
        return this.f96589E0;
    }

    @C12580l
    /* renamed from: P */
    public final List<Boolean> mo119172P() {
        return this.f96606d;
    }

    /* renamed from: Q */
    public final boolean mo119173Q() {
        return this.f96592H0;
    }

    /* renamed from: R */
    public final boolean mo119174R() {
        return this.f96594J0;
    }

    @C12579k
    /* renamed from: S */
    public final String mo119175S() {
        return this.f96603a;
    }

    @C12580l
    /* renamed from: T */
    public final StoreServiceType mo119176T() {
        return this.f96596L0;
    }

    @C12579k
    /* renamed from: U */
    public final String mo119177U() {
        return this.f96612x;
    }

    @C12579k
    /* renamed from: V */
    public final String mo119178V() {
        return this.f96590F0;
    }

    @C12579k
    /* renamed from: W */
    public final String mo119179W() {
        return this.f96609g;
    }

    @C12579k
    /* renamed from: X */
    public final String mo119180X() {
        return this.f96614z;
    }

    @C12579k
    /* renamed from: Y */
    public final String mo119181Y() {
        return this.f96607e;
    }

    /* renamed from: Z */
    public final boolean mo119182Z() {
        return this.f96595K0;
    }

    /* renamed from: a0 */
    public final boolean mo119183a0() {
        return this.f96597M0;
    }

    @C12579k
    /* renamed from: b */
    public final String mo119184b() {
        return this.f96603a;
    }

    /* renamed from: b0 */
    public final boolean mo119185b0() {
        return this.f96593I0;
    }

    @C12579k
    /* renamed from: c */
    public final String mo119186c() {
        return this.f96612x;
    }

    /* renamed from: c0 */
    public final boolean mo119187c0() {
        return this.f96598N0;
    }

    @C12579k
    /* renamed from: d */
    public final String mo119188d() {
        return this.f96613y;
    }

    /* renamed from: d0 */
    public final boolean mo119189d0() {
        return this.f96611w;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo119191e() {
        return this.f96614z;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreService)) {
            return false;
        }
        StoreService storeService = (StoreService) obj;
        return Intrinsics.areEqual((Object) this.f96603a, (Object) storeService.f96603a) && Intrinsics.areEqual((Object) this.f96604b, (Object) storeService.f96604b) && Intrinsics.areEqual((Object) this.f96605c, (Object) storeService.f96605c) && Intrinsics.areEqual((Object) this.f96606d, (Object) storeService.f96606d) && Intrinsics.areEqual((Object) this.f96607e, (Object) storeService.f96607e) && Intrinsics.areEqual((Object) this.f96608f, (Object) storeService.f96608f) && Intrinsics.areEqual((Object) this.f96609g, (Object) storeService.f96609g) && Intrinsics.areEqual((Object) this.f96610v, (Object) storeService.f96610v) && this.f96611w == storeService.f96611w && Intrinsics.areEqual((Object) this.f96612x, (Object) storeService.f96612x) && Intrinsics.areEqual((Object) this.f96613y, (Object) storeService.f96613y) && Intrinsics.areEqual((Object) this.f96614z, (Object) storeService.f96614z) && Intrinsics.areEqual((Object) this.f96600X, (Object) storeService.f96600X) && Intrinsics.areEqual((Object) this.f96601Y, (Object) storeService.f96601Y) && Intrinsics.areEqual((Object) this.f96602Z, (Object) storeService.f96602Z) && Intrinsics.areEqual((Object) this.f96589E0, (Object) storeService.f96589E0) && Intrinsics.areEqual((Object) this.f96590F0, (Object) storeService.f96590F0) && Intrinsics.areEqual((Object) this.f96591G0, (Object) storeService.f96591G0) && this.f96592H0 == storeService.f96592H0 && this.f96593I0 == storeService.f96593I0 && this.f96594J0 == storeService.f96594J0 && this.f96595K0 == storeService.f96595K0 && Intrinsics.areEqual((Object) this.f96596L0, (Object) storeService.f96596L0) && this.f96597M0 == storeService.f96597M0 && this.f96598N0 == storeService.f96598N0 && Intrinsics.areEqual((Object) this.f96599O0, (Object) storeService.f96599O0);
    }

    @C12579k
    /* renamed from: f */
    public final String mo119193f() {
        return this.f96600X;
    }

    @C12579k
    /* renamed from: g */
    public final String mo119194g() {
        return this.f96601Y;
    }

    @C12579k
    /* renamed from: h */
    public final String mo119195h() {
        return this.f96602Z;
    }

    public int hashCode() {
        int hashCode = ((((this.f96603a.hashCode() * 31) + this.f96604b.hashCode()) * 31) + this.f96605c.hashCode()) * 31;
        List<Boolean> list = this.f96606d;
        int i = 0;
        int hashCode2 = (((((((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f96607e.hashCode()) * 31) + this.f96608f.hashCode()) * 31) + this.f96609g.hashCode()) * 31) + this.f96610v.hashCode()) * 31;
        boolean z = this.f96611w;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode3 = (((((((((((((((((((hashCode2 + (z ? 1 : 0)) * 31) + this.f96612x.hashCode()) * 31) + this.f96613y.hashCode()) * 31) + this.f96614z.hashCode()) * 31) + this.f96600X.hashCode()) * 31) + this.f96601Y.hashCode()) * 31) + this.f96602Z.hashCode()) * 31) + this.f96589E0.hashCode()) * 31) + this.f96590F0.hashCode()) * 31) + this.f96591G0.hashCode()) * 31;
        boolean z3 = this.f96592H0;
        if (z3) {
            z3 = true;
        }
        int i2 = (hashCode3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f96593I0;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f96594J0;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f96595K0;
        if (z6) {
            z6 = true;
        }
        int i5 = (i4 + (z6 ? 1 : 0)) * 31;
        StoreServiceType storeServiceType = this.f96596L0;
        if (storeServiceType != null) {
            i = storeServiceType.hashCode();
        }
        int i6 = (i5 + i) * 31;
        boolean z7 = this.f96597M0;
        if (z7) {
            z7 = true;
        }
        int i7 = (i6 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.f96598N0;
        if (!z8) {
            z2 = z8;
        }
        return ((i7 + (z2 ? 1 : 0)) * 31) + this.f96599O0.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final String mo119197i() {
        return this.f96589E0;
    }

    @C12579k
    /* renamed from: j */
    public final String mo119198j() {
        return this.f96590F0;
    }

    @C12579k
    /* renamed from: k */
    public final String mo119199k() {
        return this.f96591G0;
    }

    /* renamed from: l */
    public final boolean mo119200l() {
        return this.f96592H0;
    }

    @C12579k
    /* renamed from: m */
    public final String mo119201m() {
        return this.f96604b;
    }

    /* renamed from: n */
    public final boolean mo119202n() {
        return this.f96593I0;
    }

    /* renamed from: o */
    public final boolean mo119203o() {
        return this.f96594J0;
    }

    /* renamed from: p */
    public final boolean mo119204p() {
        return this.f96595K0;
    }

    @C12580l
    /* renamed from: q */
    public final StoreServiceType mo119205q() {
        return this.f96596L0;
    }

    /* renamed from: r */
    public final boolean mo119206r() {
        return this.f96597M0;
    }

    /* renamed from: s */
    public final boolean mo119207s() {
        return this.f96598N0;
    }

    @C12579k
    /* renamed from: t */
    public final List<DeliveryFee> mo119208t() {
        return this.f96599O0;
    }

    @C12579k
    public String toString() {
        String str = this.f96603a;
        String str2 = this.f96604b;
        String str3 = this.f96605c;
        List<Boolean> list = this.f96606d;
        String str4 = this.f96607e;
        String str5 = this.f96608f;
        String str6 = this.f96609g;
        String str7 = this.f96610v;
        boolean z = this.f96611w;
        String str8 = this.f96612x;
        String str9 = this.f96613y;
        String str10 = this.f96614z;
        String str11 = this.f96600X;
        String str12 = this.f96601Y;
        String str13 = this.f96602Z;
        String str14 = this.f96589E0;
        String str15 = this.f96590F0;
        String str16 = this.f96591G0;
        boolean z2 = this.f96592H0;
        boolean z3 = this.f96593I0;
        boolean z4 = this.f96594J0;
        boolean z5 = this.f96595K0;
        StoreServiceType storeServiceType = this.f96596L0;
        boolean z6 = this.f96597M0;
        boolean z7 = this.f96598N0;
        List<DeliveryFee> list2 = this.f96599O0;
        return "StoreService(serviceId=" + str + ", name=" + str2 + ", label=" + str3 + ", passDays=" + list + ", wording=" + str4 + ", description=" + str5 + ", weight=" + str6 + ", category=" + str7 + ", isOpen=" + z + ", type=" + str8 + ", format=" + str9 + ", wlecService=" + str10 + ", facilityServiceId=" + str11 + ", minefiCode=" + str12 + ", metiReference=" + str13 + ", openingDate=" + str14 + ", url=" + str15 + ", minOrderAmount=" + str16 + ", paymentOnSiteActivated=" + z2 + ", isLoyaltyActivated=" + z3 + ", returnableShoppingBag=" + z4 + ", yieldEligible=" + z5 + ", serviceType=" + storeServiceType + ", isExpress=" + z6 + ", isMirror=" + z7 + ", deliveryFees=" + list2 + ")";
    }

    @C12579k
    /* renamed from: u */
    public final String mo119210u() {
        return this.f96605c;
    }

    @C12580l
    /* renamed from: v */
    public final List<Boolean> mo119211v() {
        return this.f96606d;
    }

    @C12579k
    /* renamed from: w */
    public final String mo119212w() {
        return this.f96607e;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f96603a);
        parcel.writeString(this.f96604b);
        parcel.writeString(this.f96605c);
        List<Boolean> list = this.f96606d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Boolean booleanValue : list) {
                parcel.writeInt(booleanValue.booleanValue() ? 1 : 0);
            }
        }
        parcel.writeString(this.f96607e);
        parcel.writeString(this.f96608f);
        parcel.writeString(this.f96609g);
        parcel.writeString(this.f96610v);
        parcel.writeInt(this.f96611w ? 1 : 0);
        parcel.writeString(this.f96612x);
        parcel.writeString(this.f96613y);
        parcel.writeString(this.f96614z);
        parcel.writeString(this.f96600X);
        parcel.writeString(this.f96601Y);
        parcel.writeString(this.f96602Z);
        parcel.writeString(this.f96589E0);
        parcel.writeString(this.f96590F0);
        parcel.writeString(this.f96591G0);
        parcel.writeInt(this.f96592H0 ? 1 : 0);
        parcel.writeInt(this.f96593I0 ? 1 : 0);
        parcel.writeInt(this.f96594J0 ? 1 : 0);
        parcel.writeInt(this.f96595K0 ? 1 : 0);
        parcel.writeParcelable(this.f96596L0, i);
        parcel.writeInt(this.f96597M0 ? 1 : 0);
        parcel.writeInt(this.f96598N0 ? 1 : 0);
        List<DeliveryFee> list2 = this.f96599O0;
        parcel.writeInt(list2.size());
        for (DeliveryFee writeToParcel : list2) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }

    @C12579k
    /* renamed from: x */
    public final String mo119214x() {
        return this.f96608f;
    }

    @C12579k
    /* renamed from: y */
    public final String mo119215y() {
        return this.f96609g;
    }

    @C12579k
    /* renamed from: z */
    public final String mo119216z() {
        return this.f96610v;
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ StoreService(int i, String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z2, boolean z3, boolean z4, boolean z5, StoreServiceType storeServiceType, boolean z6, boolean z7, List list2, C12295n1 n1Var) {
        int i2 = i;
        if ((i2 & 0) != 0) {
            C12261c1.m49256b(i, 0, C38136a.f96615a.getDescriptor());
        }
        if ((i2 & 1) == 0) {
            this.f96603a = "";
        } else {
            this.f96603a = str;
        }
        if ((i2 & 2) == 0) {
            this.f96604b = "";
        } else {
            this.f96604b = str2;
        }
        if ((i2 & 4) == 0) {
            this.f96605c = "";
        } else {
            this.f96605c = str3;
        }
        if ((i2 & 8) == 0) {
            this.f96606d = null;
        } else {
            this.f96606d = list;
        }
        if ((i2 & 16) == 0) {
            this.f96607e = "";
        } else {
            this.f96607e = str4;
        }
        if ((i2 & 32) == 0) {
            this.f96608f = "";
        } else {
            this.f96608f = str5;
        }
        if ((i2 & 64) == 0) {
            this.f96609g = "";
        } else {
            this.f96609g = str6;
        }
        if ((i2 & 128) == 0) {
            this.f96610v = "";
        } else {
            this.f96610v = str7;
        }
        this.f96611w = (i2 & 256) == 0 ? true : z;
        if ((i2 & 512) == 0) {
            this.f96612x = "";
        } else {
            this.f96612x = str8;
        }
        this.f96613y = (i2 & 1024) == 0 ? new String() : str9;
        if ((i2 & 2048) == 0) {
            this.f96614z = "";
        } else {
            this.f96614z = str10;
        }
        if ((i2 & 4096) == 0) {
            this.f96600X = "";
        } else {
            this.f96600X = str11;
        }
        if ((i2 & 8192) == 0) {
            this.f96601Y = "";
        } else {
            this.f96601Y = str12;
        }
        if ((i2 & 16384) == 0) {
            this.f96602Z = "";
        } else {
            this.f96602Z = str13;
        }
        if ((32768 & i2) == 0) {
            this.f96589E0 = "";
        } else {
            this.f96589E0 = str14;
        }
        if ((65536 & i2) == 0) {
            this.f96590F0 = "";
        } else {
            this.f96590F0 = str15;
        }
        if ((131072 & i2) == 0) {
            this.f96591G0 = "";
        } else {
            this.f96591G0 = str16;
        }
        if ((262144 & i2) == 0) {
            this.f96592H0 = false;
        } else {
            this.f96592H0 = z2;
        }
        if ((524288 & i2) == 0) {
            this.f96593I0 = false;
        } else {
            this.f96593I0 = z3;
        }
        if ((1048576 & i2) == 0) {
            this.f96594J0 = false;
        } else {
            this.f96594J0 = z4;
        }
        if ((2097152 & i2) == 0) {
            this.f96595K0 = false;
        } else {
            this.f96595K0 = z5;
        }
        if ((4194304 & i2) == 0) {
            this.f96596L0 = null;
        } else {
            this.f96596L0 = storeServiceType;
        }
        if ((8388608 & i2) == 0) {
            this.f96597M0 = false;
        } else {
            this.f96597M0 = z6;
        }
        if ((16777216 & i2) == 0) {
            this.f96598N0 = false;
        } else {
            this.f96598N0 = z7;
        }
        this.f96599O0 = (i2 & C9647e0.f26435a) == 0 ? CollectionsKt__CollectionsKt.m40441E() : list2;
    }

    public StoreService(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12580l List<Boolean> list, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, boolean z, @C12579k String str8, @C12579k String str9, @C12579k String str10, @C12579k String str11, @C12579k String str12, @C12579k String str13, @C12579k String str14, @C12579k String str15, @C12579k String str16, boolean z2, boolean z3, boolean z4, boolean z5, @C12580l StoreServiceType storeServiceType, boolean z6, boolean z7, @C12579k List<DeliveryFee> list2) {
        String str17 = str;
        String str18 = str2;
        String str19 = str3;
        String str20 = str4;
        String str21 = str5;
        String str22 = str6;
        String str23 = str7;
        String str24 = str8;
        String str25 = str9;
        String str26 = str10;
        String str27 = str11;
        String str28 = str12;
        String str29 = str13;
        String str30 = str14;
        String str31 = str16;
        Intrinsics.checkNotNullParameter(str17, "serviceId");
        Intrinsics.checkNotNullParameter(str18, "name");
        Intrinsics.checkNotNullParameter(str19, "label");
        Intrinsics.checkNotNullParameter(str20, "wording");
        Intrinsics.checkNotNullParameter(str21, "description");
        Intrinsics.checkNotNullParameter(str22, "weight");
        Intrinsics.checkNotNullParameter(str23, "category");
        Intrinsics.checkNotNullParameter(str24, "type");
        Intrinsics.checkNotNullParameter(str25, "format");
        Intrinsics.checkNotNullParameter(str26, "wlecService");
        Intrinsics.checkNotNullParameter(str27, C28547h2.f69320h);
        Intrinsics.checkNotNullParameter(str28, "minefiCode");
        Intrinsics.checkNotNullParameter(str29, "metiReference");
        Intrinsics.checkNotNullParameter(str30, "openingDate");
        Intrinsics.checkNotNullParameter(str15, "url");
        Intrinsics.checkNotNullParameter(str16, "minOrderAmount");
        Intrinsics.checkNotNullParameter(list2, "deliveryFees");
        this.f96603a = str17;
        this.f96604b = str18;
        this.f96605c = str19;
        this.f96606d = list;
        this.f96607e = str20;
        this.f96608f = str21;
        this.f96609g = str22;
        this.f96610v = str23;
        this.f96611w = z;
        this.f96612x = str24;
        this.f96613y = str25;
        this.f96614z = str26;
        this.f96600X = str27;
        this.f96601Y = str28;
        this.f96602Z = str29;
        this.f96589E0 = str30;
        this.f96590F0 = str15;
        this.f96591G0 = str16;
        this.f96592H0 = z2;
        this.f96593I0 = z3;
        this.f96594J0 = z4;
        this.f96595K0 = z5;
        this.f96596L0 = storeServiceType;
        this.f96597M0 = z6;
        this.f96598N0 = z7;
        this.f96599O0 = list2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StoreService(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.util.List r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, boolean r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, boolean r46, boolean r47, boolean r48, boolean r49, com.carrefour.fid.android.domain.models.service.models.StoreServiceType r50, boolean r51, boolean r52, java.util.List r53, int r54, kotlin.jvm.internal.DefaultConstructorMarker r55) {
        /*
            r27 = this;
            r0 = r54
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r28
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r29
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r2
            goto L_0x001c
        L_0x001a:
            r4 = r30
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r31
        L_0x0024:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002a
            r7 = r2
            goto L_0x002c
        L_0x002a:
            r7 = r32
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            r8 = r2
            goto L_0x0034
        L_0x0032:
            r8 = r33
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            r9 = r2
            goto L_0x003c
        L_0x003a:
            r9 = r34
        L_0x003c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = r2
            goto L_0x0044
        L_0x0042:
            r10 = r35
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = 1
            goto L_0x004c
        L_0x004a:
            r11 = r36
        L_0x004c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0052
            r12 = r2
            goto L_0x0054
        L_0x0052:
            r12 = r37
        L_0x0054:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005e
            java.lang.String r13 = new java.lang.String
            r13.<init>()
            goto L_0x0060
        L_0x005e:
            r13 = r38
        L_0x0060:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0066
            r14 = r2
            goto L_0x0068
        L_0x0066:
            r14 = r39
        L_0x0068:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x006e
            r15 = r2
            goto L_0x0070
        L_0x006e:
            r15 = r40
        L_0x0070:
            r6 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x0076
            r6 = r2
            goto L_0x0078
        L_0x0076:
            r6 = r41
        L_0x0078:
            r55 = r2
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0081
            r2 = r55
            goto L_0x0083
        L_0x0081:
            r2 = r42
        L_0x0083:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x008d
            r16 = r55
            goto L_0x008f
        L_0x008d:
            r16 = r43
        L_0x008f:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0098
            r17 = r55
            goto L_0x009a
        L_0x0098:
            r17 = r44
        L_0x009a:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x00a3
            r18 = r55
            goto L_0x00a5
        L_0x00a3:
            r18 = r45
        L_0x00a5:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            r20 = 0
            if (r19 == 0) goto L_0x00b0
            r19 = r20
            goto L_0x00b2
        L_0x00b0:
            r19 = r46
        L_0x00b2:
            r21 = 524288(0x80000, float:7.34684E-40)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = r20
            goto L_0x00bd
        L_0x00bb:
            r21 = r47
        L_0x00bd:
            r22 = 1048576(0x100000, float:1.469368E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c6
            r22 = r20
            goto L_0x00c8
        L_0x00c6:
            r22 = r48
        L_0x00c8:
            r23 = 2097152(0x200000, float:2.938736E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d1
            r23 = r20
            goto L_0x00d3
        L_0x00d1:
            r23 = r49
        L_0x00d3:
            r24 = 4194304(0x400000, float:5.877472E-39)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00dc
            r24 = 0
            goto L_0x00de
        L_0x00dc:
            r24 = r50
        L_0x00de:
            r25 = 8388608(0x800000, float:1.17549435E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00e7
            r25 = r20
            goto L_0x00e9
        L_0x00e7:
            r25 = r51
        L_0x00e9:
            r26 = 16777216(0x1000000, float:2.3509887E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00f0
            goto L_0x00f2
        L_0x00f0:
            r20 = r52
        L_0x00f2:
            r26 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 & r26
            if (r0 == 0) goto L_0x00fd
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x00ff
        L_0x00fd:
            r0 = r53
        L_0x00ff:
            r28 = r27
            r29 = r1
            r30 = r3
            r31 = r4
            r32 = r5
            r33 = r7
            r34 = r8
            r35 = r9
            r36 = r10
            r37 = r11
            r38 = r12
            r39 = r13
            r40 = r14
            r41 = r15
            r42 = r6
            r43 = r2
            r44 = r16
            r45 = r17
            r46 = r18
            r47 = r19
            r48 = r21
            r49 = r22
            r50 = r23
            r51 = r24
            r52 = r25
            r53 = r20
            r54 = r0
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.service.models.StoreService.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, com.carrefour.fid.android.domain.models.service.models.StoreServiceType, boolean, boolean, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
