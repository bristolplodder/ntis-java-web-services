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
 * <p>Java class for VmsDatexPictogramEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VmsDatexPictogramEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="accident"/>
 *     &lt;enumeration value="advisorySpeed"/>
 *     &lt;enumeration value="animalsOnRoad"/>
 *     &lt;enumeration value="blankVoid"/>
 *     &lt;enumeration value="bridgeClosed"/>
 *     &lt;enumeration value="bridgeSwingInOperation"/>
 *     &lt;enumeration value="carParkFull"/>
 *     &lt;enumeration value="carParkSpacesAvailable"/>
 *     &lt;enumeration value="carriagewayNarrows"/>
 *     &lt;enumeration value="carriagewayNarrowsOnTheLeft"/>
 *     &lt;enumeration value="carriagewayNarrowsOnTheRight"/>
 *     &lt;enumeration value="carriagewayReducedToOneLane"/>
 *     &lt;enumeration value="carriagewayReducedToTwoLanes"/>
 *     &lt;enumeration value="carriagewayReducedToThreeLanes"/>
 *     &lt;enumeration value="chainsOrSnowTyresRecommended"/>
 *     &lt;enumeration value="compulsoryMinimumSpeed"/>
 *     &lt;enumeration value="crossWind"/>
 *     &lt;enumeration value="dangerOfFire"/>
 *     &lt;enumeration value="drivingOfVehiclesLessThanXMetresApartProhibited"/>
 *     &lt;enumeration value="endOfAdvisorySpeed"/>
 *     &lt;enumeration value="endOfCompulsoryMinimumSpeed"/>
 *     &lt;enumeration value="endOfProhibitionOfOvertaking"/>
 *     &lt;enumeration value="endOfProhibitionOfOvertakingForGoodsVehicles"/>
 *     &lt;enumeration value="endOfSpeedLimit"/>
 *     &lt;enumeration value="exitClosed"/>
 *     &lt;enumeration value="fallingRocks"/>
 *     &lt;enumeration value="fastenChildrensSeatBelts"/>
 *     &lt;enumeration value="fastenYourSeatBelt"/>
 *     &lt;enumeration value="fire"/>
 *     &lt;enumeration value="floodingOrFlashFloods"/>
 *     &lt;enumeration value="fog"/>
 *     &lt;enumeration value="footballMatch"/>
 *     &lt;enumeration value="hardShoulderNotRunning"/>
 *     &lt;enumeration value="hardShoulderRunning"/>
 *     &lt;enumeration value="keepASafeDistance"/>
 *     &lt;enumeration value="keepLeft"/>
 *     &lt;enumeration value="keepRight"/>
 *     &lt;enumeration value="lane1ClosedOf2"/>
 *     &lt;enumeration value="lane2ClosedOf2"/>
 *     &lt;enumeration value="lane1ClosedOf3"/>
 *     &lt;enumeration value="lane3ClosedOf3"/>
 *     &lt;enumeration value="lanes1And2ClosedOf3"/>
 *     &lt;enumeration value="lanes2And3ClosedOf3"/>
 *     &lt;enumeration value="lane1ClosedOf4"/>
 *     &lt;enumeration value="lane4ClosedOf4"/>
 *     &lt;enumeration value="lanes1And2ClosedOf4"/>
 *     &lt;enumeration value="lanes3And4ClosedOf4"/>
 *     &lt;enumeration value="lanes1And2And3ClosedOf4"/>
 *     &lt;enumeration value="lanes2And3And4ClosedOf4"/>
 *     &lt;enumeration value="laneClosed"/>
 *     &lt;enumeration value="laneDeviationToLeft"/>
 *     &lt;enumeration value="laneDeviationToRight"/>
 *     &lt;enumeration value="laneOpen"/>
 *     &lt;enumeration value="leftHandLaneClosed"/>
 *     &lt;enumeration value="lightSignals"/>
 *     &lt;enumeration value="looseGravel"/>
 *     &lt;enumeration value="maintenanceVehicleInAction"/>
 *     &lt;enumeration value="maximumSpeedLimitedToTheFigureIndicated"/>
 *     &lt;enumeration value="narrowLanesAead"/>
 *     &lt;enumeration value="noEntry"/>
 *     &lt;enumeration value="noEntryForAnyPowerDrivenVehicleDrawingATrailer"/>
 *     &lt;enumeration value="noEntryForAnyPowerDrivenVehicleDrawingATrailerOtherThanASemiTrailerOrASingleAxleTrailer"/>
 *     &lt;enumeration value="noEntryForGoodsVehicles"/>
 *     &lt;enumeration value="noEntryForVehiclesExceedingXTonnesLadenMass"/>
 *     &lt;enumeration value="noEntryForVehiclesHavingAMassExceedingXTonnesOnOneAxle"/>
 *     &lt;enumeration value="noEntryForVehiclesHavingAnOverallHeightExceedingXMetres"/>
 *     &lt;enumeration value="noEntryForVehiclesHavingAnOverallLengthExceedingXMetres"/>
 *     &lt;enumeration value="noEntryForVehiclesHavingAnOverallWidthExceedingXMetres"/>
 *     &lt;enumeration value="noEntryForVehiclesCarryingDangerousGoods"/>
 *     &lt;enumeration value="otherDangers"/>
 *     &lt;enumeration value="overtakingByGoodsVehiclesProhibited"/>
 *     &lt;enumeration value="overtakingProhibited"/>
 *     &lt;enumeration value="pollutionOrSmogAlert"/>
 *     &lt;enumeration value="queue"/>
 *     &lt;enumeration value="rain"/>
 *     &lt;enumeration value="rightHandLaneClosed"/>
 *     &lt;enumeration value="roadClosedAhead"/>
 *     &lt;enumeration value="roadworks"/>
 *     &lt;enumeration value="slipperyRoad"/>
 *     &lt;enumeration value="smoke"/>
 *     &lt;enumeration value="snow"/>
 *     &lt;enumeration value="snowChainsCompulsory"/>
 *     &lt;enumeration value="snowTyresCompulsory"/>
 *     &lt;enumeration value="snowPloughInAction"/>
 *     &lt;enumeration value="speedCamerasInAction"/>
 *     &lt;enumeration value="trafficCongestion"/>
 *     &lt;enumeration value="trafficDeviatedToOppositeCarriagewayAhead"/>
 *     &lt;enumeration value="trafficPartiallyDeviatedToOppositeCarriagewayAhead"/>
 *     &lt;enumeration value="tunnelClosed"/>
 *     &lt;enumeration value="turnLeft"/>
 *     &lt;enumeration value="turnRight"/>
 *     &lt;enumeration value="twoWayTraffic"/>
 *     &lt;enumeration value="unevenRoad"/>
 *     &lt;enumeration value="vehicleFire"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VmsDatexPictogramEnum")
