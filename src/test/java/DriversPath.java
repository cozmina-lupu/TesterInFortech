import org.apache.commons.lang3.SystemUtils;

class DriversPath {

    String getDriverDirPath() {
        return System.getProperty("user.dir") + "/src/test/resources/drivers/" + this.getDriverDir();
    }

    private String getDriverDir() {
        return (SystemUtils.IS_OS_WINDOWS) ? "windows/" : "mac/";
    }

    String getDriverExtension() {
        return (SystemUtils.IS_OS_WINDOWS) ? ".exe" : "";
    }
}
