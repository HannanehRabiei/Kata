package codewars;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TotalPointsTest {

    private TotalPoints totalPoints;

    @BeforeEach
    void setUp() {
        totalPoints = new TotalPoints();
    }

    @Test
    void Bayad_zamani_ke_team1_az_team2_bozorg_tar_bod_adad_30_ro_bargardone() {

        String[] array = {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"};
        int points = totalPoints.points(array);
        Assertions.assertThat(points).isEqualTo(30);
    }

    @Test
    void Bayad_zamani_ke_team1_ba_team2_mosavi_bod_adad_10_ro_bargardone() {

        String[] array = {"1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4"};
        int points = totalPoints.points(array);
        Assertions.assertThat(points).isEqualTo(10);
    }

    @Test
    void Bayad_zamani_ke_team1_az_team2_kochak_tar_bod_adad_0_ro_bargardone() {

        String[] array = {"0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4"};
        int points = totalPoints.points(array);
        Assertions.assertThat(points).isEqualTo(0);
    }

    @Test
    void name1() {

        String[] array = {"1:0", "2:0", "3:0", "4:0", "2:1", "1:3", "1:4", "2:3", "2:4", "3:4"};
        int points = totalPoints.points(array);
        Assertions.assertThat(points).isEqualTo(15);
    }
    @Test
    void name2() {

        String[] array = {"1:0","2:0","3:0","4:4","2:2","3:3","1:4","2:3","2:4","3:4"};
        int points = totalPoints.points(array);
        Assertions.assertThat(points).isEqualTo(12);
    }
}