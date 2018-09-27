package seedu.address.testutil;

import java.util.HashSet;
import java.util.Set;

import seedu.address.model.ride.Address;
import seedu.address.model.ride.Email;
import seedu.address.model.ride.Name;
import seedu.address.model.ride.Maintenance;
import seedu.address.model.ride.Ride;
import seedu.address.model.tag.Tag;
import seedu.address.model.util.SampleDataUtil;

/**
 * A utility class to help with building Ride objects.
 */
public class RideBuilder {

    public static final String DEFAULT_NAME = "Alice Pauline";
    public static final String DEFAULT_MAINTENANCE = "85355255";
    public static final String DEFAULT_EMAIL = "alice@gmail.com";
    public static final String DEFAULT_ADDRESS = "123, Jurong West Ave 6, #08-111";
    public static final String DEFAULT_DIFFERENTNAME = "Alice";

    private Name name;
    private Maintenance maintenance;
    private Email email;
    private Address address;
    private Set<Tag> tags;
    private Name differentName;

    public RideBuilder() {
        name = new Name(DEFAULT_NAME);
        maintenance = new Maintenance(DEFAULT_MAINTENANCE);
        email = new Email(DEFAULT_EMAIL);
        address = new Address(DEFAULT_ADDRESS);
        tags = new HashSet<>();
        differentName = new Name(DEFAULT_DIFFERENTNAME);
    }

    /**
     * Initializes the RideBuilder with the data of {@code rideToCopy}.
     */
    public RideBuilder(Ride rideToCopy) {
        name = rideToCopy.getName();
        maintenance = rideToCopy.getDaysSinceMaintenance();
        email = rideToCopy.getEmail();
        address = rideToCopy.getAddress();
        tags = new HashSet<>(rideToCopy.getTags());
    }

    /**
     * Sets the {@code Name} of the {@code Ride} that we are building.
     */
    public RideBuilder withName(String name) {
        this.name = new Name(name);
        return this;
    }

    /**
     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code Ride} that we are building.
     */
    public RideBuilder withTags(String ... tags) {
        this.tags = SampleDataUtil.getTagSet(tags);
        return this;
    }

    /**
     * Sets the {@code Address} of the {@code Ride} that we are building.
     */
    public RideBuilder withAddress(String address) {
        this.address = new Address(address);
        return this;
    }

    /**
     * Sets the {@code Maintenance} of the {@code Ride} that we are building.
     */
    public RideBuilder withMaintenance(String daysSinceLastMaintenanceString) {
        this.maintenance = new Maintenance(daysSinceLastMaintenanceString);
        return this;
    }

    /**
     * Sets the {@code Email} of the {@code Ride} that we are building.
     */
    public RideBuilder withEmail(String email) {
        this.email = new Email(email);
        return this;
    }

    public Ride build() {
        return new Ride(name, maintenance, email, address, tags);
    }

    public Ride buildDifferent() {
        return new Ride(differentName, maintenance, email, address, tags);
    }

}
