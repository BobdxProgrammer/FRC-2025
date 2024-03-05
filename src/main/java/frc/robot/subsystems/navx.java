import edu.wpi.first.wpilibj.SPI;
import com.kauailabs.navx.frc.AHRS;

public class Robot extends SubsystemBase{
    AHRS navx;

    public Robot() {
        try {
            navx = new AHRS(SPI.Port.kMXP); 
        } catch (RuntimeException ex) {
            System.out.println("Error instantiating navX MXP: " + ex.getMessage());
        }
    }

    public void autonomousInit() {
        // Reset the gyro angle before autonomous starts
        navx.reset();
    }

    public void autonomousPeriodic() {
        // Get the current angle of the robot
        double angle = navx.getAngle();
    }

    public void teleopPeriodic() {
        double angle = navx.getAngle();
    }
}
