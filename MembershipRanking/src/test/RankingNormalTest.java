package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import sqa.main.Ranking;

public class RankingNormalTest {

    private Ranking ranking;

    @BeforeEach
    void setUp() {
        ranking = new Ranking();
    }

    @Test @DisplayName("TC01 50000 15 0 ระดับ Standard")
    void test_TC01() {
        assertEquals("Standard", ranking.CalculateMembershipRank(50000, 15, 0));
    }

    @Test @DisplayName("TC02 50000 15 1 ระดับ Standard")
    void test_TC02() {
        assertEquals("Standard", ranking.CalculateMembershipRank(50000, 15, 1));
    }

    @Test @DisplayName("TC03 50000 15 500 ระดับ Gold")
    void test_TC03() {
        assertEquals("Gold", ranking.CalculateMembershipRank(50000, 15, 500));
    }

    @Test @DisplayName("TC04 50000 15 999 ระดับ Gold")
    void test_TC04() {
        assertEquals("ระดับ Gold", ranking.CalculateMembershipRank(50000, 15, 999));
    }

    @Test @DisplayName("TC05 50000 15 1000 ระดับ Gold")
    void test_TC05() {
        assertEquals("Gold", ranking.CalculateMembershipRank(50000, 15, 1000));
    }

    @Test @DisplayName("TC06 50000 0 500 ระดับ Silver")
    void test_TC06() {
        assertEquals("Silver", ranking.CalculateMembershipRank(50000, 0, 500));
    }

    @Test @DisplayName("TC07 50000 1 500 ระดับ Silver")
    void test_TC07() {
        assertEquals("Silver", ranking.CalculateMembershipRank(50000, 1, 500));
    }

    @Test @DisplayName("TC08 50000 29 500 ระดับ Gold")
    void test_TC08() {
        assertEquals("Gold", ranking.CalculateMembershipRank(50000, 29, 500));
    }

    @Test @DisplayName("TC09 50000 30 500 ระดับ Gold")
    void test_TC09() {
        assertEquals("Gold", ranking.CalculateMembershipRank(50000, 30, 500));
    }

    @Test @DisplayName("TC10 0 15 500 ระดับ Standard")
    void test_TC10() {
        assertEquals("Standard", ranking.CalculateMembershipRank(0, 15, 500));
    }

    @Test @DisplayName("TC11 1 15 500 ระดับ Standard")
    void test_TC11() {
        assertEquals("Standard", ranking.CalculateMembershipRank(1, 15, 500));
    }

    @Test @DisplayName("TC12 99999 15 500 ระดับ Gold")
    void test_TC12() {
        assertEquals("Gold", ranking.CalculateMembershipRank(99999, 15, 500));
    }

    @Test @DisplayName("TC13 100000 15 500 ระดับ Gold")
    void test_TC13() {
        assertEquals("Gold", ranking.CalculateMembershipRank(100000, 15, 500));
    }
}