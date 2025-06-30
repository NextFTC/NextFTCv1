plugins {
    kotlin("jvm")
    id("java-library")
}

description = "The base for NextFTC, a user-friendly library for FTC. Includes commands, components, and subsystems."

nextFTCPublishing {
    displayName = "NextFTC Core"
    logoPath = "../assets/logo-icon.svg"
}

kotlin {
    jvmToolchain(8)
}