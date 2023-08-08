package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0324b1;
import androidx.annotation.C0327c1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17994n;
import java.util.Collection;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface DateSelector<S> extends Parcelable {
    @C0359n0
    /* renamed from: A2 */
    Collection<C17994n<Long, Long>> mo89284A2();

    @C0327c1
    /* renamed from: B1 */
    int mo89285B1(Context context);

    @C0359n0
    /* renamed from: C3 */
    Collection<Long> mo89286C3();

    /* renamed from: F2 */
    void mo89287F2(@C0359n0 S s);

    @C0363p0
    /* renamed from: H3 */
    S mo89288H3();

    /* renamed from: S3 */
    void mo89289S3(long j);

    @C0359n0
    /* renamed from: g3 */
    View mo89290g3(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle, @C0359n0 CalendarConstraints calendarConstraints, @C0359n0 C31319l<S> lVar);

    @C0324b1
    /* renamed from: n1 */
    int mo89291n1();

    /* renamed from: v3 */
    boolean mo89292v3();

    @C0359n0
    /* renamed from: w2 */
    String mo89293w2(Context context);
}
