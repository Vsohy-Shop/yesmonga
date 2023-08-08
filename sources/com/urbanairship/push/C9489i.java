package com.urbanairship.push;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.util.C17970d;
import com.urbanairship.C36071u;
import com.urbanairship.app.C36030b;
import com.urbanairship.app.C36038h;
import com.urbanairship.permission.C9425b;
import com.urbanairship.permission.C9426c;
import com.urbanairship.permission.PermissionStatus;
import com.urbanairship.push.notifications.C9516k;

/* renamed from: com.urbanairship.push.i */
public class C9489i implements C9425b {

    /* renamed from: g */
    public static final String f25910g = "NotificationsPermissionDelegate.prompted";

    /* renamed from: h */
    public static final String f25911h = "android.permission.POST_NOTIFICATIONS";

    /* renamed from: a */
    public final String f25912a;

    /* renamed from: b */
    public final C36071u f25913b;

    /* renamed from: c */
    public final C9516k f25914c;

    /* renamed from: d */
    public final AirshipNotificationManager f25915d;

    /* renamed from: e */
    public final C9492c f25916e;

    /* renamed from: f */
    public final C36030b f25917f;

    /* renamed from: com.urbanairship.push.i$a */
    public class C9490a extends C36038h {

        /* renamed from: a */
        public final /* synthetic */ C17970d f25918a;

        public C9490a(C17970d dVar) {
            this.f25918a = dVar;
        }

        public void onActivityResumed(@C0359n0 Activity activity) {
            if (C9489i.this.f25915d.mo19148b()) {
                this.f25918a.accept(C9426c.m35435c());
            } else {
                this.f25918a.accept(C9426c.m35434a(false));
            }
            C9489i.this.f25917f.mo18480a(this);
        }
    }

    /* renamed from: com.urbanairship.push.i$b */
    public static /* synthetic */ class C9491b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25920a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.urbanairship.push.AirshipNotificationManager$PromptSupport[] r0 = com.urbanairship.push.AirshipNotificationManager.PromptSupport.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25920a = r0
                com.urbanairship.push.AirshipNotificationManager$PromptSupport r1 = com.urbanairship.push.AirshipNotificationManager.PromptSupport.COMPAT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25920a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.urbanairship.push.AirshipNotificationManager$PromptSupport r1 = com.urbanairship.push.AirshipNotificationManager.PromptSupport.SUPPORTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25920a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.urbanairship.push.AirshipNotificationManager$PromptSupport r1 = com.urbanairship.push.AirshipNotificationManager.PromptSupport.NOT_SUPPORTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.push.C9489i.C9491b.<clinit>():void");
        }
    }

    /* renamed from: com.urbanairship.push.i$c */
    public interface C9492c {
        /* renamed from: a */
        void mo19261a(@C0359n0 Context context, @C0359n0 String str, @C0363p0 C17970d<C9426c> dVar);
    }

    public C9489i(@C0359n0 String str, @C0359n0 C36071u uVar, @C0359n0 AirshipNotificationManager airshipNotificationManager, @C0359n0 C9516k kVar, @C0359n0 C36030b bVar) {
        this(str, uVar, airshipNotificationManager, kVar, bVar, new C9488h());
    }

    @C0353k0
    /* renamed from: a */
    public void mo19124a(@C0359n0 Context context, @C0359n0 C17970d<C9426c> dVar) {
        if (this.f25915d.mo19148b()) {
            dVar.accept(C9426c.m35435c());
            return;
        }
        int i = C9491b.f25920a[this.f25915d.mo19149d().ordinal()];
        if (i == 1) {
            this.f25913b.mo107857v(f25910g, true);
            if (!this.f25915d.mo19147a()) {
                this.f25914c.mo19356j(this.f25912a);
                this.f25917f.mo18484e(new C9490a(dVar));
                return;
            }
            dVar.accept(C9426c.m35434a(true));
        } else if (i == 2) {
            this.f25913b.mo107857v(f25910g, true);
            this.f25916e.mo19261a(context, f25911h, dVar);
        } else if (i == 3) {
            dVar.accept(C9426c.m35434a(true));
        }
    }

    /* renamed from: b */
    public void mo19125b(@C0359n0 Context context, @C0359n0 C17970d<PermissionStatus> dVar) {
        PermissionStatus permissionStatus;
        if (this.f25915d.mo19148b()) {
            permissionStatus = PermissionStatus.GRANTED;
        } else {
            int i = C9491b.f25920a[this.f25915d.mo19149d().ordinal()];
            if (i != 1 && i != 2) {
                permissionStatus = PermissionStatus.DENIED;
            } else if (this.f25913b.mo107843f(f25910g, false)) {
                permissionStatus = PermissionStatus.DENIED;
            } else {
                permissionStatus = PermissionStatus.NOT_DETERMINED;
            }
        }
        dVar.accept(permissionStatus);
    }

    @C0344h1
    public C9489i(@C0359n0 String str, @C0359n0 C36071u uVar, @C0359n0 AirshipNotificationManager airshipNotificationManager, @C0359n0 C9516k kVar, @C0359n0 C36030b bVar, @C0359n0 C9492c cVar) {
        this.f25912a = str;
        this.f25913b = uVar;
        this.f25915d = airshipNotificationManager;
        this.f25914c = kVar;
        this.f25917f = bVar;
        this.f25916e = cVar;
    }
}
