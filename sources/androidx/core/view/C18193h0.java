package androidx.core.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.core.view.h0 */
public final class C18193h0 {

    /* renamed from: a */
    public final DragAndDropPermissions f46800a;

    @C0376v0(24)
    /* renamed from: androidx.core.view.h0$a */
    public static class C18194a {
        @C0373u
        /* renamed from: a */
        public static void m82465a(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        @C0373u
        /* renamed from: b */
        public static DragAndDropPermissions m82466b(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    public C18193h0(DragAndDropPermissions dragAndDropPermissions) {
        this.f46800a = dragAndDropPermissions;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public static C18193h0 m82463b(@C0359n0 Activity activity, @C0359n0 DragEvent dragEvent) {
        DragAndDropPermissions b = C18194a.m82466b(activity, dragEvent);
        if (b != null) {
            return new C18193h0(b);
        }
        return null;
    }

    /* renamed from: a */
    public void mo52878a() {
        C18194a.m82465a(this.f46800a);
    }
}
