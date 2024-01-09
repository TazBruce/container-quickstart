# container-quickstart
A template repository for deploying a Springboot API (Auth Included)

## Prerequisites
- [Pulumi](https://www.pulumi.com/docs/get-started/install/)
- [Google Cloud User](https://cloud.google.com/iam/docs/creating-managing-service-accounts)
- Optional for Api Gateway: [AWS User](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users_create.html)

## Getting Started
1. Create a new repository using this template
2. Update the following repository files to your project details:
   - app/build.gradle ~ group (Change xyz to your app name)
   - app/src/main ~ xyz folder (Change xyz to your name)
   - app/src/test ~ xyz folder (Change xyz to your name)
   - Make sure the package name in the above files matches the folder name
3. Click the `Deploy to Pulumi` button below \
[![Deploy](https://get.pulumi.com/new/button.svg)](https://app.pulumi.com/new?template=https://github.com/TazBruce/pulumi-quickstart-template)
4. Follow the instructions to create a new Pulumi stack