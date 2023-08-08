package android.support.p002v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0075a();

    /* renamed from: d */
    public static final String f236d = "Rating";

    /* renamed from: e */
    public static final int f237e = 0;

    /* renamed from: f */
    public static final int f238f = 1;

    /* renamed from: g */
    public static final int f239g = 2;

    /* renamed from: v */
    public static final int f240v = 3;

    /* renamed from: w */
    public static final int f241w = 4;

    /* renamed from: x */
    public static final int f242x = 5;

    /* renamed from: y */
    public static final int f243y = 6;

    /* renamed from: z */
    public static final float f244z = -1.0f;

    /* renamed from: a */
    public final int f245a;

    /* renamed from: b */
    public final float f246b;

    /* renamed from: c */
    public Object f247c;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    public static class C0075a implements Parcelable.Creator<RatingCompat> {
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    @RestrictTo({RestrictTo.Scope.f843b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.RatingCompat$b */
    public @interface C0076b {
    }

    @RestrictTo({RestrictTo.Scope.f843b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.RatingCompat$c */
    public @interface C0077c {
    }

    public RatingCompat(int i, float f) {
        this.f245a = i;
        this.f246b = f;
    }

    /* renamed from: a */
    public static RatingCompat m289a(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = m290i(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompat = m293l(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = m292k(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompat = m291j(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = m294m(ratingStyle);
            }
            ratingCompat.f247c = obj;
        }
        return ratingCompat;
    }

    /* renamed from: i */
    public static RatingCompat m290i(boolean z) {
        return new RatingCompat(1, z ? 1.0f : 0.0f);
    }

    /* renamed from: j */
    public static RatingCompat m291j(float f) {
        if (f < 0.0f || f > 100.0f) {
            return null;
        }
        return new RatingCompat(6, f);
    }

    /* renamed from: k */
    public static RatingCompat m292k(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else if (i != 5) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid rating style (");
            sb.append(i);
            sb.append(") for a star rating");
            return null;
        } else {
            f2 = 5.0f;
        }
        if (f < 0.0f || f > f2) {
            return null;
        }
        return new RatingCompat(i, f);
    }

    /* renamed from: l */
    public static RatingCompat m293l(boolean z) {
        return new RatingCompat(2, z ? 1.0f : 0.0f);
    }

    /* renamed from: m */
    public static RatingCompat m294m(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    /* renamed from: b */
    public float mo224b() {
        if (this.f245a != 6 || !mo230g()) {
            return -1.0f;
        }
        return this.f246b;
    }

    /* renamed from: c */
    public Object mo225c() {
        if (this.f247c == null) {
            if (mo230g()) {
                int i = this.f245a;
                switch (i) {
                    case 1:
                        this.f247c = Rating.newHeartRating(mo229f());
                        break;
                    case 2:
                        this.f247c = Rating.newThumbRating(mo231h());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f247c = Rating.newStarRating(i, mo228e());
                        break;
                    case 6:
                        this.f247c = Rating.newPercentageRating(mo224b());
                        break;
                    default:
                        return null;
                }
            } else {
                this.f247c = Rating.newUnratedRating(this.f245a);
            }
        }
        return this.f247c;
    }

    /* renamed from: d */
    public int mo226d() {
        return this.f245a;
    }

    public int describeContents() {
        return this.f245a;
    }

    /* renamed from: e */
    public float mo228e() {
        int i = this.f245a;
        if ((i == 3 || i == 4 || i == 5) && mo230g()) {
            return this.f246b;
        }
        return -1.0f;
    }

    /* renamed from: f */
    public boolean mo229f() {
        if (this.f245a == 1 && this.f246b == 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo230g() {
        return this.f246b >= 0.0f;
    }

    /* renamed from: h */
    public boolean mo231h() {
        if (this.f245a == 2 && this.f246b == 1.0f) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f245a);
        sb.append(" rating=");
        float f = this.f246b;
        if (f < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f);
        }
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f245a);
        parcel.writeFloat(this.f246b);
    }
}
