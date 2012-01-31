//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.31 at 02:44:31 PM GMT 
//


package com.thales.ntis.subscriber.datex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralInstructionToRoadUsersTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeneralInstructionToRoadUsersTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allowEmergencyVehiclesToPass"/>
 *     &lt;enumeration value="approachWithCare"/>
 *     &lt;enumeration value="avoidTheArea"/>
 *     &lt;enumeration value="closeAllWindowsTurnOffHeaterAndVents"/>
 *     &lt;enumeration value="crossJunctionWithCare"/>
 *     &lt;enumeration value="doNotAllowUnnecessaryGaps"/>
 *     &lt;enumeration value="doNotLeaveYourVehicle"/>
 *     &lt;enumeration value="doNotThrowOutAnyBurningObjects"/>
 *     &lt;enumeration value="doNotUseNavigationSystems"/>
 *     &lt;enumeration value="driveCarefully"/>
 *     &lt;enumeration value="driveWithExtremeCaution"/>
 *     &lt;enumeration value="flashYourLights"/>
 *     &lt;enumeration value="followTheVehicleInFrontSmoothly"/>
 *     &lt;enumeration value="increaseNormalFollowingDistance"/>
 *     &lt;enumeration value="inEmergencyWaitForPatrolService"/>
 *     &lt;enumeration value="keepYourDistance"/>
 *     &lt;enumeration value="leaveYourVehicleProceedToNextSafePlace"/>
 *     &lt;enumeration value="noNakedFlames"/>
 *     &lt;enumeration value="noOvertaking"/>
 *     &lt;enumeration value="noSmoking"/>
 *     &lt;enumeration value="noStopping"/>
 *     &lt;enumeration value="noUturns"/>
 *     &lt;enumeration value="observeAmberAlert"/>
 *     &lt;enumeration value="observeSignals"/>
 *     &lt;enumeration value="observeSigns"/>
 *     &lt;enumeration value="onlyTravelIfAbsolutelyNecessary"/>
 *     &lt;enumeration value="overtakeWithCare"/>
 *     &lt;enumeration value="pullOverToTheEdgeOfTheRoadway"/>
 *     &lt;enumeration value="stopAtNextSafePlace"/>
 *     &lt;enumeration value="stopAtNextServiceArea"/>
 *     &lt;enumeration value="switchOffEngine"/>
 *     &lt;enumeration value="switchOffMobilePhonesAndTwoWayRadios"/>
 *     &lt;enumeration value="testYourBrakes"/>
 *     &lt;enumeration value="useBusService"/>
 *     &lt;enumeration value="useFogLights"/>
 *     &lt;enumeration value="useHazardWarningLights"/>
 *     &lt;enumeration value="useHeadlights"/>
 *     &lt;enumeration value="useRailService"/>
 *     &lt;enumeration value="useTramService"/>
 *     &lt;enumeration value="useUndergroundService"/>
 *     &lt;enumeration value="waitForEscortVehicle"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeneralInstructionToRoadUsersTypeEnum")
@XmlEnum
public enum GeneralInstructionToRoadUsersTypeEnum {


    /**
     * Allow emergency vehicles to pass.
     * 
     */
    @XmlEnumValue("allowEmergencyVehiclesToPass")
    ALLOW_EMERGENCY_VEHICLES_TO_PASS("allowEmergencyVehiclesToPass"),

    /**
     * Approach with care.
     * 
     */
    @XmlEnumValue("approachWithCare")
    APPROACH_WITH_CARE("approachWithCare"),

    /**
     * Drivers are to avoid the area.
     * 
     */
    @XmlEnumValue("avoidTheArea")
    AVOID_THE_AREA("avoidTheArea"),

    /**
     * Close all windows and turn off heater and vents.
     * 
     */
    @XmlEnumValue("closeAllWindowsTurnOffHeaterAndVents")
    CLOSE_ALL_WINDOWS_TURN_OFF_HEATER_AND_VENTS("closeAllWindowsTurnOffHeaterAndVents"),

