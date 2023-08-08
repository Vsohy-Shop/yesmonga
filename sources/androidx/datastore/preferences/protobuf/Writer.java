package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18868t1;
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
    void mo54206A(int i) throws IOException;

    /* renamed from: B */
    void mo54207B(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: C */
    void mo54208C(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: D */
    void mo54209D(int i, List<Boolean> list, boolean z) throws IOException;

    @Deprecated
    /* renamed from: E */
    void mo54210E(int i, Object obj) throws IOException;

    /* renamed from: F */
    void mo54211F(int i, float f) throws IOException;

    @Deprecated
    /* renamed from: G */
    void mo54212G(int i) throws IOException;

    /* renamed from: H */
    void mo54213H(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: I */
    void mo54214I(int i, int i2) throws IOException;

    /* renamed from: J */
    void mo54215J(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: K */
    void mo54216K(int i, List<Double> list, boolean z) throws IOException;

    /* renamed from: L */
    void mo54217L(int i, int i2) throws IOException;

    /* renamed from: M */
    void mo54218M(int i, List<ByteString> list) throws IOException;

    @Deprecated
    /* renamed from: N */
    void mo54219N(int i, List<?> list, C18905x2 x2Var) throws IOException;

    /* renamed from: O */
    void mo54220O(int i, ByteString byteString) throws IOException;

    /* renamed from: P */
    void mo54221P(int i, Object obj, C18905x2 x2Var) throws IOException;

    /* renamed from: Q */
    <K, V> void mo54222Q(int i, C18868t1.C18870b<K, V> bVar, Map<K, V> map) throws IOException;

    @Deprecated
    /* renamed from: R */
    void mo54223R(int i, Object obj, C18905x2 x2Var) throws IOException;

    /* renamed from: S */
    void mo54224S(int i, List<?> list, C18905x2 x2Var) throws IOException;

    /* renamed from: a */
    void mo54225a(int i, List<Float> list, boolean z) throws IOException;

    /* renamed from: b */
    void mo54226b(int i, Object obj) throws IOException;

    /* renamed from: c */
    void mo54227c(int i, int i2) throws IOException;

    @Deprecated
    /* renamed from: d */
    void mo54228d(int i, List<?> list) throws IOException;

    /* renamed from: e */
    void mo54229e(int i, List<String> list) throws IOException;

    /* renamed from: f */
    void mo54230f(int i, String str) throws IOException;

    /* renamed from: g */
    void mo54231g(int i, long j) throws IOException;

    /* renamed from: h */
    void mo54232h(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: i */
    void mo54233i(int i, int i2) throws IOException;

    /* renamed from: j */
    void mo54234j(int i, long j) throws IOException;

    /* renamed from: k */
    void mo54235k(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: l */
    void mo54236l(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: m */
    void mo54237m(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: n */
    void mo54238n(int i, long j) throws IOException;

    /* renamed from: o */
    void mo54239o(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: p */
    void mo54240p(int i, int i2) throws IOException;

    /* renamed from: q */
    void mo54241q(int i, double d) throws IOException;

    /* renamed from: r */
    void mo54242r(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: s */
    void mo54243s(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: t */
    void mo54244t(int i, long j) throws IOException;

    /* renamed from: u */
    FieldOrder mo54245u();

    /* renamed from: v */
    void mo54246v(int i, List<?> list) throws IOException;

    /* renamed from: w */
    void mo54247w(int i, Object obj) throws IOException;

    /* renamed from: x */
    void mo54248x(int i, long j) throws IOException;

    /* renamed from: y */
    void mo54249y(int i, boolean z) throws IOException;

    /* renamed from: z */
    void mo54250z(int i, int i2) throws IOException;
}
