package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/window/sidecar/SidecarDisplayFeature;", "", "a", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class SidecarAdapter$translate$checkedFeature$2 extends Lambda implements C11300l<SidecarDisplayFeature, Boolean> {

    /* renamed from: f */
    public static final SidecarAdapter$translate$checkedFeature$2 f54239f = new SidecarAdapter$translate$checkedFeature$2();

    public SidecarAdapter$translate$checkedFeature$2() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final Boolean invoke(@C12579k SidecarDisplayFeature sidecarDisplayFeature) {
        boolean z;
        Intrinsics.checkNotNullParameter(sidecarDisplayFeature, "$this$require");
        if (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