    /**
     * Cross junction with care.
     * 
     */
    @XmlEnumValue("crossJunctionWithCare")
    CROSS_JUNCTION_WITH_CARE("crossJunctionWithCare"),

    /**
     * Do not allow unnecessary gaps.
     * 
     */
    @XmlEnumValue("doNotAllowUnnecessaryGaps")
    DO_NOT_ALLOW_UNNECESSARY_GAPS("doNotAllowUnnecessaryGaps"),

    /**
     * Do not leave your vehicle.
     * 
     */
    @XmlEnumValue("doNotLeaveYourVehicle")
    DO_NOT_LEAVE_YOUR_VEHICLE("doNotLeaveYourVehicle"),

    /**
     * Do not throw out any burning objects.
     * 
     */
    @XmlEnumValue("doNotThrowOutAnyBurningObjects")
    DO_NOT_THROW_OUT_ANY_BURNING_OBJECTS("doNotThrowOutAnyBurningObjects"),

    /**
     * Do not use navigation systems to determine routing.
     * 
     */
    @XmlEnumValue("doNotUseNavigationSystems")
    DO_NOT_USE_NAVIGATION_SYSTEMS("doNotUseNavigationSystems"),

    /**
     * Drive carefully.
     * 
     */
    @XmlEnumValue("driveCarefully")
    DRIVE_CAREFULLY("driveCarefully"),

    /**
     * Drive with extreme caution.
     * 
     */
    @XmlEnumValue("driveWithExtremeCaution")
    DRIVE_WITH_EXTREME_CAUTION("driveWithExtremeCaution"),

    /**
     * Flash your lights to warn oncoming traffic of hazard ahead.
     * 
     */
    @XmlEnumValue("flashYourLights")
    FLASH_YOUR_LIGHTS("flashYourLights"),

    /**
     * Follow the vehicle in front, smoothly.
     * 
     */
    @XmlEnumValue("followTheVehicleInFrontSmoothly")
    FOLLOW_THE_VEHICLE_IN_FRONT_SMOOTHLY("followTheVehicleInFrontSmoothly"),

    /**
     * Increase normal following distance.
     * 
     */
    @XmlEnumValue("increaseNormalFollowingDistance")
    INCREASE_NORMAL_FOLLOWING_DISTANCE("increaseNormalFollowingDistance"),

    /**
     * In emergency, wait for patrol service (either road operator or police patrol service).
     * 
     */
    @XmlEnumValue("inEmergencyWaitForPatrolService")
    IN_EMERGENCY_WAIT_FOR_PATROL_SERVICE("inEmergencyWaitForPatrolService"),

    /**
     * Keep your distance.
     * 
     */
    @XmlEnumValue("keepYourDistance")
    KEEP_YOUR_DISTANCE("keepYourDistance"),

    /**
     * Leave your vehicle and proceed to next safe place.
     * 
     */
    @XmlEnumValue("leaveYourVehicleProceedToNextSafePlace")
    LEAVE_YOUR_VEHICLE_PROCEED_TO_NEXT_SAFE_PLACE("leaveYourVehicleProceedToNextSafePlace"),

    /**
     * No naked flames.
     * 
     */
    @XmlEnumValue("noNakedFlames")
    NO_NAKED_FLAMES("noNakedFlames"),

    /**
     * No overtaking on the specified section of road.
     * 
     */
    @XmlEnumValue("noOvertaking")
    NO_OVERTAKING("noOvertaking"),

    /**
     * No smoking.
     * 
     */
    @XmlEnumValue("noSmoking")
    NO_SMOKING("noSmoking"),

    /**
     * No stopping.
     * 
     */
    @XmlEnumValue("noStopping")
    NO_STOPPING("noStopping"),

    /**
     * No U-turns.
     * 
     */
    @XmlEnumValue("noUturns")
    NO_UTURNS("noUturns"),