@XmlEnum
public enum VmsDatexPictogramEnum {


    /**
     * Accident.
     * 
     */
    @XmlEnumValue("accident")
    ACCIDENT("accident"),

    /**
     * Advisory speed limit.
     * 
     */
    @XmlEnumValue("advisorySpeed")
    ADVISORY_SPEED("advisorySpeed"),

    /**
     * Animal(s) on the road.
     * 
     */
    @XmlEnumValue("animalsOnRoad")
    ANIMALS_ON_ROAD("animalsOnRoad"),

    /**
     * Blank or void.
     * 
     */
    @XmlEnumValue("blankVoid")
    BLANK_VOID("blankVoid"),

    /**
     * Bridge closed.
     * 
     */
    @XmlEnumValue("bridgeClosed")
    BRIDGE_CLOSED("bridgeClosed"),

    /**
     * Bridge swing in operation.
     * 
     */
    @XmlEnumValue("bridgeSwingInOperation")
    BRIDGE_SWING_IN_OPERATION("bridgeSwingInOperation"),

    /**
     * Car park full.
     * 
     */
    @XmlEnumValue("carParkFull")
    CAR_PARK_FULL("carParkFull"),

    /**
     * Spaces available in car park.
     * 
     */
    @XmlEnumValue("carParkSpacesAvailable")
    CAR_PARK_SPACES_AVAILABLE("carParkSpacesAvailable"),

