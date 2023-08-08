package com.carrefour.fid.android.service.presentation.p044ui.drive.summary;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.service.presentation.viewmodels.drive.NavArgumentsKt;
import kotlin.C11076d0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\t\u0010\r\u001a\u00020\u0006HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/drive/summary/DriveSummaryFragmentArgs;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "toBundle", "Landroidx/lifecycle/p0;", "toSavedStateHandle", "", "component1", "", "component2", "anabel", "distanceMeters", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getAnabel", "()Ljava/lang/String;", "F", "getDistanceMeters", "()F", "<init>", "(Ljava/lang/String;F)V", "Companion", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryFragmentArgs */
public final class DriveSummaryFragmentArgs implements C19764l {
    public static final int $stable = 0;
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12579k
    private final String anabel;
    private final float distanceMeters;

    @C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/drive/summary/DriveSummaryFragmentArgs$Companion;", "", "Landroid/os/Bundle;", "bundle", "Lcom/carrefour/fid/android/service/presentation/ui/drive/summary/DriveSummaryFragmentArgs;", "fromBundle", "Landroidx/lifecycle/p0;", "savedStateHandle", "fromSavedStateHandle", "<init>", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryFragmentArgs$Companion */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        public final DriveSummaryFragmentArgs fromBundle(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(DriveSummaryFragmentArgs.class.getClassLoader());
            if (bundle.containsKey(NavArgumentsKt.ANABEL_KEY)) {
                String string = bundle.getString(NavArgumentsKt.ANABEL_KEY);
                if (string == null) {
                    throw new IllegalArgumentException("Argument \"anabel\" is marked as non-null but was passed a null value.");
                } else if (bundle.containsKey("distance_meters")) {
                    return new DriveSummaryFragmentArgs(string, bundle.getFloat("distance_meters"));
                } else {
                    throw new IllegalArgumentException("Required argument \"distance_meters\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"anabel\" is missing and does not have an android:defaultValue");
            }
        }

        @C12579k
        @C11384m
        public final DriveSummaryFragmentArgs fromSavedStateHandle(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f(NavArgumentsKt.ANABEL_KEY)) {
                String str = (String) p0Var.mo57648h(NavArgumentsKt.ANABEL_KEY);
                if (str == null) {
                    throw new IllegalArgumentException("Argument \"anabel\" is marked as non-null but was passed a null value");
                } else if (p0Var.mo57647f("distance_meters")) {
                    Float f = (Float) p0Var.mo57648h("distance_meters");
                    if (f != null) {
                        return new DriveSummaryFragmentArgs(str, f.floatValue());
                    }
                    throw new IllegalArgumentException("Argument \"distance_meters\" of type float does not support null values");
                } else {
                    throw new IllegalArgumentException("Required argument \"distance_meters\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"anabel\" is missing and does not have an android:defaultValue");
            }
        }

        private Companion() {
        }
    }

    public DriveSummaryFragmentArgs(@C12579k String str, float f) {
        Intrinsics.checkNotNullParameter(str, NavArgumentsKt.ANABEL_KEY);
        this.anabel = str;
        this.distanceMeters = f;
    }

    public static /* synthetic */ DriveSummaryFragmentArgs copy$default(DriveSummaryFragmentArgs driveSummaryFragmentArgs, String str, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = driveSummaryFragmentArgs.anabel;
        }
        if ((i & 2) != 0) {
            f = driveSummaryFragmentArgs.distanceMeters;
        }
        return driveSummaryFragmentArgs.copy(str, f);
    }

    @C12579k
    @C11384m
    public static final DriveSummaryFragmentArgs fromBundle(@C12579k Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    @C12579k
    @C11384m
    public static final DriveSummaryFragmentArgs fromSavedStateHandle(@C12579k C19456p0 p0Var) {
        return Companion.fromSavedStateHandle(p0Var);
    }

    @C12579k
    public final String component1() {
        return this.anabel;
    }

    public final float component2() {
        return this.distanceMeters;
    }

    @C12579k
    public final DriveSummaryFragmentArgs copy(@C12579k String str, float f) {
        Intrinsics.checkNotNullParameter(str, NavArgumentsKt.ANABEL_KEY);
        return new DriveSummaryFragmentArgs(str, f);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriveSummaryFragmentArgs)) {
            return false;
        }
        DriveSummaryFragmentArgs driveSummaryFragmentArgs = (DriveSummaryFragmentArgs) obj;
        return Intrinsics.areEqual((Object) this.anabel, (Object) driveSummaryFragmentArgs.anabel) && Float.compare(this.distanceMeters, driveSummaryFragmentArgs.distanceMeters) == 0;
    }

    @C12579k
    public final String getAnabel() {
        return this.anabel;
    }

    public final float getDistanceMeters() {
        return this.distanceMeters;
    }

    public int hashCode() {
        return (this.anabel.hashCode() * 31) + Float.hashCode(this.distanceMeters);
    }

    @C12579k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(NavArgumentsKt.ANABEL_KEY, this.anabel);
        bundle.putFloat("distance_meters", this.distanceMeters);
        return bundle;
    }

    @C12579k
    public final C19456p0 toSavedStateHandle() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q(NavArgumentsKt.ANABEL_KEY, this.anabel);
        p0Var.mo57656q("distance_meters", Float.valueOf(this.distanceMeters));
        return p0Var;
    }

    @C12579k
    public String toString() {
        String str = this.anabel;
        float f = this.distanceMeters;
        return "DriveSummaryFragmentArgs(anabel=" + str + ", distanceMeters=" + f + ")";
    }
}
