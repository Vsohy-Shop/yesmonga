package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class ReviewInfo implements Parcelable {
    /* renamed from: b */
    public static ReviewInfo m130033b(PendingIntent pendingIntent) {
        return new C32119a(pendingIntent);
    }

    /* renamed from: a */
    public abstract PendingIntent mo92871a();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(mo92871a(), 0);
    }
}