    /**
     * The carriageway narrows ahead.
     * 
     */
    @XmlEnumValue("carriagewayNarrows")
    CARRIAGEWAY_NARROWS("carriagewayNarrows"),

    /**
     * The carriageway narrows ahead from the left.
     * 
     */
    @XmlEnumValue("carriagewayNarrowsOnTheLeft")
    CARRIAGEWAY_NARROWS_ON_THE_LEFT("carriagewayNarrowsOnTheLeft"),

    /**
     * The carriageway narrows ahead from the right.
     * 
     */
    @XmlEnumValue("carriagewayNarrowsOnTheRight")
    CARRIAGEWAY_NARROWS_ON_THE_RIGHT("carriagewayNarrowsOnTheRight"),

    /**
     * Carriageway reduced to one lane.
     * 
     */
    @XmlEnumValue("carriagewayReducedToOneLane")
    CARRIAGEWAY_REDUCED_TO_ONE_LANE("carriagewayReducedToOneLane"),

    /**
     * Carriageway reduced to two lanes.
     * 
     */
    @XmlEnumValue("carriagewayReducedToTwoLanes")
    CARRIAGEWAY_REDUCED_TO_TWO_LANES("carriagewayReducedToTwoLanes"),

    /**
     * Carriageway reduced to three lanes.
     * 
     */
    @XmlEnumValue("carriagewayReducedToThreeLanes")
    CARRIAGEWAY_REDUCED_TO_THREE_LANES("carriagewayReducedToThreeLanes"),

    /**
     * Chains or snow tyres are recommended.
     * 
     */
    @XmlEnumValue("chainsOrSnowTyresRecommended")
    CHAINS_OR_SNOW_TYRES_RECOMMENDED("chainsOrSnowTyresRecommended"),

    /**
     * Mandatory minimum speed limit.
     * 
     */
    @XmlEnumValue("compulsoryMinimumSpeed")
    COMPULSORY_MINIMUM_SPEED("compulsoryMinimumSpeed"),

    /**
     * Cross wind.
     * 
     */
    @XmlEnumValue("crossWind")
    CROSS_WIND("crossWind"),

    /**
     * Danger of fire.
     * 
     */
    @XmlEnumValue("dangerOfFire")
    DANGER_OF_FIRE("dangerOfFire"),

    /**
     * The driving of vehicles less than X metres apart is prohibited.
     * 
     */
    @XmlEnumValue("drivingOfVehiclesLessThanXMetresApartProhibited")
    DRIVING_OF_VEHICLES_LESS_THAN_X_METRES_APART_PROHIBITED("drivingOfVehiclesLessThanXMetresApartProhibited"),

    /**
     * End of advisory speed.
     * 
     */
    @XmlEnumValue("endOfAdvisorySpeed")
    END_OF_ADVISORY_SPEED("endOfAdvisorySpeed"),

    /**
     * End of compulsory minimum speed limit.
     * 
     */
    @XmlEnumValue("endOfCompulsoryMinimumSpeed")
    END_OF_COMPULSORY_MINIMUM_SPEED("endOfCompulsoryMinimumSpeed"),

    /**
     * End of prohibition of overtaking.
     * 
     */
    @XmlEnumValue("endOfProhibitionOfOvertaking")
    END_OF_PROHIBITION_OF_OVERTAKING("endOfProhibitionOfOvertaking"),

    /**
     * End of prohibition of overtaking for goods vehicles.
     * 
     */
    @XmlEnumValue("endOfProhibitionOfOvertakingForGoodsVehicles")
    END_OF_PROHIBITION_OF_OVERTAKING_FOR_GOODS_VEHICLES("endOfProhibitionOfOvertakingForGoodsVehicles"),

    /**
     * End of mandatory speed limit.
     * 
     */
    @XmlEnumValue("endOfSpeedLimit")
    END_OF_SPEED_LIMIT("endOfSpeedLimit"),

    /**
     * Exit closed.
     * 
     */
    @XmlEnumValue("exitClosed")
    EXIT_CLOSED("exitClosed"),

    /**
     * Danger of rock fall or landslide.
     * 
     */
    @XmlEnumValue("fallingRocks")
    FALLING_ROCKS("fallingRocks"),

