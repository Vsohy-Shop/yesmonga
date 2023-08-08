package com.urbanairship.util;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.content.C17318d;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.util.f */
public class C9648f implements C9660l {

    /* renamed from: a */
    public final Context f26436a;

    /* renamed from: b */
    public final AttributeSet f26437b;

    public C9648f(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        this.f26436a = context;
        this.f26437b = attributeSet;
    }

    /* renamed from: a */
    public long mo19608a(@C0359n0 String str, long j) {
        String d = mo19611d(str);
        if (C9669o0.m36224e(d)) {
            return j;
        }
        return Long.parseLong(d);
    }

    /* renamed from: b */
    public boolean mo19609b(@C0359n0 String str, boolean z) {
        int attributeResourceValue = this.f26437b.getAttributeResourceValue((String) null, str, 0);
        if (attributeResourceValue != 0) {
            return this.f26436a.getResources().getBoolean(attributeResourceValue);
        }
        return this.f26437b.getAttributeBooleanValue((String) null, str, z);
    }

    /* renamed from: c */
    public int mo19610c(@C0359n0 String str, int i) {
        String d = mo19611d(str);
        if (C9669o0.m36224e(d)) {
            return i;
        }
        return Integer.parseInt(d);
    }

    @C0363p0
    /* renamed from: d */
    public String mo19611d(@C0359n0 String str) {
        int attributeResourceValue = this.f26437b.getAttributeResourceValue((String) null, str, 0);
        if (attributeResourceValue != 0) {
            return this.f26436a.getString(attributeResourceValue);
        }
        return this.f26437b.getAttributeValue((String) null, str);
    }

    @C0363p0
    /* renamed from: f */
    public String[] mo19612f(@C0359n0 String str) {
        int attributeResourceValue = this.f26437b.getAttributeResourceValue((String) null, str, 0);
        if (attributeResourceValue != 0) {
            return this.f26436a.getResources().getStringArray(attributeResourceValue);
        }
        String attributeValue = this.f26437b.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return new String[0];
        }
        return attributeValue.split("[, ]+");
    }

    /* renamed from: g */
    public int mo19613g(@C0359n0 String str) {
        int attributeResourceValue = this.f26437b.getAttributeResourceValue((String) null, str, 0);
        if (attributeResourceValue != 0) {
            return attributeResourceValue;
        }
        String attributeValue = this.f26437b.getAttributeValue((String) null, str);
        if (attributeValue != null) {
            return this.f26436a.getResources().getIdentifier(attributeValue, "raw", this.f26436a.getPackageName());
        }
        return 0;
    }

    public int getCount() {
        return this.f26437b.getAttributeCount();
    }

    @C0363p0
    public String getName(int i) {
        if (i < getCount() && i >= 0) {
            return this.f26437b.getAttributeName(i);
        }
        throw new IndexOutOfBoundsException("Index out of bounds: " + i + " count: " + getCount());
    }

    /* renamed from: i */
    public int mo19616i(@C0359n0 String str) {
        int attributeResourceValue = this.f26437b.getAttributeResourceValue((String) null, str, 0);
        if (attributeResourceValue != 0) {
            return attributeResourceValue;
        }
        String attributeValue = this.f26437b.getAttributeValue((String) null, str);
        if (attributeValue != null) {
            return this.f26436a.getResources().getIdentifier(attributeValue, "drawable", this.f26436a.getPackageName());
        }
        return 0;
    }

    @C0354l
    /* renamed from: j */
    public int mo19617j(@C0359n0 String str, @C0354l int i) {
        int attributeResourceValue = this.f26437b.getAttributeResourceValue((String) null, str, 0);
        if (attributeResourceValue != 0) {
            return C17318d.m79723f(this.f26436a, attributeResourceValue);
        }
        String d = mo19611d(str);
        if (C9669o0.m36224e(d)) {
            return i;
        }
        return Color.parseColor(d);
    }

    @C0359n0
    /* renamed from: k */
    public String mo19618k(@C0359n0 String str, @C0359n0 String str2) {
        String d = mo19611d(str);
        return d == null ? str2 : d;
    }
}
