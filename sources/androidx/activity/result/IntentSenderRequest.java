package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.C11076d0;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.C10861c;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\n\u0014B1\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aB\u0011\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u001e"}, mo22516d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "Lkotlin/d2;", "writeToParcel", "Landroid/content/IntentSender;", "a", "Landroid/content/IntentSender;", "d", "()Landroid/content/IntentSender;", "intentSender", "Landroid/content/Intent;", "b", "Landroid/content/Intent;", "()Landroid/content/Intent;", "fillInIntent", "c", "I", "()I", "flagsMask", "flagsValues", "<init>", "(Landroid/content/IntentSender;Landroid/content/Intent;II)V", "parcel", "(Landroid/os/Parcel;)V", "e", "activity_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {
    @C12579k
    @C11287e
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new C0261b();
    @C12579k

    /* renamed from: e */
    public static final C0262c f789e = new C0262c((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final IntentSender f790a;
    @C12580l

    /* renamed from: b */
    public final Intent f791b;

    /* renamed from: c */
    public final int f792c;

    /* renamed from: d */
    public final int f793d;

    /* renamed from: androidx.activity.result.IntentSenderRequest$a */
    public static final class C0259a {
        @C12579k

        /* renamed from: a */
        public final IntentSender f794a;
        @C12580l

        /* renamed from: b */
        public Intent f795b;

        /* renamed from: c */
        public int f796c;

        /* renamed from: d */
        public int f797d;

        @C10861c(AnnotationRetention.f28066a)
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.activity.result.IntentSenderRequest$a$a */
        public @interface C0260a {
        }

        public C0259a(@C12579k IntentSender intentSender) {
            Intrinsics.checkNotNullParameter(intentSender, "intentSender");
            this.f794a = intentSender;
        }

        @C12579k
        /* renamed from: a */
        public final IntentSenderRequest mo891a() {
            return new IntentSenderRequest(this.f794a, this.f795b, this.f796c, this.f797d);
        }

        @C12579k
        /* renamed from: b */
        public final C0259a mo892b(@C12580l Intent intent) {
            this.f795b = intent;
            return this;
        }

        @C12579k
        /* renamed from: c */
        public final C0259a mo893c(int i, int i2) {
            this.f797d = i;
            this.f796c = i2;
            return this;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0259a(@org.jetbrains.annotations.C12579k android.app.PendingIntent r2) {
            /*
                r1 = this;
                java.lang.String r0 = "pendingIntent"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                android.content.IntentSender r2 = r2.getIntentSender()
                java.lang.String r0 = "pendingIntent.intentSender"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                r1.<init>((android.content.IntentSender) r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.IntentSenderRequest.C0259a.<init>(android.app.PendingIntent):void");
        }
    }

    /* renamed from: androidx.activity.result.IntentSenderRequest$b */
    public static final class C0261b implements Parcelable.Creator<IntentSenderRequest> {
        @C12579k
        /* renamed from: a */
        public IntentSenderRequest createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "inParcel");
            return new IntentSenderRequest(parcel);
        }

        @C12579k
        /* renamed from: b */
        public IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    }

    /* renamed from: androidx.activity.result.IntentSenderRequest$c */
    public static final class C0262c {
        public /* synthetic */ C0262c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ void m1398a() {
        }

        public C0262c() {
        }
    }

    public IntentSenderRequest(@C12579k IntentSender intentSender, @C12580l Intent intent, int i, int i2) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f790a = intentSender;
        this.f791b = intent;
        this.f792c = i;
        this.f793d = i2;
    }

    @C12580l
    /* renamed from: a */
    public final Intent mo885a() {
        return this.f791b;
    }

    /* renamed from: b */
    public final int mo886b() {
        return this.f792c;
    }

    /* renamed from: c */
    public final int mo887c() {
        return this.f793d;
    }

    @C12579k
    /* renamed from: d */
    public final IntentSender mo888d() {
        return this.f790a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeParcelable(this.f790a, i);
        parcel.writeParcelable(this.f791b, i);
        parcel.writeInt(this.f792c);
        parcel.writeInt(this.f793d);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(intentSender, (i3 & 2) != 0 ? null : intent, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IntentSenderRequest(@org.jetbrains.annotations.C12579k android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.IntentSenderRequest.<init>(android.os.Parcel):void");
    }
}