    /**
     * Fasten the seat belts of children.
     * 
     */
    @XmlEnumValue("fastenChildrensSeatBelts")
    FASTEN_CHILDRENS_SEAT_BELTS("fastenChildrensSeatBelts"),

    /**
     * Fasten your seat belt.
     * 
     */
    @XmlEnumValue("fastenYourSeatBelt")
    FASTEN_YOUR_SEAT_BELT("fastenYourSeatBelt"),

    /**
     * Fire.
     * 
     */
    @XmlEnumValue("fire")
    FIRE("fire"),

    /**
     * Flooding or flash floods.
     * 
     */
    @XmlEnumValue("floodingOrFlashFloods")
    FLOODING_OR_FLASH_FLOODS("floodingOrFlashFloods"),

    /**
     * Fog.
     * 
     */
    @XmlEnumValue("fog")
    FOG("fog"),

    /**
     * Football match (current or anticipated disruption due to football match).
     * 
     */
    @XmlEnumValue("footballMatch")
    FOOTBALL_MATCH("footballMatch"),

    /**
     * Hard shoulder running is in operation.
     * 
     */
    @XmlEnumValue("hardShoulderNotRunning")
    HARD_SHOULDER_NOT_RUNNING("hardShoulderNotRunning"),

    /**
     * Hard shoulder running is not in operation.
     * 
     */
    @XmlEnumValue("hardShoulderRunning")
    HARD_SHOULDER_RUNNING("hardShoulderRunning"),

    /**
     * Keep a safe distance.
     * 
     */
    @XmlEnumValue("keepASafeDistance")
    KEEP_A_SAFE_DISTANCE("keepASafeDistance"),

    /**
     * Keep left.
     * 
     */
    @XmlEnumValue("keepLeft")
    KEEP_LEFT("keepLeft"),

    /**
     * Keep right.
     * 
     */
    @XmlEnumValue("keepRight")
    KEEP_RIGHT("keepRight"),

    /**
     * Lane 1 closed on a 2 lane carriageway. Lanes numbered from nearside (next to hard shoulder on motorway) to central median.
     * 
     */
    @XmlEnumValue("lane1ClosedOf2")
    LANE_1_CLOSED_OF_2("lane1ClosedOf2"),

    /**
     * Lane 2 closed on a 2 lane carriageway. Lanes numbered from nearside (next to hard shoulder on motorway) to central median.
     * 
     */
    @XmlEnumValue("lane2ClosedOf2")
    LANE_2_CLOSED_OF_2("lane2ClosedOf2"),

    /**
     * Lane 1 closed on a 3 lane carriageway. Lanes numbered from nearside (next to hard shoulder on motorway) to central median.
     * 
     */
    @XmlEnumValue("lane1ClosedOf3")
    LANE_1_CLOSED_OF_3("lane1ClosedOf3"),

    /**
     * Lane 3 closed on a 3 lane carriageway. Lanes numbered from nearside (next to hard shoulder on motorway) to central median.
     * 
     */
    @XmlEnumValue("lane3ClosedOf3")
    LANE_3_CLOSED_OF_3("lane3ClosedOf3"),

    /**
     * Lanes 1 and 2 closed on a 3 lane carriageway. Lanes numbered from nearside (next to hard shoulder on motorway) to central median.
     * 
     */
    @XmlEnumValue("lanes1And2ClosedOf3")
    LANES_1_AND_2_CLOSED_OF_3("lanes1And2ClosedOf3"),

    /**
     * Lanes 2 and 3 closed on a 3 lane carriageway. Lanes numbered from nearside (next to hard shoulder on motorway) to central median.
     * 
     */
    @XmlEnumValue("lanes2And3ClosedOf3")
    LANES_2_AND_3_CLOSED_OF_3("lanes2And3ClosedOf3"),

    /**
     * Lane 1 closed on a 4 lane carriageway. Lanes numbered from nearside (next to hard shoulder on motorway) to central median.
     * 
     */
    @XmlEnumValue("lane1ClosedOf4")
    LANE_1_CLOSED_OF_4("lane1ClosedOf4"),

