package com.usabilla.sdk.ubform.sdk.form.model.theme.unity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.content.C17318d;
import com.squareup.moshi.C35383g;
import com.squareup.moshi.C35390i;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.sdk.form.model.MoodAmount;
import com.usabilla.sdk.ubform.sdk.form.model.ThemeImages;
import com.usabilla.sdk.ubform.utils.ext.C10133g;
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

@C35390i(generateAdapter = true)
@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BA\b\u0007\u0012\u000e\b\u0003\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\n\u0012\u000e\b\u0003\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\n\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b)\u0010*J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J \u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rHÖ\u0001R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\r8\u0002XD¢\u0006\f\n\u0004\b\u001f\u0010 \u0012\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\r8\u0002XD¢\u0006\f\n\u0004\b#\u0010 \u0012\u0004\b$\u0010\"R\u001a\u0010%\u001a\u00020\r8\u0002XD¢\u0006\f\n\u0004\b%\u0010 \u0012\u0004\b&\u0010\"R\u001a\u0010'\u001a\u00020\r8\u0002XD¢\u0006\f\n\u0004\b'\u0010 \u0012\u0004\b(\u0010\"¨\u0006+"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/theme/unity/UbImagesUnity;", "Landroid/os/Parcelable;", "Lcom/usabilla/sdk/ubform/sdk/form/model/ThemeImages;", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "star", "starOutline", "Lcom/usabilla/sdk/ubform/sdk/form/model/MoodAmount;", "amount", "", "selectedMoods", "unselectedMoods", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "", "selectedEmoticons", "Ljava/util/List;", "getSelectedEmoticons", "()Ljava/util/List;", "unselectedEmoticons", "getUnselectedEmoticons", "Ljava/lang/String;", "getStar", "()Ljava/lang/String;", "getStarOutline", "maxMoodIcons", "I", "getMaxMoodIcons$annotations", "()V", "firstItemIndex", "getFirstItemIndex$annotations", "middleItemIndex", "getMiddleItemIndex$annotations", "lastItemIndex", "getLastItemIndex$annotations", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@C12187d
public final class UbImagesUnity implements Parcelable, ThemeImages {
    @C12579k
    public static final Parcelable.Creator<UbImagesUnity> CREATOR = new Creator();
    private final transient int firstItemIndex;
    private final transient int lastItemIndex;
    private final transient int maxMoodIcons;
    private final transient int middleItemIndex;
    @C12579k
    private final List<String> selectedEmoticons;
    @C12580l
    private final String star;
    @C12580l
    private final String starOutline;
    @C12579k
    private final List<String> unselectedEmoticons;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
    public static final class Creator implements Parcelable.Creator<UbImagesUnity> {
        @C12579k
        public final UbImagesUnity createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UbImagesUnity(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        @C12579k
        public final UbImagesUnity[] newArray(int i) {
            return new UbImagesUnity[i];
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
    public UbImagesUnity() {
        this((List) null, (List) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
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
    public final List<String> getSelectedEmoticons() {
        return this.selectedEmoticons;
    }

    @C12580l
    public final String getStar() {
        return this.star;
    }

    @C12580l
    public final String getStarOutline() {
        return this.starOutline;
    }

    @C12579k
    public final List<String> getUnselectedEmoticons() {
        return this.unselectedEmoticons;
    }

    @C12579k
    public List<Drawable> selectedMoods(@C12579k Context context, @C12579k MoodAmount moodAmount) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(moodAmount, "amount");
        List<Drawable> E = CollectionsKt__CollectionsKt.m40441E();
        if (this.selectedEmoticons.size() == this.maxMoodIcons) {
            int i = WhenMappings.$EnumSwitchMapping$0[moodAmount.ordinal()];
            if (i == 1) {
                Iterable<String> L = CollectionsKt__CollectionsKt.m40448L(this.selectedEmoticons.get(this.firstItemIndex), this.selectedEmoticons.get(this.lastItemIndex));
                E = new ArrayList<>(C10978t.m41495Y(L, 10));
                for (String a : L) {
                    E.add(C10133g.m38339a(context, a));
                }
            } else if (i == 2) {
                Iterable<String> L2 = CollectionsKt__CollectionsKt.m40448L(this.selectedEmoticons.get(this.firstItemIndex), this.selectedEmoticons.get(this.middleItemIndex), this.selectedEmoticons.get(this.lastItemIndex));
                E = new ArrayList<>(C10978t.m41495Y(L2, 10));
                for (String a2 : L2) {
                    E.add(C10133g.m38339a(context, a2));
                }
            } else if (i == 3) {
                Iterable<String> iterable = this.selectedEmoticons;
                E = new ArrayList<>(C10978t.m41495Y(iterable, 10));
                for (String a3 : iterable) {
                    E.add(C10133g.m38339a(context, a3));
                }
            }
            return E;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[moodAmount.ordinal()];
        if (i2 == 1) {
            return CollectionsKt__CollectionsKt.m40448L(C17318d.m79726i(context, C9747c.C9755h.ub_mood_bmp_1), C17318d.m79726i(context, C9747c.C9755h.ub_mood_bmp_5));
        } else if (i2 == 2) {
            return CollectionsKt__CollectionsKt.m40448L(C17318d.m79726i(context, C9747c.C9755h.ub_mood_bmp_1), C17318d.m79726i(context, C9747c.C9755h.ub_mood_bmp_3), C17318d.m79726i(context, C9747c.C9755h.ub_mood_bmp_5));
        } else if (i2 != 3) {
            return E;
        } else {
            return CollectionsKt__CollectionsKt.m40448L(C17318d.m79726i(context, C9747c.C9755h.ub_mood_bmp_1), C17318d.m79726i(context, C9747c.C9755h.ub_mood_bmp_2), C17318d.m79726i(context, C9747c.C9755h.ub_mood_bmp_3), C17318d.m79726i(context, C9747c.C9755h.ub_mood_bmp_4), C17318d.m79726i(context, C9747c.C9755h.ub_mood_bmp_5));
        }
    }

    @C12580l
    public Drawable star(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        String str = this.star;
        if (str == null) {
            return null;
        }
        return C10133g.m38339a(context, str);
    }

    @C12580l
    public Drawable starOutline(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        String str = this.starOutline;
        if (str == null) {
            return null;
        }
        return C10133g.m38339a(context, str);
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
            Iterable<String> L = CollectionsKt__CollectionsKt.m40448L(this.unselectedEmoticons.get(this.firstItemIndex), this.unselectedEmoticons.get(this.lastItemIndex));
            E = new ArrayList<>(C10978t.m41495Y(L, 10));
            for (String a : L) {
                E.add(C10133g.m38339a(context, a));
            }
        } else if (i == 2) {
            Iterable<String> L2 = CollectionsKt__CollectionsKt.m40448L(this.unselectedEmoticons.get(this.firstItemIndex), this.unselectedEmoticons.get(this.middleItemIndex), this.unselectedEmoticons.get(this.lastItemIndex));
            E = new ArrayList<>(C10978t.m41495Y(L2, 10));
            for (String a2 : L2) {
                E.add(C10133g.m38339a(context, a2));
            }
        } else if (i == 3) {
            Iterable<String> iterable = this.unselectedEmoticons;
            E = new ArrayList<>(C10978t.m41495Y(iterable, 10));
            for (String a3 : iterable) {
                E.add(C10133g.m38339a(context, a3));
            }
        }
        return E;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeStringList(this.selectedEmoticons);
        parcel.writeStringList(this.unselectedEmoticons);
        parcel.writeString(this.star);
        parcel.writeString(this.starOutline);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbImagesUnity(@C35383g(name = "enabledEmoticons") @C12579k List<String> list) {
        this(list, (List) null, (String) null, (String) null, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "selectedEmoticons");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbImagesUnity(@C35383g(name = "enabledEmoticons") @C12579k List<String> list, @C35383g(name = "disabledEmoticons") @C12579k List<String> list2) {
        this(list, list2, (String) null, (String) null, 12, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "selectedEmoticons");
        Intrinsics.checkNotNullParameter(list2, "unselectedEmoticons");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbImagesUnity(@C35383g(name = "enabledEmoticons") @C12579k List<String> list, @C35383g(name = "disabledEmoticons") @C12579k List<String> list2, @C12580l String str) {
        this(list, list2, str, (String) null, 8, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "selectedEmoticons");
        Intrinsics.checkNotNullParameter(list2, "unselectedEmoticons");
    }

    @C11315i
    public UbImagesUnity(@C35383g(name = "enabledEmoticons") @C12579k List<String> list, @C35383g(name = "disabledEmoticons") @C12579k List<String> list2, @C12580l String str, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(list, "selectedEmoticons");
        Intrinsics.checkNotNullParameter(list2, "unselectedEmoticons");
        this.selectedEmoticons = list;
        this.unselectedEmoticons = list2;
        this.star = str;
        this.starOutline = str2;
        this.maxMoodIcons = 5;
        this.middleItemIndex = 2;
        this.lastItemIndex = 4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UbImagesUnity(List list, List list2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
