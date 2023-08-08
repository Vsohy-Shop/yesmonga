package com.google.android.libraries.barhopper;

import androidx.annotation.RecentlyNonNull;
import com.google.android.apps.common.proguard.UsedByNative;

@UsedByNative("jni_common.cc")
public class OnedRecognitionOptions {
    @UsedByNative("jni_common.cc")
    private int codabarMinCodeLength = 6;
    @UsedByNative("jni_common.cc")
    private int codabarMinConsistentLines = 2;
    @UsedByNative("jni_common.cc")
    private int code128MinCodeLength = 2;
    @UsedByNative("jni_common.cc")
    private int code128MinConsistentLines = 1;
    @UsedByNative("jni_common.cc")
    private int code39MinCodeLength = 2;
    @UsedByNative("jni_common.cc")
    private int code39MinConsistentLines = 2;
    @UsedByNative("jni_common.cc")
    private boolean code39UseCheckDigit = false;
    @UsedByNative("jni_common.cc")
    private boolean code39UseExtendedMode = false;
    @UsedByNative("jni_common.cc")
    private int code93MinCodeLength = 2;
    @UsedByNative("jni_common.cc")
    private int code93MinConsistentLines = 2;
    @UsedByNative("jni_common.cc")
    private int ean13UpcaMinConsistentLines = 1;
    @UsedByNative("jni_common.cc")
    private int ean8MinConsistentLines = 3;
    @UsedByNative("jni_common.cc")
    private int itfMinCodeLength = 6;
    @UsedByNative("jni_common.cc")
    private int itfMinConsistentLines = 3;
    @UsedByNative("jni_common.cc")
    private int upceMinConsistentLines = 3;

    @RecentlyNonNull
    /* renamed from: A */
    public OnedRecognitionOptions mo87778A(int i) {
        this.ean8MinConsistentLines = i;
        return this;
    }

    @RecentlyNonNull
    /* renamed from: B */
    public OnedRecognitionOptions mo87779B(int i) {
        this.itfMinCodeLength = i;
        return this;
    }

    @RecentlyNonNull
    /* renamed from: C */
    public OnedRecognitionOptions mo87780C(int i) {
        this.itfMinConsistentLines = i;
        return this;
    }

    @RecentlyNonNull
    /* renamed from: D */
    public OnedRecognitionOptions mo87781D(int i) {
        this.upceMinConsistentLines = i;
        return this;
    }

    /* renamed from: a */
    public int mo87782a() {
        return this.codabarMinCodeLength;
    }

    /* renamed from: b */
    public int mo87783b() {
        return this.codabarMinConsistentLines;
    }

    /* renamed from: c */
    public int mo87784c() {
        return this.code128MinCodeLength;
    }

    /* renamed from: d */
    public int mo87785d() {
        return this.code128MinConsistentLines;
    }

    /* renamed from: e */
    public int mo87786e() {
        return this.code39MinCodeLength;
    }

    /* renamed from: f */
    public int mo87787f() {
        return this.code39MinConsistentLines;
    }

    /* renamed from: g */
    public boolean mo87788g() {
        return this.code39UseCheckDigit;
    }

    /* renamed from: h */
    public boolean mo87789h() {
        return this.code39UseExtendedMode;
    }

    /* renamed from: i */
    public int mo87790i() {
        return this.code93MinCodeLength;
    }

    /* renamed from: j */
    public int mo87791j() {
        return this.code93MinConsistentLines;
    }

    /* renamed from: k */
    public int mo87792k() {
        return this.ean13UpcaMinConsistentLines;
    }

    /* renamed from: l */
    public int mo87793l() {
        return this.ean8MinConsistentLines;
    }

    /* renamed from: m */
    public int mo87794m() {
        return this.itfMinCodeLength;
    }

    /* renamed from: n */
    public int mo87795n() {
        return this.itfMinConsistentLines;
    }

    /* renamed from: o */
    public int mo87796o() {
        return this.upceMinConsistentLines;
    }

    @RecentlyNonNull
    /* renamed from: p */
    public OnedRecognitionOptions mo87797p(int i) {
        this.codabarMinCodeLength = i;
        return this;
    }

    @RecentlyNonNull
    /* renamed from: q */
    public OnedRecognitionOptions mo87798q(int i) {
        this.codabarMinConsistentLines = i;
        return this;
    }

    @RecentlyNonNull
    /* renamed from: r */
    public OnedRecognitionOptions mo87799r(int i) {
        this.code128MinCodeLength = i;
        return this;
    }

    @RecentlyNonNull
    /* renamed from: s */
    public OnedRecognitionOptions mo87800s(int i) {
        this.code128MinConsistentLines = i;
        return this;
    }

    @RecentlyNonNull
    /* renamed from: t */
    public OnedRecognitionOptions mo87801t(int i) {
        this.code39MinCodeLength = i;
        return this;
    }

    @RecentlyNonNull
    /* renamed from: u */
    public OnedRecognitionOptions mo87802u(int i) {
        this.code39MinConsistentLines = i;
        return this;
    }

    @RecentlyNonNull
    /* renamed from: v */
    public OnedRecognitionOptions mo87803v(boolean z) {
        this.code39UseCheckDigit = z;
        return this;
    }

    @RecentlyNonNull
    /* renamed from: w */
    public OnedRecognitionOptions mo87804w(boolean z) {
        this.code39UseExtendedMode = z;
        return this;
    }

    @RecentlyNonNull
    /* renamed from: x */
    public OnedRecognitionOptions mo87805x(int i) {
        this.code93MinCodeLength = i;
        return this;
    }

    @RecentlyNonNull
    /* renamed from: y */
    public OnedRecognitionOptions mo87806y(int i) {
        this.code93MinConsistentLines = i;
        return this;
    }

    @RecentlyNonNull
    /* renamed from: z */
    public OnedRecognitionOptions mo87807z(int i) {
        this.ean13UpcaMinConsistentLines = i;
        return this;
    }
}
