package com.usabilla.sdk.ubform.sdk.form.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0375v;
import androidx.appcompat.content.res.C0507a;
import androidx.core.content.C17318d;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BA\b\u0007\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\"\u0010#J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rHÖ\u0001R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\r8\u0002XD¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\r8\u0002XD¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u0012\u0004\b\u001d\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\r8\u0002XD¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u0012\u0004\b\u001f\u0010\u001bR\u001a\u0010 \u001a\u00020\r8\u0002XD¢\u0006\f\n\u0004\b \u0010\u0019\u0012\u0004\b!\u0010\u001b¨\u0006$"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/UbImages;", "Landroid/os/Parcelable;", "Lcom/usabilla/sdk/ubform/sdk/form/model/ThemeImages;", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "star", "starOutline", "Lcom/usabilla/sdk/ubform/sdk/form/model/MoodAmount;", "amount", "", "selectedMoods", "unselectedMoods", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "selectedEmoticons", "Ljava/util/List;", "unselectedEmoticons", "Ljava/lang/Integer;", "maxMoodIcons", "I", "getMaxMoodIcons$annotations", "()V", "firstItemIndex", "getFirstItemIndex$annotations", "middleItemIndex", "getMiddleItemIndex$annotations", "lastItemIndex", "getLastItemIndex$annotations", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@C12187d
public final class UbImages implements Parcelable, ThemeImages {
    @C12579k
    public static final Parcelable.Creator<UbImages> CREATOR = new Creator();
    private final int firstItemIndex;
    private final int lastItemIndex;
    private final int maxMoodIcons;
    private final int middleItemIndex;
    @C12579k
    private final List<Integer> selectedEmoticons;
    @C12580l
    private final Integer star;
    @C12580l
    private final Integer starOutline;
    @C12579k
    private final List<Integer> unselectedEmoticons;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
    public static final class Creator implements Parcelable.Creator<UbImages> {
        @C12579k
        public final UbImages createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(Integer.valueOf(parcel.readInt()));
            }
            Integer num = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new UbImages(arrayList, arrayList2, valueOf, num);
        }

        @C12579k
        public final UbImages[] newArray(int i) {
            return new UbImages[i];
        }
    }

    @C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MoodAmount.values().length];
            iArr[MoodAmount.TWO.ordinal()] = 1;
            iArr[MoodAmount.THREE.ordinal()] = 2;
            iArr[MoodAmount.FIVE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @C11315i
    public UbImages() {
        this((List) null, (List) null, (Integer) null, (Integer) null, 15, (DefaultConstructorMarker) null);
    }

    private static /* synthetic */ void getFirstItemIndex$annotations() {
    }

    private static /* synthetic */ void getLastItemIndex$annotations() {
    }

    private static /* synthetic */ void getMaxMoodIcons$annotations() {
    }

    private static /* synthetic */ void getMiddleItemIndex$annotations() {
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    public List<Drawable> selectedMoods(@C12579k Context context, @C12579k MoodAmount moodAmount) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(moodAmount, "amount");
        List<Drawable> E = CollectionsKt__CollectionsKt.m40441E();
        if (this.selectedEmoticons.size() == this.maxMoodIcons) {
            int i = WhenMappings.$EnumSwitchMapping$0[moodAmount.ordinal()];
            if (i == 1) {
                Iterable<Number> L = CollectionsKt__CollectionsKt.m40448L(this.selectedEmoticons.get(this.firstItemIndex), this.selectedEmoticons.get(this.lastItemIndex));
                E = new ArrayList<>(C10978t.m41495Y(L, 10));
                for (Number intValue : L) {
                    Drawable i2 = C17318d.m79726i(context, intValue.intValue());
                    Intrinsics.checkNotNull(i2);
                    E.add(i2);
                }
            } else if (i == 2) {
                Iterable<Number> L2 = CollectionsKt__CollectionsKt.m40448L(this.selectedEmoticons.get(this.firstItemIndex), this.selectedEmoticons.get(this.middleItemIndex), this.selectedEmoticons.get(this.lastItemIndex));
                E = new ArrayList<>(C10978t.m41495Y(L2, 10));
                for (Number intValue2 : L2) {
                    Drawable i3 = C17318d.m79726i(context, intValue2.intValue());
                    Intrinsics.checkNotNull(i3);
                    E.add(i3);
                }
            } else if (i == 3) {
                Iterable<Number> iterable = this.selectedEmoticons;
                E = new ArrayList<>(C10978t.m41495Y(iterable, 10));
                for (Number intValue3 : iterable) {
                    Drawable i4 = C17318d.m79726i(context, intValue3.intValue());
                    Intrinsics.checkNotNull(i4);
                    E.add(i4);
                }
            }
            return E;
        }
        int i5 = WhenMappings.$EnumSwitchMapping$0[moodAmount.ordinal()];
        if (i5 == 1) {
            Drawable i6 = C17318d.m79726i(context, C9747c.C9755h.ub_mood_bmp_1);
            Intrinsics.checkNotNull(i6);
            Intrinsics.checkNotNullExpressionValue(i6, "getDrawable(context, R.drawable.ub_mood_bmp_1)!!");
            Drawable i7 = C17318d.m79726i(context, C9747c.C9755h.ub_mood_bmp_5);
            Intrinsics.checkNotNull(i7);
            Intrinsics.checkNotNullExpressionValue(i7, "getDrawable(context, R.drawable.ub_mood_bmp_5)!!");
            return CollectionsKt__CollectionsKt.m40448L(i6, i7);
        } else if (i5 == 2) {
            Drawable i8 = C17318d.m79726i(context, C9747c.C9755h.ub_mood_bmp_1);
            Intrinsics.checkNotNull(i8);
            Intrinsics.checkNotNullExpressionValue(i8, "getDrawable(context, R.drawable.ub_mood_bmp_1)!!");
            Drawable i9 = C17318d.m79726i(context, C9747c.C9755h.ub_mood_bmp_3);
            Intrinsics.checkNotNull(i9);
            Intrinsics.checkNotNullExpressionValue(i9, "getDrawable(context, R.drawable.ub_mood_bmp_3)!!");
            Drawable i10 = C17318d.m79726i(context, C9747c.C9755h.ub_mood_bmp_5);
            Intrinsics.checkNotNull(i10);
            Intrinsics.checkNotNullExpressionValue(i10, "getDrawable(context, R.drawable.ub_mood_bmp_5)!!");
            return CollectionsKt__CollectionsKt.m40448L(i8, i9, i10);
        } else if (i5 != 3) {
            return E;
        } else {
            Drawable i11 = C17318d.m79726i(context, C9747c.C9755h.ub_mood_bmp_1);
            Intrinsics.checkNotNull(i11);
            Intrinsics.checkNotNullExpressionValue(i11, "getDrawable(context, R.drawable.ub_mood_bmp_1)!!");
            Drawable i12 = C17318d.m79726i(context, C9747c.C9755h.ub_mood_bmp_2);
            Intrinsics.checkNotNull(i12);
            Intrinsics.checkNotNullExpressionValue(i12, "getDrawable(context, R.drawable.ub_mood_bmp_2)!!");
            Drawable i13 = C17318d.m79726i(context, C9747c.C9755h.ub_mood_bmp_3);
            Intrinsics.checkNotNull(i13);
            Intrinsics.checkNotNullExpressionValue(i13, "getDrawable(context, R.drawable.ub_mood_bmp_3)!!");
            Drawable i14 = C17318d.m79726i(context, C9747c.C9755h.ub_mood_bmp_4);
            Intrinsics.checkNotNull(i14);
            Intrinsics.checkNotNullExpressionValue(i14, "getDrawable(context, R.drawable.ub_mood_bmp_4)!!");
            Drawable i15 = C17318d.m79726i(context, C9747c.C9755h.ub_mood_bmp_5);
            Intrinsics.checkNotNull(i15);
            Intrinsics.checkNotNullExpressionValue(i15, "getDrawable(context, R.drawable.ub_mood_bmp_5)!!");
            return CollectionsKt__CollectionsKt.m40448L(i11, i12, i13, i14, i15);
        }
    }

    @C12580l
    public Drawable star(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Integer num = this.star;
        if (num == null) {
            return null;
        }
        return C0507a.m2346b(context, num.intValue());
    }

    @C12580l
    public Drawable starOutline(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Integer num = this.starOutline;
        if (num == null) {
            return null;
        }
        return C0507a.m2346b(context, num.intValue());
    }

    @C12579k
    public List<Drawable> unselectedMoods(@C12579k Context context, @C12579k MoodAmount moodAmount) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(moodAmount, "amount");
        List<Drawable> E = CollectionsKt__CollectionsKt.m40441E();
        if (this.unselectedEmoticons.size() != this.maxMoodIcons) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        int i = WhenMappings.$EnumSwitchMapping$0[moodAmount.ordinal()];
        if (i == 1) {
            Iterable<Number> L = CollectionsKt__CollectionsKt.m40448L(this.unselectedEmoticons.get(this.firstItemIndex), this.unselectedEmoticons.get(this.lastItemIndex));
            E = new ArrayList<>(C10978t.m41495Y(L, 10));
            for (Number intValue : L) {
                Drawable i2 = C17318d.m79726i(context, intValue.intValue());
                Intrinsics.checkNotNull(i2);
                E.add(i2);
            }
        } else if (i == 2) {
            Iterable<Number> L2 = CollectionsKt__CollectionsKt.m40448L(this.unselectedEmoticons.get(this.firstItemIndex), this.unselectedEmoticons.get(this.middleItemIndex), this.unselectedEmoticons.get(this.lastItemIndex));
            E = new ArrayList<>(C10978t.m41495Y(L2, 10));
            for (Number intValue2 : L2) {
                Drawable i3 = C17318d.m79726i(context, intValue2.intValue());
                Intrinsics.checkNotNull(i3);
                E.add(i3);
            }
        } else if (i == 3) {
            Iterable<Number> iterable = this.unselectedEmoticons;
            E = new ArrayList<>(C10978t.m41495Y(iterable, 10));
            for (Number intValue3 : iterable) {
                Drawable i4 = C17318d.m79726i(context, intValue3.intValue());
                Intrinsics.checkNotNull(i4);
                E.add(i4);
            }
        }
        return E;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<Integer> list = this.selectedEmoticons;
        parcel.writeInt(list.size());
        for (Integer intValue : list) {
            parcel.writeInt(intValue.intValue());
        }
        List<Integer> list2 = this.unselectedEmoticons;
        parcel.writeInt(list2.size());
        for (Integer intValue2 : list2) {
            parcel.writeInt(intValue2.intValue());
        }
        Integer num = this.star;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.starOutline;
        if (num2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num2.intValue());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbImages(@C12579k List<Integer> list) {
        this(list, (List) null, (Integer) null, (Integer) null, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "selectedEmoticons");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbImages(@C12579k List<Integer> list, @C12579k List<Integer> list2) {
        this(list, list2, (Integer) null, (Integer) null, 12, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "selectedEmoticons");
        Intrinsics.checkNotNullParameter(list2, "unselectedEmoticons");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbImages(@C12579k List<Integer> list, @C12579k List<Integer> list2, @C0375v @C12580l Integer num) {
        this(list, list2, num, (Integer) null, 8, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "selectedEmoticons");
        Intrinsics.checkNotNullParameter(list2, "unselectedEmoticons");
    }

    @C11315i
    public UbImages(@C12579k List<Integer> list, @C12579k List<Integer> list2, @C0375v @C12580l Integer num, @C0375v @C12580l Integer num2) {
        Intrinsics.checkNotNullParameter(list, "selectedEmoticons");
        Intrinsics.checkNotNullParameter(list2, "unselectedEmoticons");
        this.selectedEmoticons = list;
        this.unselectedEmoticons = list2;
        this.star = num;
        this.starOutline = num2;
        this.maxMoodIcons = 5;
        this.middleItemIndex = 2;
        this.lastItemIndex = 4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UbImages(List list, List list2, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2);
    }
}
