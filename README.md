# container-quickstart
A template repository for deploying a Springboot API (Auth Included)

## Prerequisites
- [Pulumi](https://www.pulumi.com/docs/get-started/install/)
- [Google Cloud User](https://cloud.google.com/iam/docs/creating-managing-service-accounts)
- Optional for Api Gateway: [AWS User](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users_create.html)

## Getting Started
1. Create a new repository using this template
2. Click the `Deploy to Pulumi` button below \
[![Deploy](https://get.pulumi.com/new/button.svg)](https://app.pulumi.com/new?template=https://github.com/TazBruce/pulumi-quickstart-template)
3. Follow the instructions to create a new Pulumi stack
4. Once the stack is created, you can view the resources in the Pulumi console
5. While in Pulumi, click on the `Settings` tab and then `Deploy`
6. Update `Github Repository` to point to the repository you created in step 1
7. Update `Branch` to point to the branch you want to deploy
8. Update `Pulumi.yaml folder` to `infra`
9. Scroll to the bottom and click `Save deployment configuration`
10. Pull the repo locally 
11. Open `Pulumi.yaml` and make sure the name matches the name of the project you created in step 3 
12. While in the infra directory, run `pulumi config refresh` to pull the latest config from the stack
13. Update the following repository files to your project details:
- app/build.gradle ~ group (Change xyz to your app name)
- app/src/main ~ xyz folder (Change xyz to your name)
- app/src/test ~ xyz folder (Change xyz to your name)
- Make sure the package name in the above files matches the folder name