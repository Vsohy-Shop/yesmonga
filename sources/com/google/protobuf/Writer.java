package com.google.protobuf;

import com.google.protobuf.C34363f1;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface Writer {

    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    @Deprecated
    /* renamed from: A */
    void mo100787A(int i) throws IOException;

    /* renamed from: B */
    void mo100788B(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: C */
    void mo100789C(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: D */
    void mo100790D(int i, List<Boolean> list, boolean z) throws IOException;

    @Deprecated
    /* renamed from: E */
    void mo100791E(int i, Object obj) throws IOException;

    /* renamed from: F */
    void mo100792F(int i, float f) throws IOException;

    @Deprecated
    /* renamed from: G */
    void mo100793G(int i) throws IOException;

    /* renamed from: H */
    void mo100794H(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: I */
    void mo100795I(int i, int i2) throws IOException;

    /* renamed from: J */
    void mo100796J(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: K */
    void mo100797K(int i, List<Double> list, boolean z) throws IOException;

    /* renamed from: L */
    void mo100798L(int i, int i2) throws IOException;

    /* renamed from: M */
    void mo100799M(int i, List<ByteString> list) throws IOException;

    /* renamed from: N */
    void mo100800N(int i, List<?> list, C34372g2 g2Var) throws IOException;

    @Deprecated
    /* renamed from: O */
    void mo100801O(int i, Object obj, C34372g2 g2Var) throws IOException;

    /* renamed from: P */
    void mo100802P(int i, ByteString byteString) throws IOException;

    @Deprecated
    /* renamed from: Q */
    void mo100803Q(int i, List<?> list, C34372g2 g2Var) throws IOException;

    /* renamed from: R */
    void mo100804R(int i, Object obj, C34372g2 g2Var) throws IOException;

    /* renamed from: S */
    <K, V> void mo100805S(int i, C34363f1.C34365b<K, V> bVar, Map<K, V> map) throws IOException;

    /* renamed from: a */
    void mo100806a(int i, List<Float> list, boolean z) throws IOException;

    /* renamed from: b */
    void mo100807b(int i, Object obj) throws IOException;

    /* renamed from: c */
    void mo100808c(int i, int i2) throws IOException;

    @Deprecated
    /* renamed from: d */
    void mo100809d(int i, List<?> list) throws IOException;

    /* renamed from: e */
    void mo100810e(int i, List<String> list) throws IOException;

    /* renamed from: f */
    void mo100811f(int i, String str) throws IOException;

    /* renamed from: g */
    void mo100812g(int i, long j) throws IOException;

    /* renamed from: h */
    void mo100813h(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: i */
    void mo100814i(int i, int i2) throws IOException;

    /* renamed from: j */
    void mo100815j(int i, long j) throws IOException;

    /* renamed from: k */
    void mo100816k(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: l */
    void mo100817l(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: m */
    void mo100818m(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: n */
    void mo100819n(int i, long j) throws IOException;

    /* renamed from: o */
    void mo100820o(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: p */
    void mo100821p(int i, int i2) throws IOException;

    /* renamed from: q */
    void mo100822q(int i, double d) throws IOException;

    /* renamed from: r */
    void mo100823r(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: s */
    void mo100824s(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: t */
    void mo100825t(int i, long j) throws IOException;

    /* renamed from: u */
    FieldOrder mo100826u();

    /* renamed from: v */
    void mo100827v(int i, List<?> list) throws IOException;

    /* renamed from: w */
    void mo100828w(int i, Object obj) throws IOException;

    /* renamed from: x */
    void mo100829x(int i, long j) throws IOException;

    /* renamed from: y */
    void mo100830y(int i, boolean z) throws IOException;

    /* renamed from: z */
    void mo100831z(int i, int i2) throws IOException;
}
