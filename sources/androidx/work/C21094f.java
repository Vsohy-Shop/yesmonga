package androidx.work;

import android.app.Notification;
import androidx.annotation.C0359n0;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: androidx.work.f */
public final class C21094f {

    /* renamed from: a */
    public final int f54446a;

    /* renamed from: b */
    public final int f54447b;

    /* renamed from: c */
    public final Notification f54448c;

    public C21094f(int i, @C0359n0 Notification notification) {
        this(i, notification, 0);
    }

    /* renamed from: a */
    public int mo63193a() {
        return this.f54447b;
    }

    @C0359n0
    /* renamed from: b */
    public Notification mo63194b() {
        return this.f54448c;
    }

    /* renamed from: c */
    public int mo63195c() {
        return this.f54446a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21094f.class != obj.getClass()) {
            return false;
        }
        C21094f fVar = (C21094f) obj;
        if (this.f54446a == fVar.f54446a && this.f54447b == fVar.f54447b) {
            return this.f54448c.equals(fVar.f54448c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f54446a * 31) + this.f54447b) * 31) + this.f54448c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{" + "mNotificationId=" + this.f54446a + ", mForegroundServiceType=" + this.f54447b + ", mNotification=" + this.f54448c + C12361b.f30259j;
    }

    public C21094f(int i, @C0359n0 Notification notification, int i2) {
        this.f54446a = i;
        this.f54448c = notification;
        this.f54447b = i2;
    }
}
