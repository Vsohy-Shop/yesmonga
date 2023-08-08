package android.support.p002v4.p003os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p002v4.p003os.C0183a;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.f844c})
/* renamed from: android.support.v4.os.ResultReceiver */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C0180a();

    /* renamed from: a */
    public final boolean f619a;

    /* renamed from: b */
    public final Handler f620b;

    /* renamed from: c */
    public C0183a f621c;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    public class C0180a implements Parcelable.Creator<ResultReceiver> {
        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        /* renamed from: b */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    public class C0181b extends C0183a.C0185b {
        public C0181b() {
        }

        /* renamed from: U4 */
        public void mo682U4(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f620b;
            if (handler != null) {
                handler.post(new C0182c(i, bundle));
            } else {
                resultReceiver.mo78a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$c */
    public class C0182c implements Runnable {

        /* renamed from: a */
        public final int f623a;

        /* renamed from: b */
        public final Bundle f624b;

        public C0182c(int i, Bundle bundle) {
            this.f623a = i;
            this.f624b = bundle;
        }

        public void run() {
            ResultReceiver.this.mo78a(this.f623a, this.f624b);
        }
    }

    public ResultReceiver(Handler handler) {
        this.f619a = true;
        this.f620b = handler;
    }

    /* renamed from: a */
    public void mo78a(int i, Bundle bundle) {
    }

    /* renamed from: b */
    public void mo675b(int i, Bundle bundle) {
        if (this.f619a) {
            Handler handler = this.f620b;
            if (handler != null) {
                handler.post(new C0182c(i, bundle));
            } else {
                mo78a(i, bundle);
            }
        } else {
            C0183a aVar = this.f621c;
            if (aVar != null) {
                try {
                    aVar.mo682U4(i, bundle);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        synchronized (this) {
            if (this.f621c == null) {
                this.f621c = new C0181b();
            }
            parcel.writeStrongBinder(this.f621c.asBinder());
        }
    }

    public ResultReceiver(Parcel parcel) {
        this.f619a = false;
        this.f620b = null;
        this.f621c = C0183a.C0185b.m1175m0(parcel.readStrongBinder());
    }
}