    /**
     * Lane 4 closed on a 4 lane carriageway. Lanes numbered from nearside (next to hard shoulder on motorway) to central median.
     * 
     */
    @XmlEnumValue("lane4ClosedOf4")
    LANE_4_CLOSED_OF_4("lane4ClosedOf4"),

    /**
     * Lanes 1 and 2 closed on a 4 lane carriageway. Lanes numbered from nearside (next to hard shoulder on motorway) to central median.
     * 
     */
    @XmlEnumValue("lanes1And2ClosedOf4")
    LANES_1_AND_2_CLOSED_OF_4("lanes1And2ClosedOf4"),

    /**
     * Lanes 3 and 4 closed on a 4 lane carriageway. Lanes numbered from nearside (next to hard shoulder on motorway) to central median.
     * 
     */
    @XmlEnumValue("lanes3And4ClosedOf4")
    LANES_3_AND_4_CLOSED_OF_4("lanes3And4ClosedOf4"),

    /**
     * Lanes 1, 2 and 3 closed on a 4 lane carriageway. Lanes numbered from nearside (next to hard shoulder on motorway) to central median.
     * 
     */
    @XmlEnumValue("lanes1And2And3ClosedOf4")
    LANES_1_AND_2_AND_3_CLOSED_OF_4("lanes1And2And3ClosedOf4"),

    /**
     * Lanes 2, 3 and 4 closed on a 4 lane carriageway. Lanes numbered from nearside (next to hard shoulder on motorway) to central median.
     * 
     */
    @XmlEnumValue("lanes2And3And4ClosedOf4")
    LANES_2_AND_3_AND_4_CLOSED_OF_4("lanes2And3And4ClosedOf4"),

    /**
     * Lane closed.
     * 
     */
    @XmlEnumValue("laneClosed")
    LANE_CLOSED("laneClosed"),

    /**
     * Lane deviates to the left.
     * 
     */
    @XmlEnumValue("laneDeviationToLeft")
    LANE_DEVIATION_TO_LEFT("laneDeviationToLeft"),

    /**
     * Lane deviates to the right.
     * 
     */
    @XmlEnumValue("laneDeviationToRight")
    LANE_DEVIATION_TO_RIGHT("laneDeviationToRight"),

    /**
     * Lane open.
     * 
     */
    @XmlEnumValue("laneOpen")
    LANE_OPEN("laneOpen"),

    /**
     * Left hand lane closed ahead.
     * 
     */
    @XmlEnumValue("leftHandLaneClosed")
    LEFT_HAND_LANE_CLOSED("leftHandLaneClosed"),

    /**
     * Traffic light signals ahead.
     * 
     */
    @XmlEnumValue("lightSignals")
    LIGHT_SIGNALS("lightSignals"),

    /**
     * Loose gravel.
     * 
     */
    @XmlEnumValue("looseGravel")
    LOOSE_GRAVEL("looseGravel"),

    /**
     * Maintenance vehicles in action.
     * 
     */
    @XmlEnumValue("maintenanceVehicleInAction")
    MAINTENANCE_VEHICLE_IN_ACTION("maintenanceVehicleInAction"),

    /**
     * Mandatory maximum speed limit, displayed as speed limit indside a red circle.
     * 
     */
    @XmlEnumValue("maximumSpeedLimitedToTheFigureIndicated")
    MAXIMUM_SPEED_LIMITED_TO_THE_FIGURE_INDICATED("maximumSpeedLimitedToTheFigureIndicated"),

    /**
     * Narrow lanes ahead.
     * 
     */
    @XmlEnumValue("narrowLanesAead")
    NARROW_LANES_AEAD("narrowLanesAead"),

    /**
     * No entry.
     * 
     */
    @XmlEnumValue("noEntry")
    NO_ENTRY("noEntry"),

    /**
     * No entry for any power driven vehicle drawing a trailer
     * 
     */
    @XmlEnumValue("noEntryForAnyPowerDrivenVehicleDrawingATrailer")
    NO_ENTRY_FOR_ANY_POWER_DRIVEN_VEHICLE_DRAWING_A_TRAILER("noEntryForAnyPowerDrivenVehicleDrawingATrailer"),

