package chapter12.section5

// Traits furthest to the right take prescedence so in this Queue, filtering is done first and then incrementing
class CrazyQueue extends IntQueue with Incrementing with Filtering {
}