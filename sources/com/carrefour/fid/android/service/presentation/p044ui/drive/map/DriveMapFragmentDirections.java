package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.service.C28330R;
import com.carrefour.fid.android.service.presentation.viewmodels.drive.NavArgumentsKt;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/drive/map/DriveMapFragmentDirections;", "", "()V", "ActionDriveMapFragmentToDriveSummaryFragment", "Companion", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragmentDirections */
public final class DriveMapFragmentDirections {
    public static final int $stable = 0;
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/drive/map/DriveMapFragmentDirections$ActionDriveMapFragmentToDriveSummaryFragment;", "Landroidx/navigation/b0;", "", "component1", "", "component2", "anabel", "distanceMeters", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getAnabel", "()Ljava/lang/String;", "F", "getDistanceMeters", "()F", "actionId", "I", "getActionId", "()I", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "arguments", "<init>", "(Ljava/lang/String;F)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragmentDirections$ActionDriveMapFragmentToDriveSummaryFragment */
    public static final class ActionDriveMapFragmentToDriveSummaryFragment implements C19693b0 {
        private final int actionId = C28330R.C28334id.action_driveMapFragment_to_driveSummaryFragment;
        @C12579k
        private final String anabel;
        private final float distanceMeters;

        public ActionDriveMapFragmentToDriveSummaryFragment(@C12579k String str, float f) {
            Intrinsics.checkNotNullParameter(str, NavArgumentsKt.ANABEL_KEY);
            this.anabel = str;
            this.distanceMeters = f;
        }

        public static /* synthetic */ ActionDriveMapFragmentToDriveSummaryFragment copy$default(ActionDriveMapFragmentToDriveSummaryFragment actionDriveMapFragmentToDriveSummaryFragment, String str, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actionDriveMapFragmentToDriveSummaryFragment.anabel;
            }
            if ((i & 2) != 0) {
                f = actionDriveMapFragmentToDriveSummaryFragment.distanceMeters;
            }
            return actionDriveMapFragmentToDriveSummaryFragment.copy(str, f);
        }

        @C12579k
        public final String component1() {
            return this.anabel;
        }

        public final float component2() {
            return this.distanceMeters;
        }

        @C12579k
        public final ActionDriveMapFragmentToDriveSummaryFragment copy(@C12579k String str, float f) {
            Intrinsics.checkNotNullParameter(str, NavArgumentsKt.ANABEL_KEY);
            return new ActionDriveMapFragmentToDriveSummaryFragment(str, f);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionDriveMapFragmentToDriveSummaryFragment)) {
                return false;
            }
            ActionDriveMapFragmentToDriveSummaryFragment actionDriveMapFragmentToDriveSummaryFragment = (ActionDriveMapFragmentToDriveSummaryFragment) obj;
            return Intrinsics.areEqual((Object) this.anabel, (Object) actionDriveMapFragmentToDriveSummaryFragment.anabel) && Float.compare(this.distanceMeters, actionDriveMapFragmentToDriveSummaryFragment.distanceMeters) == 0;
        }

        public int getActionId() {
            return this.actionId;
        }

        @C12579k
        public final String getAnabel() {
            return this.anabel;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(NavArgumentsKt.ANABEL_KEY, this.anabel);
            bundle.putFloat("distance_meters", this.distanceMeters);
            return bundle;
        }

        public final float getDistanceMeters() {
            return this.distanceMeters;
        }

        public int hashCode() {
            return (this.anabel.hashCode() * 31) + Float.hashCode(this.distanceMeters);
        }

        @C12579k
        public String toString() {
            String str = this.anabel;
            float f = this.distanceMeters;
            return "ActionDriveMapFragmentToDriveSummaryFragment(anabel=" + str + ", distanceMeters=" + f + ")";
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/drive/map/DriveMapFragmentDirections$Companion;", "", "", "anabel", "", "distanceMeters", "Landroidx/navigation/b0;", "actionDriveMapFragmentToDriveSummaryFragment", "<init>", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragmentDirections$Companion */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C19693b0 actionDriveMapFragmentToDriveSummaryFragment(@C12579k String str, float f) {
            Intrinsics.checkNotNullParameter(str, NavArgumentsKt.ANABEL_KEY);
            return new ActionDriveMapFragmentToDriveSummaryFragment(str, f);
        }

        private Companion() {
        }
    }

    private DriveMapFragmentDirections() {
    }
}