    /**
     * No entry to any power driven vehicle drawing a trailer other than a semi-trailer or a single axle trailer. A semi-trailer is one designed to be coupled to a motor vehicle so that part of its weight and that of its load is borne by the motor vehicle.
     * 
     */
    @XmlEnumValue("noEntryForAnyPowerDrivenVehicleDrawingATrailerOtherThanASemiTrailerOrASingleAxleTrailer")
    NO_ENTRY_FOR_ANY_POWER_DRIVEN_VEHICLE_DRAWING_A_TRAILER_OTHER_THAN_A_SEMI_TRAILER_OR_A_SINGLE_AXLE_TRAILER("noEntryForAnyPowerDrivenVehicleDrawingATrailerOtherThanASemiTrailerOrASingleAxleTrailer"),

    /**
     * No entry for goods vehicles.
     * 
     */
    @XmlEnumValue("noEntryForGoodsVehicles")
    NO_ENTRY_FOR_GOODS_VEHICLES("noEntryForGoodsVehicles"),

    /**
     * No entry for vehicles exceeding X tonnes laden mass.
     * 
     */
    @XmlEnumValue("noEntryForVehiclesExceedingXTonnesLadenMass")
    NO_ENTRY_FOR_VEHICLES_EXCEEDING_X_TONNES_LADEN_MASS("noEntryForVehiclesExceedingXTonnesLadenMass"),

    /**
     * No entry for vehicles having a mass exceeding X tonnes on a single axle.
     * 
     */
    @XmlEnumValue("noEntryForVehiclesHavingAMassExceedingXTonnesOnOneAxle")
    NO_ENTRY_FOR_VEHICLES_HAVING_A_MASS_EXCEEDING_X_TONNES_ON_ONE_AXLE("noEntryForVehiclesHavingAMassExceedingXTonnesOnOneAxle"),

    /**
     * No entry for vehicles having an overall height exceeding X metres.
     * 
     */
    @XmlEnumValue("noEntryForVehiclesHavingAnOverallHeightExceedingXMetres")
    NO_ENTRY_FOR_VEHICLES_HAVING_AN_OVERALL_HEIGHT_EXCEEDING_X_METRES("noEntryForVehiclesHavingAnOverallHeightExceedingXMetres"),

    /**
     * No entry for vehicles having an overall length exceeding X metres.
     * 
     */
    @XmlEnumValue("noEntryForVehiclesHavingAnOverallLengthExceedingXMetres")
    NO_ENTRY_FOR_VEHICLES_HAVING_AN_OVERALL_LENGTH_EXCEEDING_X_METRES("noEntryForVehiclesHavingAnOverallLengthExceedingXMetres"),

    /**
     * No entry for vehicles having an overall width exceeding X metres.
     * 
     */
    @XmlEnumValue("noEntryForVehiclesHavingAnOverallWidthExceedingXMetres")
    NO_ENTRY_FOR_VEHICLES_HAVING_AN_OVERALL_WIDTH_EXCEEDING_X_METRES("noEntryForVehiclesHavingAnOverallWidthExceedingXMetres"),

    /**
     * No entry for vehicles carrying dangerous goods.
     * 
     */
    @XmlEnumValue("noEntryForVehiclesCarryingDangerousGoods")
    NO_ENTRY_FOR_VEHICLES_CARRYING_DANGEROUS_GOODS("noEntryForVehiclesCarryingDangerousGoods"),

    /**
     * Danger ahead of an unspecified nature.
     * 
     */
    @XmlEnumValue("otherDangers")
    OTHER_DANGERS("otherDangers"),

    /**
     * Overtaking prohibited for goods vehicles.
     * 
     */
    @XmlEnumValue("overtakingByGoodsVehiclesProhibited")
    OVERTAKING_BY_GOODS_VEHICLES_PROHIBITED("overtakingByGoodsVehiclesProhibited"),

    /**
     * Overtaking prohibited.
     * 
     */
    @XmlEnumValue("overtakingProhibited")
    OVERTAKING_PROHIBITED("overtakingProhibited"),

    /**
     * Pollution or smog alert.
     * 
     */
    @XmlEnumValue("pollutionOrSmogAlert")
    POLLUTION_OR_SMOG_ALERT("pollutionOrSmogAlert"),