    /**
     * Observe current amber alert (an emergency alert issued for a missing or abducted child).
     * 
     */
    @XmlEnumValue("observeAmberAlert")
    OBSERVE_AMBER_ALERT("observeAmberAlert"),

    /**
     * Observe signals.
     * 
     */
    @XmlEnumValue("observeSignals")
    OBSERVE_SIGNALS("observeSignals"),

    /**
     * Observe signs.
     * 
     */
    @XmlEnumValue("observeSigns")
    OBSERVE_SIGNS("observeSigns"),

    /**
     * Only travel if absolutely necessary.
     * 
     */
    @XmlEnumValue("onlyTravelIfAbsolutelyNecessary")
    ONLY_TRAVEL_IF_ABSOLUTELY_NECESSARY("onlyTravelIfAbsolutelyNecessary"),

    /**
     * Overtake with care.
     * 
     */
    @XmlEnumValue("overtakeWithCare")
    OVERTAKE_WITH_CARE("overtakeWithCare"),

    /**
     * Pull over to the edge of the roadway.
     * 
     */
    @XmlEnumValue("pullOverToTheEdgeOfTheRoadway")
    PULL_OVER_TO_THE_EDGE_OF_THE_ROADWAY("pullOverToTheEdgeOfTheRoadway"),

    /**
     * Stop at next safe place.
     * 
     */
    @XmlEnumValue("stopAtNextSafePlace")
    STOP_AT_NEXT_SAFE_PLACE("stopAtNextSafePlace"),

    /**
     * Stop at next rest service area or car park.
     * 
     */
    @XmlEnumValue("stopAtNextServiceArea")
    STOP_AT_NEXT_SERVICE_AREA("stopAtNextServiceArea"),

    /**
     * Switch off engine.
     * 
     */
    @XmlEnumValue("switchOffEngine")
    SWITCH_OFF_ENGINE("switchOffEngine"),

    /**
     * Switch off mobile phones and two-way radios.
     * 
     */
    @XmlEnumValue("switchOffMobilePhonesAndTwoWayRadios")
    SWITCH_OFF_MOBILE_PHONES_AND_TWO_WAY_RADIOS("switchOffMobilePhonesAndTwoWayRadios"),

    /**
     * Test your brakes.
     * 
     */
    @XmlEnumValue("testYourBrakes")
    TEST_YOUR_BRAKES("testYourBrakes"),

    /**
     * Use bus service.
     * 
     */
    @XmlEnumValue("useBusService")
    USE_BUS_SERVICE("useBusService"),

    /**
     * Use fog lights.
     * 
     */
    @XmlEnumValue("useFogLights")
    USE_FOG_LIGHTS("useFogLights"),

    /**
     * Use hazard warning lights.
     * 
     */
    @XmlEnumValue("useHazardWarningLights")
    USE_HAZARD_WARNING_LIGHTS("useHazardWarningLights"),

    /**
     * Use headlights.
     * 
     */
    @XmlEnumValue("useHeadlights")
    USE_HEADLIGHTS("useHeadlights"),

    /**
     * Use rail service.
     * 
     */
    @XmlEnumValue("useRailService")
    USE_RAIL_SERVICE("useRailService"),

    /**
     * Use tram service.
     * 
     */
    @XmlEnumValue("useTramService")
    USE_TRAM_SERVICE("useTramService"),

    /**
     * Use underground service.
     * 
     */
    @XmlEnumValue("useUndergroundService")
    USE_UNDERGROUND_SERVICE("useUndergroundService"),

    /**
     * Wait for escort vehicle.
     * 
     */
    @XmlEnumValue("waitForEscortVehicle")
    WAIT_FOR_ESCORT_VEHICLE("waitForEscortVehicle"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    GeneralInstructionToRoadUsersTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeneralInstructionToRoadUsersTypeEnum fromValue(String v) {
        for (GeneralInstructionToRoadUsersTypeEnum c: GeneralInstructionToRoadUsersTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}