    /**
     * Queue ahead.
     * 
     */
    @XmlEnumValue("queue")
    QUEUE("queue"),

    /**
     * Rain.
     * 
     */
    @XmlEnumValue("rain")
    RAIN("rain"),

    /**
     * Right hand lane closed ahead.
     * 
     */
    @XmlEnumValue("rightHandLaneClosed")
    RIGHT_HAND_LANE_CLOSED("rightHandLaneClosed"),

    /**
     * Road closed ahead.
     * 
     */
    @XmlEnumValue("roadClosedAhead")
    ROAD_CLOSED_AHEAD("roadClosedAhead"),

    /**
     * Roadworks.
     * 
     */
    @XmlEnumValue("roadworks")
    ROADWORKS("roadworks"),

    /**
     * Slippery road.
     * 
     */
    @XmlEnumValue("slipperyRoad")
    SLIPPERY_ROAD("slipperyRoad"),

    /**
     * Smoke.
     * 
     */
    @XmlEnumValue("smoke")
    SMOKE("smoke"),

    /**
     * Snow.
     * 
     */
    @XmlEnumValue("snow")
    SNOW("snow"),

    /**
     * The use of snow chains is compulsory.
     * 
     */
    @XmlEnumValue("snowChainsCompulsory")
    SNOW_CHAINS_COMPULSORY("snowChainsCompulsory"),

    /**
     * The use of snow tyres is compulsory.
     * 
     */
    @XmlEnumValue("snowTyresCompulsory")
    SNOW_TYRES_COMPULSORY("snowTyresCompulsory"),

    /**
     * Snow plough(s) in action.
     * 
     */
    @XmlEnumValue("snowPloughInAction")
    SNOW_PLOUGH_IN_ACTION("snowPloughInAction"),

    /**
     * Speed cameras in action.
     * 
     */
    @XmlEnumValue("speedCamerasInAction")
    SPEED_CAMERAS_IN_ACTION("speedCamerasInAction"),

    /**
     * Traffic congestion and possible queues.
     * 
     */
    @XmlEnumValue("trafficCongestion")
    TRAFFIC_CONGESTION("trafficCongestion"),

    /**
     * All traffic is diverted to the opposite carriageway ahead in a contraflow layout.
     * 
     */
    @XmlEnumValue("trafficDeviatedToOppositeCarriagewayAhead")
    TRAFFIC_DEVIATED_TO_OPPOSITE_CARRIAGEWAY_AHEAD("trafficDeviatedToOppositeCarriagewayAhead"),

    /**
     * Traffic is partially diverted to the opposite carriageway ahead in a contraflow layout.
     * 
     */
    @XmlEnumValue("trafficPartiallyDeviatedToOppositeCarriagewayAhead")
    TRAFFIC_PARTIALLY_DEVIATED_TO_OPPOSITE_CARRIAGEWAY_AHEAD("trafficPartiallyDeviatedToOppositeCarriagewayAhead"),

    /**
     * Tunnel closed.
     * 
     */
    @XmlEnumValue("tunnelClosed")
    TUNNEL_CLOSED("tunnelClosed"),

    /**
     * Mandatory turn left.
     * 
     */
    @XmlEnumValue("turnLeft")
    TURN_LEFT("turnLeft"),

    /**
     * Mandatory turn right.
     * 
     */
    @XmlEnumValue("turnRight")
    TURN_RIGHT("turnRight"),

    /**
     * Two way traffic (on a single carriageway).
     * 
     */
    @XmlEnumValue("twoWayTraffic")
    TWO_WAY_TRAFFIC("twoWayTraffic"),

    /**
     * Uneven road surface.
     * 
     */
    @XmlEnumValue("unevenRoad")
    UNEVEN_ROAD("unevenRoad"),

    /**
     * Vehicle fire.
     * 
     */
    @XmlEnumValue("vehicleFire")
    VEHICLE_FIRE("vehicleFire"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    VmsDatexPictogramEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VmsDatexPictogramEnum fromValue(String v) {
        for (VmsDatexPictogramEnum c: VmsDatexPictogramEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}